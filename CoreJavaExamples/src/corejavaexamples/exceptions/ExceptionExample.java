/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package corejavaexamples.exceptions;

import java.util.Scanner;

/**
 *
 * @author iamsu
 */
public class ExceptionExample {
    public static void main(String args[])
	{
	       try
	       {
                Scanner s =new Scanner(System.in);
                System.out.println("Program execution starts ");
		int n=s.nextInt();
		System.out.println("n val is :"+n);
	       }
	       catch(Exception e)
               {
		System.out.println(e);
		System.out.println("U hav to pass num");
               }
               System.out.println("Program execution ends ");
	}
}
