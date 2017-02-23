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
public class OperatorsExample {
    int num1=20;
    int num2=10;
    public void arithmeticOperators(){
        System.out.println("Sum is "+(num1+num2));
        System.out.println("Diffrence is "+(num1-num2));
        System.out.println("Product is "+(num1*num2));
        System.out.println("Quotient is "+(num1/num2));
        System.out.println("Reminder is "+(num1%num2));
    }
    public void arithmeticAssignmentOperators(){
        System.out.println(num1+=num2);
        System.out.println(num1-=num2);
        System.out.println(num1*=num2);
        System.out.println(num1/=num2);
        System.out.println(num1%=num2);
    }
    public void comparisionOperators(){
        System.out.println(num1>num2);
        System.out.println(num1<num2);
        System.out.println(num1>=num2);
        System.out.println(num1<=num2);
        System.out.println(num1==num2);
        System.out.println(num1!=num2);
    }
    public void logicalOperators(){
        System.out.println(num1>0 && num1<10);
        System.out.println(num2>0 || num2<10);
    }
    public void unaryOperators(){
        System.out.println(num1++);
        System.out.println(++num1);
        System.out.println(num2--);
        System.out.println(--num2);
    }
    public void ternaryOperator(){
        System.out.println("the greatest element is "+((num1>num2)?num1:num2));
    }
    public static void main(String[] arg){
        OperatorsExample oe=new OperatorsExample();
        oe.arithmeticOperators();
        oe.arithmeticAssignmentOperators();
        oe.comparisionOperators();
        oe.logicalOperators();
        oe.unaryOperators();
        oe.ternaryOperator();
    }
}
