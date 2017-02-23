/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package corejavaexamples.designpatterns;

/**
 *
 * @author iamsu
 */
public class SingletonExample {
    public static void main(String[] arg){
        SingletonClass myInstance=SingletonClass.getInstance();
        System.out.println(myInstance); 
    }
}
class SingletonClass{
    private SingletonClass() {
    }
    
    public static SingletonClass getInstance() {
        return INSTANCE;
    }
    
    private static final SingletonClass INSTANCE = new SingletonClass();
}