/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package corejavaexamples.exceptions;

import corejavaexamples.io.ObjectStreamExample;
import java.io.*;

/**
 *
 * @author iamsu
 */
public class MultiCatchExample {
    public static void main(String[] arg){
        ObjectStreamExample cart = null;
        String cartFile="cartFile.txt";
        try (InputStream is = new FileInputStream(cartFile);
        ObjectInputStream in = new ObjectInputStream(is)) 
        {
            cart = (ObjectStreamExample)in.readObject();
        }
        catch (ClassNotFoundException | IOException e) 
        {
            System.out.println("Exception deserializing " + cartFile);
            System.out.println(e);
            System.exit(-1);
        }
    }
}
