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
 * 
 * We are using Adaptor concept instead of Implementing Listener interfaces
 */
public class FocusAdap {
  Label label;

FocusAdap() {
    Frame frame = new Frame();
    Button Okay = new Button("Okay");
    Button Cancel = new Button("Cancel");
    Okay.addFocusListener(new MyFocusListener());
    Cancel.addFocusListener(new MyFocusListener());
    frame.add(Okay, BorderLayout.NORTH);
    frame.add(Cancel, BorderLayout.SOUTH);
    label = new Label();
    frame.add(label, BorderLayout.CENTER);
    frame.setSize(450, 400);
    frame.setVisible(true);
    
    //concept of Inner Class
    
    frame.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent we) {
        System.exit(0);
      }
    });
    
  }

    //Concept of Inner Class

    class MyFocusListener extends FocusAdapter {
    public void focusGained(FocusEvent fe) {
          Button button = (Button) fe.getSource();
          label.setText(button.getLabel());
    }
  }

  public static void main(String[] args) {
    FocusAdap fc = new FocusAdap();
  }
}