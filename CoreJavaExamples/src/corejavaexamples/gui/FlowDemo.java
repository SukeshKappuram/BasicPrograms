/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapp1;
import java.awt.*;
/**
 *
 * @author iamsu
 */
public class FlowDemo {
Frame f;
Label l1,l2,l3,l4,l5,l6;
Button b1,b2;
TextField t1,t2,t3;
TextArea ta;
Checkbox c1,c2,c3,r1,r2;
CheckboxGroup cbg;
Panel p1,p2;
	FlowDemo()
	{
	f= new Frame("Student Information");
	
	 l1= new Label("Sno");
	 l2= new Label("Sname");
	 l3= new Label("Father name");
         l4= new Label("Address");
	 l5= new Label("Languages");
	 l6= new Label("Gender");

	t1= new TextField(20);
	t2= new TextField(20);
	t3= new TextField(20);

	ta= new TextArea(2,20);

	c1= new Checkbox("Telugu");
	c2= new Checkbox("english");
	c3= new Checkbox("hindi");

	cbg= new CheckboxGroup();
	
	r1=new Checkbox("Male",cbg,true);
	r2=new Checkbox("FeMale",cbg,false);
	
	b1= new Button("submit");
	b2= new Button("cancel");
	
	p1= new Panel();
	p2= new Panel();
	
	f.setLayout(new FlowLayout());
	f.setSize(300,350);
	f.setBackground(Color.RED);
	f.setForeground(Color.BLUE);

	f.add(l1);f.add(t1);
	f.add(l2);f.add(t2);
	f.add(l3);f.add(t3);
	f.add(l4);f.add(ta);

	p1.add(l5);p1.add(c1);p1.add(c2);p1.add(c3);
	f.add(p1);
	
	p2.add(l6);p2.add(r1);p2.add(r2);
	f.add(p2);

	f.add(b1);f.add(b2);

	f.setResizable(false);
	f.setVisible(true);
	
	}
        public static void main(String args[])
        {
	FlowDemo s= new FlowDemo();
	
         }
}
