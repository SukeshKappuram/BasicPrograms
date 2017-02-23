/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package corejavaexamples.io;
import java.io.PrintWriter;
/**
 *
 * @author iamsu
 */
public class PrintWriterExample {
    public static void main(String[] args)
    {
        PrintWriter pw = new PrintWriter(System.out, true);
        pw.println("This is some output.");
        
        double price = 24.99;
        int quantity = 2;
        String color = "Blue";
        
        System.out.printf("We have %03d %s Polo shirts that cost $%3.2f.\n", quantity, color, price);
        System.out.format("We have %03d %s Polo shirts that cost $%3.2f.\n", quantity, color, price);
        String out = String.format("We have %03d %s Polo shirts that cost $%3.2f.", quantity, color, price);
        System.out.println(out);
        pw.printf("We have %03d %s Polo shirts that cost $%3.2f.\n", quantity, color, price);
    }
}
