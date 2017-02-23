/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package corejavaexamples.io;
import java.nio.*;
import java.nio.file.*;
/**
 *
 * @author iamsu
 */
public class PathExample {
    public static void main(String[] arg){
        Path p=Paths.get("D:/Dump/qwerty1.txt");
        System.out.println("File Name "+p.getFileName());
        System.out.println("Parent "+p.getParent());
        System.out.println("Name Count "+p.getNameCount());
        System.out.println("Root "+p.getRoot());
        System.out.println("Is Absolute "+p.isAbsolute());
        System.out.println("To Absolute "+p.toAbsolutePath());
        System.out.println("To URI "+p.toUri());
        System.out.println("Normalized Path"+p.normalize());
        System.out.println("Sub Path"+p.subpath(1, 2));
        System.out.println("Joining Next Folder"+p.resolve("nextFolder"));
    }
}
