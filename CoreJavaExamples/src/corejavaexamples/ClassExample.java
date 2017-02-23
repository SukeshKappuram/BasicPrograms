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
public class ClassExample {
    private int variable1; //are accessable inside the same classes only
    public String variable2; //are accessable in all classes 
    protected float variable3; //are accessable inside the sub classes only
    char variable4; // (default) are accessable within same package
 
    public static void main(String[] args) {
        //ClassName object = new(Dynamic memory Allocation) Constructor(used for initializing the memebers of class);
        ClassExample ce=new ClassExample(); // Creation of Object 
    }
}
