/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package corejavaexamples.jdbc;

import com.sun.rowset.CachedRowSetImpl;
import com.sun.rowset.FilteredRowSetImpl;
import java.sql.*;
import javax.sql.*;
import javax.sql.rowset.FilteredRowSet;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.Predicate;
import javax.sql.rowset.RowSetProvider;

/**
 *
 * @author iamsu
 */
public class RowSetExample {
    public static void main(String[] args) throws Exception {  
        Class.forName("oracle.jdbc.driver.OracleDriver");  
        String url="jdbc:oracle:thin:@localhost:1521:xe";
        String user="hr",pwd="hr",command="select EMPLOYEE_ID,FIRST_NAME,SALARY from employees where ROWNUM <=5";
    //Creating and Executing RowSet  
        JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();  
        rowSet.setUrl(url);  
        rowSet.setUsername(user);  
        rowSet.setPassword(pwd);  
                   
        rowSet.setCommand(command);  
        rowSet.execute();  
        
        //Adding Listener and moving RowSet  
        rowSet.addRowSetListener(new MyListener());  
                   
            while (rowSet.next()) {  
                        // Generating cursor Moved event  
                        System.out.println("Id: " + rowSet.getInt(1));  
                        System.out.println("Name: " + rowSet.getString(2));  
                        System.out.println("Salary: " + rowSet.getString(3));  
            } 
            
            Connection con=DriverManager.getConnection(url,user,pwd);
            Statement st=con.createStatement();
            ResultSet resultSet = st.executeQuery(command);

         // create CachedRowSet and populate
                CachedRowSetImpl crs = new CachedRowSetImpl();
                crs.populate(resultSet);

         // note that the connection is being closed
         con.close();

            while(crs.next()){
                    System.out.println(crs.getRow());
                        System.out.println("Id: " + crs.getString(1));  
                        System.out.println("Name: " + crs.getString(2));  
                        System.out.println("Salary: " + crs.getString(3)); 
            }
            FilteredRowSet frs = new FilteredRowSetImpl();
            frs.setUsername(user);
            frs.setPassword(pwd);
            frs.setUrl(url);
            frs.setCommand(command);
            frs.execute();

            System.out.println("--- Unfiltered RowSet: ---");
            while (frs.next()) {
                System.out.println(frs.getRow() + " - " + frs.getInt(1) + ":" + frs.getString(2)+ ":" + frs.getString("Salary"));
            }
            // create a filter that restricts entries in
            // the age column to be between 7 and 10
            SalaryFilter filter = new SalaryFilter(7000, 20000, 3);

            // set the filter.
            frs.beforeFirst();
            frs.setFilter(filter);

            // go to the beginning of the Rowset
            System.out.println("--- Filtered RowSet: ---");

    // show filtered data
    while (frs.next()) {
      System.out.println(frs.getRow() + " - " + frs.getInt(1) + ":" + frs.getString(2)+ ":" + frs.getString("Salary"));
    }

    System.out.println("--- Try to insert new records ---");

    // Try to add an employee with Salary = 13000 (allowed by filter)
    frs.moveToInsertRow();
    frs.updateInt(1, 994);
    frs.updateString(2, "Andre");
    frs.updateInt(3, 13000);
    frs.insertRow();
    frs.moveToCurrentRow();
    frs.acceptChanges();

    // try to add an survey with Salary = 6500 (not allowed by filter)
    frs.moveToInsertRow();
    frs.updateInt(1, 123);
    frs.updateString(2, "Jeff");
    frs.updateInt(3, 6500);
    frs.insertRow();
    frs.moveToCurrentRow();
    frs.acceptChanges();

    // scroll to first row of rowset
    frs.beforeFirst();
    // display rows in FilteredRowset
    while (frs.next()) {
      System.out.println(frs.getRow() + " - " + frs.getInt(1) + ":" + frs.getString(2)+ ":" + frs.getString("Salary"));
    }

    frs.close();
    st.close();
    frs.close();
        }  
}
class MyListener implements RowSetListener {  
      public void cursorMoved(RowSetEvent event) {  
                System.out.println("Cursor Moved...");  
      }  
     public void rowChanged(RowSetEvent event) {  
                System.out.println("Cursor Changed...");  
     }  
     public void rowSetChanged(RowSetEvent event) {  
                System.out.println("RowSet changed...");  
     }  
}  

class SalaryFilter implements Predicate {
  private int lowSalary;

  private int highSalary;

  private int columnIndex;

  private String columnName;

    public SalaryFilter(int lowSalary, int highSalary, int columnIndex, String columnName) {
        this.lowSalary = lowSalary;
        this.highSalary = highSalary;
        this.columnIndex = columnIndex;
        this.columnName = columnName;
    }

  public SalaryFilter(int lowSalary, int highSalary, int columnIndex) {
        this(lowSalary, highSalary, columnIndex, "Salary");
    }

  public boolean evaluate(Object value, String columnName) {
    boolean evaluation = true;
    if (columnName.equalsIgnoreCase(this.columnName)) {
      int columnValue = ((Integer) value).intValue();
      if ((columnValue >= this.lowSalary) && (columnValue <= this.highSalary)) {
        evaluation = true;
      } else {
        evaluation = false;
      }
    }
    return evaluation;
  }

  public boolean evaluate(Object value, int columnNumber) {
    boolean evaluation = true;
    if (columnIndex == columnNumber) {
      int columnValue = ((Integer) value).intValue();
      if ((columnValue >= this.lowSalary) && (columnValue <= this.highSalary)) {
        evaluation = true;
      } else {
        evaluation = false;
      }
    }
    return evaluation;
  }

  public boolean evaluate(RowSet rs) {
    if (rs == null) {
      return false;
    }

    FilteredRowSet frs = (FilteredRowSet) rs;
    boolean evaluation = false;
    try {
      int columnValue = frs.getInt(this.columnIndex);
      if ((columnValue >= this.lowSalary) && (columnValue <= this.highSalary)) {
        evaluation = true;
      }
    } catch (SQLException e) {
      return false;
    }
    return evaluation;
  }
}
