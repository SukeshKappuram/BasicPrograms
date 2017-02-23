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
public class ModifiersExample {
    //Mermory is constant and assigned for the class
    static int x; // memory of the variable is not a part of the Object of the Class
    
    //Value is constant and must be assigned while declaration 
    final int y=20;
    
    static final int CONSTANT=30;// pure java constant 
    
     public static void main(String[] args) {
         ModifiersExample me1=new ModifiersExample();
         me1.x=10;
         //me1.y=20;error in assigning the value
         ModifiersExample me2=new ModifiersExample();
         System.out.println(me2.x);//x will be 10 as its memory is constant for all objects 
         System.out.println(me2.y);//y will be 20 as its value is constant for all objects
         // but final and static value can vary from object to object based on initialization
     }
}
