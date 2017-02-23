/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package corejavaexamples.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author iamsu
 */
public class Type4Example {
    public static void main(String[] arg) throws ClassNotFoundException,SQLException{
       Class.forName("oracle.jdbc.driver.OracleDriver");
       String url="jdbc:oracle:thin:@localhost:1521:XE";
       String user="hr";
       String pass="hr";
       Connection con=DriverManager.getConnection(url,user,pass);
       Statement st=con.createStatement();
       String str="Select * from Employees";
       ResultSet rs=st.executeQuery(str);
       while(rs.next()){
           System.out.print(rs.getInt(1)+" ");
           System.out.print(rs.getString(2)+" ");
           System.out.print(rs.getString(3)+" ");
           System.out.print(rs.getString(4)+" ");
           System.out.print(rs.getString(5)+" ");
           System.out.println(rs.getString(6));
       }
       String[] tables={"TABLE"};
        DatabaseMetaData dbmd=con.getMetaData();
       ResultSet rs2=dbmd.getTables(null, null, null, tables);
       while(rs2.next()){
           System.out.println(rs2.getString("TABLE_NAME"));
       }
       
        ResultSetMetaData rsmd=rs.getMetaData();
        for(int i=rsmd.getColumnCount();i>0;i--){
            System.out.println("Col name"+rsmd.getColumnName(i)+" "+rsmd.getColumnTypeName(i));
        }
   }
}
