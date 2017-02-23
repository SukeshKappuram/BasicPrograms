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
public class ArraysExample {
    public static void main(String[] arg)
    {
        String[] strs=new String[5];
        strs[0]="Hello";
        strs[1]="World";
        strs[2]="Hi";
        strs[3]="How";
        strs[4]="what";
        
        int[] nums=new int[]{34,32,46,45};
        
        for(String s:strs){
            System.out.println(s);
        }
        for(int n:nums){
            System.out.println(n);
        }
    }
}
