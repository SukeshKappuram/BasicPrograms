/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package corejavaexamples.threads;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;


/**
 *
 * @author iamsu
 */
public class CountDownTimer extends Thread{
    JTextField tf;
    JLabel l;
    JFrame fr;
    public void run()
    {
		buildGUI();
    }
    void display(){
            for(int i=60;i>=0;i--)
            {
                try{
                    Thread.sleep(1000);
                    String s=Integer.toString(i);
                    tf.setText("    "+s+" seconds to go...");
                }
                catch(Exception e){
                    System.out.println(e);
                }
            }
            JOptionPane.showMessageDialog(fr,"Time Up!!!");
            tf.setText("");
            tf.setEnabled(false);
    }
    public void buildGUI(){
        fr= new JFrame("CountDown Timer");
        JPanel p=new JPanel();
        l=new JLabel("");
        tf=new JTextField(15);
        tf.setEnabled(false);
        Font f=new Font("verdana",0,18);
        tf.setFont(f);
        tf.setBackground(Color.black);
        p.setBackground(Color.green);
        fr.add(p);
        p.add(tf);
        p.add(l);
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(300,300);
        fr.setResizable(false);
        display();
    }
    public static void main(String args[])
    {
            CountDownTimer cd=new CountDownTimer();
            cd.start();
    }
}

