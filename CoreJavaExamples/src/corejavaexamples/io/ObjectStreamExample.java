/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package corejavaexamples.io;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author iamsu
 */
public class ObjectStreamExample  implements  Serializable
{
	int eno;
	String ename;
	int sal;
	void readEmployee()
	{
                Scanner s= new Scanner(System.in);
		System.out.println("enter sno ");
		eno=s.nextInt();
		System.out.println("enter sname ");
		ename=s.next();
		System.out.println("Enter sal ");
		sal=s.nextInt();		
	}
	void printEmployee()
	{
		System.out.println("eno is :"+eno);
		System.out.println("ename is :"+ename);
		System.out.println("sal is :"+sal);
	}
        public static void main(String args[])
	{
	      try
	      {
		ObjectStreamExample e1= new ObjectStreamExample();
		e1.readEmployee();
		//Serialization
		OutputStream os=new FileOutputStream("store.dat");
		ObjectOutputStream oos= new ObjectOutputStream(os);
		oos.writeObject(e1);
		System.out.println("Serialization completed");
		os.close();
		oos.close();
		
		//Deserialisation
		InputStream is=new FileInputStream("store.dat");
		ObjectInputStream ois=new ObjectInputStream(is);
		ObjectStreamExample e2= (ObjectStreamExample) ois.readObject();
		e2.printEmployee();
		is.close();
		ois.close();
		System.out.println("DeSerialization completed");
	         }
	         catch(Exception e)
	         {
		System.out.println(e);
	          }
	}
}
