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
public class BorderDemo {
        Frame f;
	Button b1,b2,b3,b4,b5;
	BorderDemo()
	{
		f= new Frame("Border Layout window");
		b1=new Button("^");
		b2=new Button("V");
		b3=new Button(">");
		b4=new Button("<");
		b5=new Button("OK");

		f.setLayout(new BorderLayout());
		//f.setBackground(Color.red);
		f.setForeground(Color.red);

		f.add(b1,BorderLayout.NORTH);
		f.add(b2,BorderLayout.SOUTH);
		f.add(b3,BorderLayout.EAST);
		f.add(b4,BorderLayout.WEST);
		f.add(b5,BorderLayout.CENTER);		
		
		f.setSize(300,300);
		f.setVisible(true);
	}
        public static void main(String[] arg){
            BorderDemo bd=new BorderDemo();
        }
}
