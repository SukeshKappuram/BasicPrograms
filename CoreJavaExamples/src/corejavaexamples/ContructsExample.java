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
public class ContructsExample {
    public static void main(String[] arg){
        int a=10,b=20,c=3;
        if(true){
            System.out.println("the condition is true");
            //Nested if 
            if(a>b && b>c){
                System.out.println("a is greater");
            }
            else if(b>c){
                System.out.println("b is greater");
            }
            else{
                System.out.println("c is greater");
            }
        }
        else{
            System.out.println("the condition is true");
            
            switch(c){
                case 1:System.out.println("Its 1");break;
                case 2:System.out.println("Its 2");break;
                case 3:System.out.println("Its 3");break;
                default:System.out.println("its not 1 2 3");
            }
        }
    }
}
