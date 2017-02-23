/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package corejavaexamples.io;
import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.*;
/**
 *
 * @author iamsu
 */
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;
public class FilesExample {
    public static void main(String[] arg) throws IOException{
        Path  p1=Paths.get("D:/Dump/qwerty1.txt");
        Path  p2=Paths.get("D:/Dump/qwerty2.txt");
        System.out.println("Exists: "+Files.exists(p1, LinkOption.NOFOLLOW_LINKS));
        System.out.println("Not Exists: "+Files.notExists(p2, LinkOption.NOFOLLOW_LINKS));
        System.out.println("Directory: "+Files.isDirectory(p1,LinkOption.NOFOLLOW_LINKS));
        System.out.println("Executable: "+Files.isExecutable(p2));
        System.out.println("Hidden: "+Files.isHidden(p2));
        System.out.println("Readable: "+Files.isReadable(p2));
        System.out.println("Regular: "+Files.isRegularFile(p2, LinkOption.NOFOLLOW_LINKS));
        System.out.println("SameFile: "+Files.isSameFile(p1, p2));
        System.out.println("Symbolic: "+Files.isSymbolicLink(p2));
        System.out.println("Writable: "+Files.isWritable(p1));
        Files.delete(p2);
        System.out.println("Deleted ");
        System.out.println("Create File: "+Files.createFile(p2));
        System.out.println("Copy: "+Files.copy(p2, p1,StandardCopyOption.REPLACE_EXISTING));
        System.out.println("Move: "+Files.move(p1, p2, StandardCopyOption.ATOMIC_MOVE));
        System.out.println("Delete File: "+Files.deleteIfExists(p2));
        System.out.println("create Directory: "+Files.createDirectory(p2));
        System.out.println("create Directories: "+Files.createDirectories(p1));
        
        String contentType = Files.probeContentType(p1);
        System.out.format("Content type   of  %s  is %s%n", p1, contentType);
        
        Path wiki_path = Paths.get("D:/Dump/wiki", "wiki.txt");

        Charset charset = Charset.forName("UTF-8");
        String text = "\nHello World!! How are you?";
        try (BufferedWriter writer = Files.newBufferedWriter(wiki_path, charset, StandardOpenOption.APPEND)) {
            writer.write(text);
        } catch (IOException e) {
            System.err.println(e);
        }
    }
    
}
