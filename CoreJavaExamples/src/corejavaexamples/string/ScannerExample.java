/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package corejavaexamples.string;

import java.util.Scanner;

/**
 *
 * @author iamsu
 */
public class ScannerExample {
    public static void main(String[] arg){
        String str="1.1,2.2,3.3,4.4";//1.1+2.2 1.12.2 3.3
        /*Scanner s1=new Scanner(System.in).useDelimiter(",");
        while(s1.hasNext()){
            System.out.println(s1.next());
        }*/
        
        Scanner s2=new Scanner(str).useDelimiter(",");
        float num,sum=0.0f;
        while(s2.hasNextFloat()){
            num=s2.nextFloat();
            System.out.println(num);
            sum+=num;
        }
        System.out.println("Total is "+sum);
    }
}
