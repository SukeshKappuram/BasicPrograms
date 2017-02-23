/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package corejavaexamples.io;

import java.io.*;

/**
 *
 * @author iamsu
 */
public class BufferExample {
	public static void main(String args[]) throws IOException
	{	
            int x,y,res;
            char[] cbuf = "ABCDEFGHIJKLMN".toCharArray();
            
            //create buffered reader
            BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter x value :");
		x=Integer.parseInt(br.readLine());
            System.out.println("Enter y value :");
		y=Integer.parseInt(br.readLine());
	
		res=x+y;
            System.out.println("x   val is :"+x);
            System.out.println("y   val is :"+y);
            System.out.println("res   val is :"+res);
            
            // create string writer
            StringWriter sw = new StringWriter();
            //create buffered writer
            BufferedWriter bw = new BufferedWriter(sw);
            // write from specified character buffer to stream
            bw.write(cbuf, 2, 5);
         
            // forces out the characters to string writer
            bw.flush();
         
            // string buffer is created
            StringBuffer sb = sw.getBuffer();
         
            //prints the string
            System.out.println(sb);
      
        }
        
}
