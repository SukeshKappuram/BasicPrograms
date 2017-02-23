/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapp1;

/**
 *
 * @author iamsu
 */
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*
<applet code ="MyApplet" width=500 height=500>
</applet>
*/
public class MyApplet extends Applet 
{
	String str;
	public void init()
	{
                System.out.println("Init");
		addMouseListener(new AdapterDemo());
	}
        
        public void start()
	{
		System.out.println("start");
	}
        
	public void  stop()
	{
		System.out.println("stop");
	}
        
	public void paint(Graphics g)
	{
		g.drawString(str,20,20);
	}
        
        public void destroy()
	{
		System.out.println("Destroy");
	}

	class AdapterDemo extends MouseAdapter
	{
	      public void mouseEntered(MouseEvent me)
	       {
		str="Mouse Entered at "+me.getX()+","+me.getY();
		repaint();
	       }
	       public void mouseExited(MouseEvent me)
	       {
		str="Mouse Exited at "+me.getX()+","+me.getY();
		repaint();
	       }
	}
}