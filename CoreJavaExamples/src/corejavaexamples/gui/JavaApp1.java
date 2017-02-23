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
public class JavaApp1 {

    /**
     * @param args the command line arguments
     */
    Frame f;
    MenuBar mb;
    Menu file,edit;
    MenuItem n ,open,save,cut,copy, paste;
    TextArea ta;
    
    void display(){
       f= new Frame("Notepad ");
		file = new Menu ("File");
		edit = new Menu ("Edit");

		n= new MenuItem("New");
		open= new MenuItem("Open");
		save= new MenuItem("Save");
		
		file.add(n);file.add(open);file.add(save);

		cut= new MenuItem("Cut");
		copy= new MenuItem("Copy");
		paste= new MenuItem("Paste");
	
		edit.add(cut);edit.add(copy);edit.add(paste);

		mb= new MenuBar();
	
		mb.add(file);mb.add(edit);
		
		f.setMenuBar(mb);

		ta= new TextArea(2,20);
		f.add(ta);
		f.setSize(500,500);
		f.setVisible(true);
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        JavaApp1 j=new JavaApp1();
        j.display();
    }
    
}
