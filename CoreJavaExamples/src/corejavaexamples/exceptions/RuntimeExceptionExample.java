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
public class RuntimeExceptionExample {
    public static void main(String args[])
    {
	         try
	         {
                    System.out.println("program execution starts");
                    int a=Integer.parseInt(args[0]);
                    int b=Integer.parseInt(args[1]);
                    int c=a/b;
                    System.out.println("Result is :"+c);
                }
                catch(ArrayIndexOutOfBoundsException e)
	        {
                    System.out.println(e);
                    System.out.println("U hav to pass arguments");
                }
                catch(ArithmeticException e)
                {
                    System.out.println(e);
                    System.out.println("divide by zero is not posssible ");
                }
                catch(Exception e)
                {
                    System.out.println(e);
                    System.out.println("Please pass nums > 0");
                }
		System.out.println("Program execution ends");
    }
}
