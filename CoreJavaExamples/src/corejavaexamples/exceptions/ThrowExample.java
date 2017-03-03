/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package corejavaexamples.exceptions;
import java.util.*;
/**
 *
 * @author iamsu
 */
/*throw
it is used to create the exception wherever u want.if we want to create exception we hav to use throw keyword.
*/
public class ThrowExample {
    public static void main(String args[])
	{
	      try
	      {
		System.out.println("program execution starts");
		int n;
		System.out.println("enter n value");
		Scanner s= new Scanner(System.in);
		n=s.nextInt();
		if(n>0)
		{
			System.out.println("n val is :"+n);
		}
		else
		{
			throw new ArithmeticException();	
		}
                //some Code
	         }
	          catch(Exception e)
	          {
		System.out.println(e);
		System.out.println("plz enter +ve nos");
	          }
		System.out.println("program execution ends");

	}
}