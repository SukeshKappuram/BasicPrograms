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
public class CalculatorExample extends Frame implements ActionListener
{
	Label l1,l2,l3;
	TextField t1,t2,t3;
	Button b1,b2,b3,b4,b5;
	CalculatorExample()
	{
		super("Arithmetic Operations");
		l1= new Label("FirstNo");
		l2= new Label("SecondNo");
		l3= new Label("ResultValue");

		t1= new TextField(20);
		t2= new TextField(20);
		t3= new TextField(20);		

		b1= new Button("Add");
		b2= new Button("Sub");
		b3= new Button("Mul");
		b4= new Button("Div");
		b5= new Button("Clear");

		setLayout(new FlowLayout());
		add(l1);add(t1);
		add(l2);add(t2);
		add(l3);add(t3);
		add(b1);add(b2);
		add(b3);add(b4);add(b5);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);		
	}
	public void actionPerformed(ActionEvent ae)
	{
		String s= ae.getActionCommand();
		if(s.equals("Clear"))
		{
			t1.setText("");
			t2.setText("");
			t3.setText("");
		}
		else
		{
			try
			{
				int x=Integer.parseInt(t1.getText());
				int y=Integer.parseInt(t2.getText());
				if(s.equals("Add"))
				{
				        t3.setText(String.valueOf(x+y));
				}
				else if(s.equals("Sub"))
				{
				        t3.setText(String.valueOf(x-y));
				}
				else if(s.equals("Mul"))
				{
				        t3.setText(String.valueOf(x*y));
				}
				else 
				{
				        t3.setText(String.valueOf(x/y));
				}
			}
			catch(Exception e)	
			{	
				if(s.equals("Add"))
				{
				  t3.setText(t1.getText()+t2.getText());
				}
				else
				{
					t1.setText("");
					t2.setText("");
					t3.setText("");
				}
			}
		}
	}

	public static void main(String args[])
	{
		CalculatorExample a= new CalculatorExample();
		a.setSize(300,300);
		a.setVisible(true);
	}

}
