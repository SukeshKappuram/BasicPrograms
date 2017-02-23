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
public class FinallyExample {
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
                    System.out.println("u hav to pass valid input");
                }
                finally
                {
                    System.out.println("I am finally block ");
                    System.out.println("I can execute if exception occured or not ");
                }
	    	System.out.println("Program execution ends ");
	}
}
