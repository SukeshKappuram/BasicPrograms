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
public class SuperExample {
    public static void main(String args[])
	{
		//Sample s= new Sample();
		//Sample s1= new Sample(10);

		SubSample ss= new SubSample();
		SubSample ss1= new SubSample(10);


	}
}
class Sample
{
	Sample()
	{
		System.out.println("I am default con of sample");
	}
	Sample(int x)
	{
		System.out.println("I am one para con of sample");
	}
}
class SubSample extends Sample
{
	SubSample()
	{
		//super();it calls base class default con
		System.out.println("I am default con of Subsample");
	}
	SubSample(int x)
	{
		super(10);//it calls base class one para con
		System.out.println("I am one para con of Subsample");
	}
}
