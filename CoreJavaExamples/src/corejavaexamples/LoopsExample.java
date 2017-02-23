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
public class LoopsExample {
    public static void main(String[] arg){
        int i=0;
        while(i<10){
            System.out.println("value of i is "+i);
            i++;
        }
        
        do{
            System.out.println("value of i is "+i);
        }while(i<10);
        
        for(i=10;i>0;i--){
            System.out.println("value of i is "+i);
        }
    }
}
