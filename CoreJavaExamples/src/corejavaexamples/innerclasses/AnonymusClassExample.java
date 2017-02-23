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
public class AnonymusClassExample {
    public static void main(String ar[])
    {
            MyOuterrClass iob=new MyOuterrClass();
            iob.oob.display();
			
            iob.ob.display();
            MyInnerClass oob1=new MyInnerClass();
            oob1.display();
    }
}
class MyInnerClass
{
	public void display()
	{
		System.out.println("OuterDisplay");
	}
}
class MyOuterrClass
{
	MyInnerClass oob=new MyInnerClass(){
		public void display()
		{
		System.out.println("AnonymousInnerDisplay");
		}
	};
	MyInnerClass ob=new MyInnerClass(){
		public void display()
		{
		System.out.println("NextAnonymousInnerDisplay");
		}
	};
}