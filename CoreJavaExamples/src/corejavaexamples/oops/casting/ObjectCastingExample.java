/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package corejavaexamples.oops.casting;

/**
 *
 * @author iamsu
 */
public class ObjectCastingExample {
    public static void main(String[] arg){
        Employee e1=new Employee();
        Manager m=(Manager)e1;
        Engineer er=new Engineer();
        Employee e2=er;
    }
}
class Employee{
    private int empId;
    private String ename;
    private float salary;
    
    public void displayDetails(){
        System.out.println("empId "+empId);
        System.out.println("ename "+ename);
        System.out.println("salary "+salary);
    } 
}
class Manager extends Employee{
    
}
class Engineer extends Employee{

}
class Director extends Employee{

}