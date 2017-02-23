/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package corejavaexamples.oops.casting;

/**
 *
 * @author iamsu
 */
public class PrimitiveCastingExample {
    public static void main(String args[])
    {
		byte b=20;
		int i=b;
		System.out.println("b val is ="+b);
		System.out.println("i val is ="+i);
                
                i=300;
		b=(byte)i;
		System.out.println("i val is :"+i);
		System.out.println("b val is :"+b);
    }
}
