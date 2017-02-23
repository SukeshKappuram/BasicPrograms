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
public class DataStreamExample {
    public static void main(String args[]) throws IOException
	{
		int sno;	
		String sname;
		float avg;
		DataInputStream dis= new DataInputStream(System.in);
		System.out.println("Enter student no :");
		sno=Integer.parseInt(dis.readLine());
		System.out.println("Enter student name :");	
		sname=dis.readLine();
		System.out.println("Enter avg :");
		avg=Float.parseFloat(dis.readLine());
	
		System.out.println("sno       is :"+sno);
		System.out.println("sname  is :"+sname);
		System.out.println("avg       is :"+avg);
                
                DataOutputStream dos= new DataOutputStream(new FileOutputStream(args[0]));
                System.out.println("Enter data into the file");
		String str=dis.readLine();
		dos.writeBytes(str);
		System.out.println("File created success fully");
		dos.close();
		dis.close();
	}
}
