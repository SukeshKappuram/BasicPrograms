/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package corejavaexamples.exceptions;

import java.io.*;

/**
 *
 * @author iamsu
 */
public class TryWithResourcesExample {
    public static void main(String[] arg){
        System.out.println("About to open a file");
        try (InputStream in = new FileInputStream("missingfile.txt")) 
        {
            System.out.println("File open");
            int data = in.read();
        }
        catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        } 

    }
}
