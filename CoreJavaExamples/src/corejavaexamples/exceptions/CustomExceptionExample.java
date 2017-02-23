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
public class CustomExceptionExample {
    
 public static void main(String args[])//throws MyException
	{
	     try
	     {
		System.out.println("program execution starts ");
		int n;
                Scanner s= new Scanner(System.in);
		System.out.println("Enter n value");
		n=s.nextInt();
		if(n%2==0)
		{
			System.out.println("n val is :"+n);
		}
		else
		{
			throw new CustomException("Invalid Number");
		}
	       }
		catch(CustomException e)
		{
			System.out.println(e);
			System.out.println(e.getMessage());
		}
		
		System.out.println("program execution ends ");
	}   
}    
class CustomException extends Exception{
    public CustomException(String msg) {
        super(msg);
    }
    @Override
    public String getMessage(){
        return super.getMessage();
    }
}

