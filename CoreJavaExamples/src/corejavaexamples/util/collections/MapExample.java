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
public class MapExample {
    public static void main(String[] arg){
        Map<Integer,String> m=new HashMap<>();
        m.put(101,"Black Shirt");
        m.put(109,"Blue Shirt");
        m.put(104,"Pink Shirt");
        m.put(101,"Black T-Shirt");
        
        for(Integer i:m.keySet()){
            System.out.println(m.get(i));
        }
        
        Map<Integer,String> t=new TreeMap<>();
        t.put(101,"Black Shirt");
        t.put(103,"Blue Shirt");
        t.put(102,"Pink Shirt");
        t.put(101,"Black T-Shirt");
        
        for(Integer i:t.keySet()){
            System.out.println(t.get(i));
        }
        
        Map<Integer,String> ht=new Hashtable<>();
        ht.put(101,"Black Shirt");
        ht.put(103,"Blue Shirt");
        ht.put(108,"Pink Shirt");
        ht.put(101,"Black T-Shirt");
        
        for(Integer i:t.keySet()){
            System.out.println(t.get(i));
        }
    }
}
