/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package corejavaexamples.threads;

/**
 *
 * @author iamsu
 */
public class ThreadExample extends Thread//runnable
{
	public void run()
	{
		for(int i=1;i<100;i++)
		{
			System.out.println("MY thread :"+i);
		}
	}
}
class MainClass
{
	public static void main(String args[])
	{
		ThreadExample ct= new ThreadExample();
                ct.start();
		System.out.println("run  :"+ct.isAlive());
		for(int i=1;i<100;i++)
		{
			System.out.println("MainThread  :"+i);
		}
		System.out.println("MainThread  Completed");
                
                Rajnikanth1 rt= new Rajnikanth1();
		Rajnikanth2 st= new Rajnikanth2();
			rt.start();
			st.start();
		for(int i=1;i<50;i++)
		{
			try{Thread.sleep(80);}catch(Exception e){}
			System.out.println("SecondMainThread  :"+i);
		}
	}
}
class Rajnikanth1 extends Thread
{
	public void run()
	{
		for(int i=1;i<=50;i++)
		{
			try{sleep(100);}catch(Exception e){}
			System.out.println("Rajnikanth1  :"+i);
		}
	}
}
class Rajnikanth2 extends Thread
{
	public void run()
	{
		for(int i=1;i<=50;i++)
		{
			try{sleep(100);}catch(Exception e){}
			System.out.println("Rajnikanth2  :"+i);
		}
	}
}