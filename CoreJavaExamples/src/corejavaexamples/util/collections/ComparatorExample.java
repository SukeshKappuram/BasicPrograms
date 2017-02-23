/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package corejavaexamples.util.collections;

import java.util.*;

/**
 *
 * @author iamsu
 */
public class ComparatorExample {
    public static void main(String[] args){
        List<Student> studentList = new ArrayList<>(3);
        Comparator<Student> sortName = new StudentSortName();
        Comparator<Student> sortGpa = new StudentSortGpa();
        
        studentList.add(new Student("Thomas Jefferson", 1111, 3.8));
        studentList.add(new Student("John Adams", 2222, 3.9));
        studentList.add(new Student("George Washington", 3333, 3.4));
        
        Collections.sort(studentList, sortName);
        for(Student student:studentList){
            System.out.println("Sort by Name "+student.getName());
        }
        Collections.sort(studentList, sortGpa);
        for(Student student:studentList){
            System.out.println("Sort by GPA "+student.getName());
        }
    }
}
class StudentSortName implements Comparator<Student>{
    public int compare(Student s1, Student s2){
        int result = s1.getName().compareTo(s2.getName());
        if (result != 0) {
            return result;
        }
        else
        {
            return 0; // Or do more comparing
        }
    }
}

class StudentSortGpa implements Comparator<Student>
{
    public int compare(Student s1, Student s2)
    {
        if (s1.getGpa() < s2.getGpa()) { 
            return 1; 
        }
        else if (s1.getGpa() > s2.getGpa()) 
        { 
            return -1; 
        }
        else 
        {
            return 0; 
        }
    }
}
class Student {
    private String name; 
    private long id = 0; 
    private double gpa = 0.0;
    public Student(String name, long id, double gpa){
        this.name=name;
        this.id=id;
        this.gpa=gpa;
    }
    public String getName(){ 
        return this.name; 
    }

    public long getId() {
        return id;
    }

    public double getGpa() {
        return gpa;
    }
    
}