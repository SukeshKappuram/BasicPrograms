/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package corejavaexamples.innerclasses;

/**
 *
 * @author iamsu
 */
public class InnerClassExample {
    public static void main(String ar[])
    {
            MyOuterClass oob=new MyOuterClass();
            MyOuterClass.MyInnerClass inob1=oob.new MyInnerClass();
            MyOuterClass.MyInnerClass inob2=new MyOuterClass().new MyInnerClass();
            inob1.innerMethod();
            oob.innerMethodAccess();
    }
}
class MyOuterClass
{
	private int x=10;
	class MyInnerClass
	{
	private int y=10;
		public void innerMethod()
		{
		System.out.println("innerMethod");
		System.out.println("outer private "+x);
		
		display();
		outerMethod();
		}
		public void display()
		{
		System.out.println("InnerDisplay");
		MyOuterClass.this.display();
		}
	}
	public void outerMethod()
	{
		System.out.println("OuterMethod");
	}
	public void display()
	{
		System.out.println("OuterDisplay");
	}
	public void innerMethodAccess()
	{
		MyInnerClass iob=new MyInnerClass();
		iob.y=20;
		System.out.println("Outer->Private-innerVariable :"+iob.y);
	}
	
}