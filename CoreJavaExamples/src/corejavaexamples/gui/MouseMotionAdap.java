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
public class MouseMotionAdap {
  public static void main(String args[]) {
    Frame frame = new Frame("MouseMotionAdapterExample");
    frame.pack();
    frame.setSize(new Dimension(350, 250));
    frame.setVisible(true);
    frame.addMouseMotionListener(new MouseMotionAdapter() {
      // invoked when mouse is moved over the panel
      public void mouseMoved(MouseEvent me) {
        Point point = me.getPoint();
        System.out.println(point);
      }

      // invoked when mouse is dragged
      public void mouseDragged(MouseEvent me) {
        Point point = me.getPoint();
        System.out.println(point+"draged");
      }
    });
  }
}