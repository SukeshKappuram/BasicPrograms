/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package corejavaexamples.util.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

/**
 *
 * @author iamsu
 */
public class ListExample {
    public static void main(String[] arg){
        List<Integer> as=new ArrayList<>();
        as.add(new Integer(1));
        as.add(new Integer(8));
        Integer k=new Integer(20);
        Integer l=new Integer(50);
        as.add(k);
        as.add(l);
        as.add(k);
        as.remove(l);
        System.out.println("Size of ArrayList "+as.size());
        System.out.println("Element at index "+as.get(1));
        
        ListIterator<Integer> ltr=as.listIterator();
        while(ltr.hasNext()){
            System.out.println("Array List :"+ltr.next());
        }
        
        List<String> ls = new LinkedList<>();
        ls.add("Orange");
        ls.add("Green");
        String m=new String("Black");
        String n=new String("Blue");
        ls.add(m);
        ls.add(n);
        ls.add(m);
        ls.remove(1);
        
        for(String i:ls){
            System.out.println("LinkedList:"+i);
        }
        System.out.println("Size of List "+ls.size());
        ls.clear();// Clears List 
        System.out.println("Size of List "+ls.size());
        
        List<String> vs = new Vector<>();
        vs.add("red");
        vs.add("yellow");
        vs.add(m);
        vs.add(n);
        vs.add(m);
        vs.remove(1);
        
        for(String v:vs){
            System.out.println("vector :"+v);
        }
    }
}
