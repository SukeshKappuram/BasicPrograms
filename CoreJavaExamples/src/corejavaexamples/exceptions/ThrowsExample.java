/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package corejavaexamples.exceptions;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author iamsu
 */
public class ThrowsExample {
    public static int readByteFromFile()throws IOException {
        try (InputStream in = new FileInputStream("a.txt")) {
            System.out.println("File open");
            return in.read();
        }
    }
    
    public static int readByteFromFile(String file) throws FileNotFoundException, IOException {
        try {
            InputStream in = new FileInputStream(file);
            System.out.println("File open");
            return in.read();
        } catch (Exception e) {
              e.printStackTrace();
              throw e;
        }
    }

    
    public static void main(String[] arg){
        try {
            ThrowsExample.readByteFromFile();
            ThrowsExample.readByteFromFile("MyFile");
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }
}
