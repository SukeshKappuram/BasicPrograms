/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package corejavaexamples.io;
import java.io.IOException;
import java.nio.file.*;
import static java.nio.file.FileVisitResult.CONTINUE;
import java.nio.file.attribute.BasicFileAttributes;
/**
 *
 * @author iamsu
 */
public class FileVisitorExample {
    static boolean delete;
    public static void main(String[] args) {
    Path startDir = Paths.get("D:/Dump");
    FileVisitor<Path> visitor = getFileVisitor();
    try {
      Files.walkFileTree(startDir, visitor);
    } catch (IOException e) {
      e.printStackTrace();
    }
    
    Path dirToDelete = Paths.get("qwerty1.txt");
    
    try {
        FileVisitorExample.delete=true;
      Files.walkFileTree(dirToDelete, visitor);
      FileVisitorExample.delete=false;
    }
    catch (IOException e) {
      System.out.println(e.getMessage());
    }
    
    String globPattern = "glob:**txt";
    PathMatcher matcher = FileSystems.getDefault().getPathMatcher(globPattern);
    Path path = Paths.get("D:/Dump");
    boolean matched = matcher.matches(path);
    System.out.format("%s matches  %s:  %b%n", globPattern, path, matched);
  }
  public static FileVisitor<Path> getFileVisitor() {
    class DirVisitor<Path> extends SimpleFileVisitor<Path> {
      @Override
      public FileVisitResult preVisitDirectory(Path dir,
          BasicFileAttributes attrs) {

        System.out.format("%s [Directory]%n", dir);
        return CONTINUE;
        
        
      }

      @Override
      public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
        System.out.format("%s [File,  Size: %s  bytes]%n", file, attrs.size());
        return CONTINUE;
      }
    }
    
    class DeleteDirVisitor extends SimpleFileVisitor<Path> {
      @Override
      public FileVisitResult postVisitDirectory(Path dir, IOException e)
          throws IOException {
        FileVisitResult result = CONTINUE;
        if (e != null) {
          System.out.format("Error deleting  %s.  %s%n", dir, e.getMessage());
          result = FileVisitResult.TERMINATE;
        } else {
          Files.delete(dir);
          System.out.format("Deleted directory  %s%n", dir);
        }
        return result;
      }

      @Override
      public FileVisitResult visitFile(Path file, BasicFileAttributes attrs)
          throws IOException {
        Files.delete(file);
        System.out.format("Deleted file %s%n", file);
        return CONTINUE;
      }
    }
    FileVisitor<Path> visitor = new DirVisitor<>();
    
    if(FileVisitorExample.delete){
        visitor = new DeleteDirVisitor();
    }
    
    return visitor;
  }
  
}
