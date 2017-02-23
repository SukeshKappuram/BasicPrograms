/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapp1;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author iamsu
 */
public class SwingExample extends JApplet{
/*
<applet code="SwingExample" width =500 height=500>
</applet>
    
    add Images
*/
	JCheckBox cb1,cb2,cb3;
	Container con;
	ImageIcon i1,i2,i3;
	public void init()
	{
		i1= new ImageIcon("Sample1.gif");
		i2= new ImageIcon("Sample2.gif");
		i3= new ImageIcon("Sample3.gif");

		cb1= new JCheckBox("Jasmine",i1);
		cb1.setRolloverIcon(i2);
		cb1.setSelectedIcon(i3);

		cb2= new JCheckBox("Rose",i1);
		cb2.setRolloverIcon(i2);
		cb2.setSelectedIcon(i3);

		cb3= new JCheckBox("Lilli",i1);
		cb3.setRolloverIcon(i2);
		cb3.setSelectedIcon(i3);

		con=getContentPane();
		con.setLayout(new FlowLayout());
		con.add(cb1);con.add(cb2);con.add(cb3);
	}
}