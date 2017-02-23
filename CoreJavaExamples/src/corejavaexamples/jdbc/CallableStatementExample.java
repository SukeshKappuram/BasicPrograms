/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package corejavaexamples.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

/**
 *
 * @author iamsu
 */
public class CallableStatementExample {
    public static void main(String[] arg) throws SQLException, ClassNotFoundException{
        String str="create Procedure Emp_list2 AS Select * from Employee order by EmpName";
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url="jdbc:sqlserver://DESKTOP-H4HBQ7U;databaseName=master;user=sa;password=iluVirat#100";
        Connection con=DriverManager.getConnection(url);
        Statement st=con.createStatement();
        int i=st.executeUpdate(str);
        
        String sql="exec Emp_list2";
        CallableStatement cst=con.prepareCall(sql);
        ResultSet rs=cst.executeQuery();
        while(rs.next()){
            System.out.println("Emp Name "+rs.getString(2));
        }
    }
}
