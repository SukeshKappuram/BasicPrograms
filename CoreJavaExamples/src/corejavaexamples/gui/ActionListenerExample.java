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
public class ActionListenerExample extends Frame implements ActionListener
{
	Label l1,l2,l3;
	TextField t1,t2;
	Button b1,b2;
	ActionListenerExample()
	{
		l1= new Label("UserName");
		l2= new Label("PassWord");
		l3= new Label("");
		
		t1= new TextField(20);
		t2= new TextField(20);
		
		b1= new Button("Login");
		b2= new Button("Cancel");

		setLayout(new  FlowLayout());
		setBackground(Color.pink);
		setForeground(Color.blue);
		
		add(l1);add(t1);
		add(l2);add(t2);
		add(b1);add(b2);
		add(l3);
		setSize(300,300);
		setVisible(true);

		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)	
	{
		String s= ae.getActionCommand();

		if(s.equals("Login"))
		{
			String s1=t1.getText().trim();
			String s2=t2.getText().trim();
			if(s1.length()!=0   && s2.length()!=0)
			{
			if(s1.equals("Sukesh") && s2.equals("NIIT"))
				{
					l3.setText("Login success fully");
				}
				else
				{
				       l3.setText("Invalid UserName/password");
				}
			}
			else
			{
			              l3.setText("All fields are required");
			}
		}
		else
		{
			t1.setText("");
			t2.setText("");
			l3.setText("");
		}
	}	

	public static void main(String args[])
	{
		ActionListenerExample a= new ActionListenerExample();
	}

}
