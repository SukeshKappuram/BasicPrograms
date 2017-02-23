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
public class FileStreamExample {
    public static void main(String args[])
	{
	try
	{
	FileInputStream fis= new FileInputStream("MyFile2.txt");//read mode
	FileOutputStream fos= new FileOutputStream("MyFile3.txt");//write mode
		int x=fis.available();		
		for(int i=0;i<x;i++)
		{
                    int xy=fis.read();
                    System.out.println(xy);
                	fos.write(xy);
		}
		System.out.println("File copied success fully");
		fis.close();
		fos.close();
	}
	catch(Exception e)
	{
		System.out.println("file copying error");
	}
	}
}
