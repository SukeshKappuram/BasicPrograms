/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package corejavaexamples.string;

/**
 *
 * @author iamsu
 */
public class StringBufferExample {
    public static void main(String cmtes[])
	{
	StringBuffer a= new StringBuffer(30);
                a.append("John");
		a.append(3547);
                System.out.println("Char at "+a.charAt(6));
                System.out.println("capacity "+a.capacity());
                System.out.println("reverse   :"+a.reverse());
                System.out.println("Delete "+a.deleteCharAt(4));
                
                System.out.println("Index of 'h' "+a.indexOf("h"));
                a.trimToSize();
                System.out.println("Capacity is "+a.capacity()+", Length "+a.length());
	}
}
