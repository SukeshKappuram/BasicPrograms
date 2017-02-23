/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package corejavaexamples.io;
import java.io.*;
import java.nio.channels.*;
/**
 *
 * @author iamsu
 */
public class FileChannelExample {
    public static void main(String[] args) throws Exception {
    RandomAccessFile raf = new RandomAccessFile("D:/Dump/test.txt", "rw");
    FileChannel fileChannel = raf.getChannel();
    FileLock lock = null;
    try {
      lock = fileChannel.lock(0, 10, true);

    } catch (IOException e) {
      // Handle the exception
    } finally {
      if (lock != null) {
        try {
          lock.release();
        } catch (IOException e) {
          // Handle the exception
        }
      }
    }

  }
}
