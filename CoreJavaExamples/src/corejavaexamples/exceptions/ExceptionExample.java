/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package corejavaexamples.exceptions;

/**
 *
 * @author iamsu
 */
public class ExceptionExample {
    public static void main(String args[])
	{
	       try
	       {
		System.out.println("Program execution starts ");
		int n=Integer.parseInt(args[0]);
		System.out.println("n val is :"+n);
	       }
	       catch(Exception e)
               {
		System.out.println(e);
		System.out.println("U hav to pass arguments");
               }
               System.out.println("Program execution ends ");
	}
}
