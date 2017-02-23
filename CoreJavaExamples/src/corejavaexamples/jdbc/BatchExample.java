/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package corejavaexamples.jdbc;

import java.sql.*;

/**
 *
 * @author iamsu
 */
public class BatchExample {
    public static void main(String[] arg) throws SQLException{
        Driver d= new com.microsoft.sqlserver.jdbc.SQLServerDriver();
        DriverManager.registerDriver(d);
        try(Connection con=DriverManager.getConnection("jdbc:sqlserver://DESKTOP-H4HBQ7U;databaseName=master;user=sa;password=iluVirat#100");
                Statement st=con.createStatement();){
            con.setAutoCommit(false);
            st.executeUpdate("create table Employee2(empId int,empName varchar(40),Salary float)");
            con.commit();
            st.addBatch("insert into Employee2(empId,empName) values (101,'Rajesh')");
            st.addBatch("insert into Employee2(empId,empName) values (102,'Dhoni')");
            int rows[]=st.executeBatch();
            for(int i:rows){
                System.out.println("Rows updated : "+i);
            }
            con.commit();
            
            PreparedStatement ps=con.prepareStatement("insert into Employee2(empId,empName) values (?,?)");
            ps.setInt(1, 104);
            ps.setString(2, "Karan");
            ps.addBatch();
            ps.setInt(1, 107);
            ps.setString(2, "Ankith");
            ps.addBatch();
            
            rows=ps.executeBatch();
            for(int i:rows){
                System.out.println("Rows updated : "+i);
            }
            con.commit();
        }
    }
}
