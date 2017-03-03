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
 * Null Layout with Action Listener
 */
public class NullDemo implements ActionListener{
    
	Frame f;
	Label l1,l2,l3;
	TextField t1,t2;
	Button b1,b2;
	
	NullDemo()
	{
		f= new Frame("Null   Window");

		l1= new Label("UserName");
		l2= new Label("PassWord");
                l3= new Label("");

		t1= new TextField(20);
		t2= new TextField(20);

		b1= new Button("Submit");
		b2= new Button("Cancel");

	l1.setBounds(80,80,80,30);t1.setBounds(190,80,80,30);
	l2.setBounds(80,110,80,30);t2.setBounds(190,110,80,30);
	b1.setBounds(110,140,80,30);b2.setBounds(220,140,80,30);
        l3.setBounds(120,200,80,30);
        
		f.setLayout(null);

		f.setBackground(Color.red);
		f.setForeground(Color.blue);

		f.add(l1);f.add(t1);
		f.add(l2);f.add(t2);
		f.add(b1);f.add(b2);
                f.add(l3);
                b1.addActionListener(this);
		f.setSize(300,300);
		f.setVisible(true);
	}
        public void actionPerformed(ActionEvent ae)
	{
            String s=ae.getActionCommand();
		if(s=="Submit")
		{
                    l3.setText("Welcome to ActionEvents");
                }
                else
		{
			t1.setText("");
                        l3.setText("");
		}
	}
         public static void main(String args[])
        {
            NullDemo s= new NullDemo();
        }
}
