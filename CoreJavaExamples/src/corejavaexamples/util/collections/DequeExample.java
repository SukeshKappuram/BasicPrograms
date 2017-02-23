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
public class DequeExample {
    public static void main(String[] arg){
        Deque<Integer> d=new ArrayDeque<>();
        System.out.println("Array is empty "+d.isEmpty());
        d.push(205);
        d.push(403);
        d.push(753);
        d.add(55);
        d.addFirst(95);
        System.out.println("poped "+d.pop());
        d.addLast(345);
        System.out.println("poped "+d.pop());
        System.out.println("removed First "+d.removeFirst());
        System.out.println(d.getFirst());
        System.out.println("removed Last "+d.removeLast());
        System.out.println(d.getLast());
        
        for(Integer i:d){
            System.out.println(i);
        }
        
        System.out.println("Size of List "+d.size());
        d.clear();// Clears List 
        System.out.println("Size of List "+d.size());
        
    }
}
