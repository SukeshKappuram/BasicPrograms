/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package corejavaexamples.util.collections;

import java.io.*;
import java.util.Properties;

/**
 *
 * @author iamsu
 */
public class PropetiesExample {
    public static void main(String args[]) throws IOException
	{
                Properties p= new Properties();
		System.out.println(p);
		p=System.getProperties();
		//System.out.println(p);
                FileOutputStream fos= new FileOutputStream("myFile.File");
		p.save(fos,"Sukesh");
                System.out.println("Osname :"+p.getProperty("os.name"));
                System.out.println("Osversion :"+p.getProperty("os.version"));
                System.out.println("java version :"+p.getProperty("java.version"));
                System.out.println("Username :"+p.getProperty("user.name"));
                
	}
}
