/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package corejavaexamples;

/**
 *
 * @author iamsu
 */
public class VarArgsExample {
    public int add(int... var){
        int sum=0;
	
	for(int i:var){
		sum+=i;
	}
    return sum;
    }
    public static void main(String[] arg)
    {
	VarArgsExample c=new VarArgsExample();
	System.out.println(c.add(8));
	System.out.println(c.add(4,6,1,3));
	System.out.println(c.add(9,7,3,8,6,4,1));
    }
}
