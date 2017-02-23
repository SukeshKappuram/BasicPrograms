/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package corejavaexamples.oops;

/**
 *
 * @author iamsu
 */
public class ConstructorExample {
    public static void main(String[] arg){
        Student s1=new Student();
        Student s2=new Student(101,"Virat Kohli",99.9f);
        
        System.out.println(s1.getStudentId());
        System.out.println(s2.getStudentId());
    }
}
class Student{
    private int studentId;
    private String name;
    private float marks;
                
    Student(){
        System.out.println("i am a default Cons");
    }

    public Student(int studentId, String name, float marks) {
        this.studentId = studentId;
        this.name = name;
        this.marks = marks;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public float getMarks() {
        return marks;
    }
    
    
}