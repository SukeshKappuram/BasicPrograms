/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapp1;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author iamsu
 */
public class MouseListenerExample {
  public static void main(String args[]) {
    Frame frame = new Frame("InputEventExample");
    Button button = new Button("A");
    frame.add(button, BorderLayout.NORTH);
    frame.pack();
    frame.setVisible(true);
    button.addMouseListener(new MouseAdapter() {
      public void mousePressed(MouseEvent me) {
        int mode = me.getModifiers();
        if ((mode & InputEvent.BUTTON1_MASK) == InputEvent.BUTTON1_MASK) {
          System.out.println("Left button pressed.");
        }
        if ((mode & InputEvent.BUTTON2_MASK) == InputEvent.BUTTON2_MASK) {
          System.out.println("Middle button pressed.");
        }
        if ((mode & InputEvent.BUTTON3_MASK) == InputEvent.BUTTON3_MASK) {
          System.out.println("Right button pressed.");
        }
      }

      public void mouseReleased(MouseEvent me) {
        System.out.println("mouseReleased " + me.getX());
      }
    });
    
    frame.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
        System.exit(0);
      }
    });
  }
}
