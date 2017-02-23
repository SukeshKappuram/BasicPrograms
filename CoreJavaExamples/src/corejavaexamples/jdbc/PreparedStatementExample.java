/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package corejavaexamples.jdbc;

import java.util.Scanner;
import java.sql.*;
/**
 *
 * @author iamsu
 */
public class PreparedStatementExample {
    public static void main(String[] arg) throws SQLException{
        Scanner s=new Scanner(System.in);
        String str1="insert into Student (firstName,LastName) values (?,?)";
        String str2="select * from Student where Id=?";
        Connection con=DriverManager.getConnection("jdbc:odbc:mydsn");
        con.setAutoCommit(false);
        PreparedStatement ps=con.prepareStatement(str1);
        ps.setString(1, s.next());
        ps.setString(2, s.next());
        int x=ps.executeUpdate();
        con.commit();
        con.setAutoCommit(true);
        x=s.nextInt();
        ps=con.prepareStatement(str2);
        ps.setInt(1, x);
        ResultSet rs=ps.executeQuery();
        while(rs.next()){
           System.out.print(rs.getInt(1)+" ");
           System.out.print(rs.getString(2)+" ");
           System.out.print(rs.getString(3)+" ");
           System.out.print(rs.getString(4)+" ");
           System.out.print(rs.getString(5)+" ");
           System.out.print(rs.getString(6));
       }
        
    }
}
