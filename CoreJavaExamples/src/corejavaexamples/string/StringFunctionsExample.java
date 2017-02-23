/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package corejavaexamples.string;

/**
 *
 * @author iamsu
 */
public class StringFunctionsExample {
    public static void main(String[] arg){
        String tc01 = "It was the best of times";
        String tc02 = "It was the worst of times";
        if (tc01.equals(tc02)){
            System.out.println("Strings match..."); }
        if (tc01.contains("It was")){
            System.out.println("It was found"); 
        }
        
        String temp = tc02.replace("w", "zw");
        
        System.out.println(temp);
        System.out.println(tc02.substring(5, 12));
        
        String s1="    Virat Kohli    ";
        System.out.println("length :"+s1.length());
		
        String s2=s1.trim();
        System.out.println("length :"+s2.length());
        
        System.out.println("Upper Case "+s1.toUpperCase());
        System.out.println("Lower Case "+s1.toLowerCase());
    }
}
