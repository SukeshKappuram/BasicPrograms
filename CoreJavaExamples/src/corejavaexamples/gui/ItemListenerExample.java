/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapp1;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;
/**
 *
 * @author iamsu
 */
public class ItemListenerExample {
    public static void main(String args[]) {
    Frame frame = new Frame("ItemEventExample");
    final Checkbox checkbox = new Checkbox("Checkbox 1");
    frame.add(checkbox, BorderLayout.NORTH);
    frame.pack();
    frame.setVisible(true);
    checkbox.addItemListener(new ItemListener() {
      @Override
      public void itemStateChanged(ItemEvent ie) {
        if (checkbox.getState() == true) {
            JOptionPane.showMessageDialog(null, "checkbox is checked");
        } else {
            JOptionPane
              .showMessageDialog(null, "checkbox is unchecked");
        }
      }
    });
}
}
