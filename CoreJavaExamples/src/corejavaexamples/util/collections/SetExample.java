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
public class SetExample {
    public static void main(String[] arg){
        Set<Integer> s=new HashSet<>();
        s.add(new Integer(1));
        s.add(new Integer(8));
        Integer i=new Integer(20);
        Integer j=new Integer(50);
        s.add(j);
        s.add(i);
        s.add(j);
        s.remove(i);
        Iterator<Integer> itr=s.iterator();
        while(itr.hasNext()){
            System.out.println("Hash Set :"+itr.next());
        }
        
        Set<String> ts=new TreeSet<>();
        ts.add("Orange");
        ts.add("Green");
        String m=new String("Black");
        String n=new String("Blue");
        ts.add(m);
        ts.add(n);
        ts.add(m);
        ts.remove(n);
        
        for(String t:ts){
            System.out.println("Sorted Set:"+t);
        }
    }

}

