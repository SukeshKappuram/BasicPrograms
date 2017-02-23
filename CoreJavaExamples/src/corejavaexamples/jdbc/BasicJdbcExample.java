/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package corejavaexamples.jdbc;

import java.sql.*;

/**
 * Type 1 Driver : Jdbc - Odbc
 * 
 * @author iamsu
 */
public class BasicJdbcExample {
   public static void main(String[] arg) throws ClassNotFoundException,SQLException{
       //Class.forName("sun.java.jdbc.odbc.JdbcOdbcDriver");
       Connection con=DriverManager.getConnection("jdbc:odbc:mydsn");
       Statement st=con.createStatement();
       String str="Select * from Student order by lastname desc";
       ResultSet rs=st.executeQuery(str);
       while(rs.next()){
           System.out.print(rs.getInt(1)+" ");
           System.out.print(rs.getString(2)+" ");
           System.out.print(rs.getString(3)+" ");
           System.out.print(rs.getString(4)+" ");
           System.out.print(rs.getString(5)+" ");
           System.out.println(rs.getString(6));
       }
   }
}
