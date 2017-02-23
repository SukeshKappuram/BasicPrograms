/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package corejavaexamples.string;

import java.util.StringTokenizer;

/**
 *
 * @author iamsu
 */
public class StringTokenizerExample {
    public static void main(String[] arg){
        String str="Blue Shirt ,Black Shirt ,Red Shirt ,Brown Shirt";
        StringTokenizer st=new StringTokenizer(str," ,");
        String strs[]=str.split(" ,");
        for(String s:strs){
            System.out.println(s);
        }
        
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    } 
}
