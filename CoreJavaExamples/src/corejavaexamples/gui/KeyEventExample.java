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
public class KeyEventExample {
 
  Label label;

 KeyEventExample() {
    Frame frame = new Frame();
    TextField textField = new TextField();
    frame.add(textField, BorderLayout.NORTH);
    label = new Label();
    frame.add(label, BorderLayout.CENTER);
    frame.setSize(450, 400);
    frame.setVisible(true);
   
    textField.addKeyListener(new KeyAdapter() {
      /**
       * When you type the character "a" into the text field you will see
       * an information dialog box refer output Screen
       */
      public void keyTyped(KeyEvent ke) {
        char keyChar = ke.getKeyChar();
        if (keyChar == 'a') {
          System.out.println("You typed 'a'");
        }
      }

      /**
       * When you type the character "b" into the text field you will see
       * an information dialog box
       */
      public void keyPressed(KeyEvent ke) {
        int keyCode = ke.getKeyCode();
        if (keyCode == 66) {
          System.out.println("You Typed b");
        }
      }

      /**
       * When you type the character "c" into the text field you will see
       * an information dialog box
       */
      public void keyReleased(KeyEvent ke) {
        int keyCode = ke.getKeyCode();
        if (keyCode == 67) {
          System.out.println("You Typed c");
        }
      }
    });
  }

  public static void main(String[] args) {
    new KeyEventExample();
  } 
}
