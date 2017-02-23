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
public class StaticInnerClassExample {
    public static void main(String ar[])
    {
            MyStaticOuterClass.MyInnerClass iob=new MyStaticOuterClass.MyInnerClass();
            iob.display();
    }
}
class MyStaticOuterClass
{
	int rel=500;
	static class MyInnerClass{
            public void display()
            {
                System.out.println("InnerDisplay");
            }
	}
}