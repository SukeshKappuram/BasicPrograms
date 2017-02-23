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
public class FileExample {
    public static void main(String args[]) throws IOException
    {
        File f = new File("D:/Dump/qwerty.txt");

        System.out.println("exists : " + f.exists());
        System.out.println("getabspath : " + f.getAbsolutePath());
        System.out.println("getname : " + f.getName());
        System.out.println("getpath : " + f.getPath());
        System.out.println("isDirectory : " + f.isDirectory());
        System.out.println("isFile : " + f.isFile());
        System.out.println("length : " + f.length());
        System.out.println("isHidden : " + f.isHidden());
        System.out.println("can read : " + f.canRead());
        System.out.println("can write : " + f.canWrite());
        boolean flag=f.delete();
		if(flag)
		{
		  System.out.println("folder/file deleted success fully");
		}
		else
		{
		          System.out.println("folder/file deletion error");
		}
    }
}
