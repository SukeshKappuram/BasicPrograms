/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package corejavaexamples.io;
import java.io.IOException;
import java.nio.file.*;

import static java.nio.file.StandardWatchEventKinds.ENTRY_CREATE;
import static java.nio.file.StandardWatchEventKinds.ENTRY_DELETE;
import static java.nio.file.StandardWatchEventKinds.ENTRY_MODIFY;
import static java.nio.file.StandardWatchEventKinds.OVERFLOW;
import java.nio.file.WatchEvent.Kind;
/**
 *
 * @author iamsu
 */
public class WatchServiceExample {
    public static void main(String[] args) {
    try (WatchService ws = FileSystems.getDefault().newWatchService()) {
      Path dirToWatch = Paths.get("D:\\Dump");
      dirToWatch.register(ws, ENTRY_CREATE, ENTRY_MODIFY, ENTRY_DELETE);
      while (true) {
        WatchKey key = ws.take();
        for (WatchEvent<?> event : key.pollEvents()) {
          Kind<?> eventKind = event.kind();
          if (eventKind == OVERFLOW) {
            System.out.println("Event  overflow occurred");
            continue;
          }
          WatchEvent<Path> currEvent = (WatchEvent<Path>) event;
          Path dirEntry = currEvent.context();
          System.out.println(eventKind + "  occurred on  " + dirEntry);
        }
        boolean isKeyValid = key.reset();
        if (!isKeyValid) {
          System.out.println("No  longer  watching " + dirToWatch);
          break;
        }
      }
    } catch (IOException | InterruptedException e) {
      e.printStackTrace();
    }
  }
}
