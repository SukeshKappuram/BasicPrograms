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
public class GridDemo {
    Frame f;
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
	
	GridDemo()
	{
		f= new Frame("Grid Layout Window");
		
		b1= new Button("1");
		b2= new Button("2");
		b3= new Button("3");
		b4= new Button("4");
		b5= new Button("5");
		b6= new Button("6");
		b7= new Button("7");
		b8= new Button("8");
		b9= new Button("9");

		f.setLayout(new GridLayout(3,3));
		f.add(b1);f.add(b5);
		f.add(b3);f.add(b4);
		f.add(b2);f.add(b6);
		f.add(b7);f.add(b8);
		f.add(b9);

		f.setSize(300,300);
		f.setVisible(true);
	}

	public static void main(String args[])
	{
		GridDemo g= new GridDemo();
	}
}
