/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package corejavaexamples.oops;

/**
 *
 * @author iamsu
 */
public class ThisExample {
    	public static void main(String args[])
	{
		Sample1 s= new Sample1(100,200);
	}
}
class Sample1
{
	Sample1()
	{
		System.out.println("I am default con of sample");
	}
	Sample1(int x)
	{
		this();
		System.out.println("I am one para con of sample");
	}
	Sample1(int x,int y)
	{	
		this(10);
		System.out.println("I am two para con of sample");
	}
}