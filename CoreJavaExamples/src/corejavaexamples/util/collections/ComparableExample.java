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

class ComparableStudent implements Comparable<ComparableStudent>{
    private String name; 
    private long id = 0; 
    private double gpa = 0.0;
    public ComparableStudent(String name, long id, double gpa){
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
    public int compareTo(ComparableStudent s){
        int result = this.name.compareTo(s.getName());
        if (result > 0) { return 1; }
        else if (result < 0){ return -1; }
        else { return 0; }
    }
}
public class ComparableExample {
    public static void main(String[] args){
        Set<ComparableStudent> studentList = new TreeSet<>();
        studentList.add(new ComparableStudent("Thomas Jefferson", 1111, 3.8));
        studentList.add(new ComparableStudent("John Adams", 2222, 3.9));
        studentList.add(new ComparableStudent("George Washington", 3333, 3.4));
        for(ComparableStudent student:studentList){
            System.out.println(student.getName()); 
        }
    }
}

