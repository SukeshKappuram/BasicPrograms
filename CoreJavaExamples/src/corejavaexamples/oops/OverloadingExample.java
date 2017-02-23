/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package corejavaexamples.oops;

/**
 *
 * @author iamsu
 */
public class OverloadingExample {//type /num /order
        void add(int x,int y)
	{
		int z=x+y;
		System.out.println("Integer addition is :"+z);
	}
	void add(float x,float y)
	{
		float z=x+y;
		System.out.println("float addition is "+z);
	}
        void add(float x,float y,float z){
        }
        void add(float x,int y){}
        void add(int x,float y){}
}

class MainClass 
{
	public static void main(String[] args) 
	{
		OverloadingExample s= new OverloadingExample();
		s.add(10,2);
		s.add(5.6f,5.5f);
	}
}

