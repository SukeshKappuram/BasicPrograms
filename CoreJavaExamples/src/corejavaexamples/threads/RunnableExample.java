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
public class RunnableExample {
    public static void main(String args[])
	{
		JavaThread jt= new JavaThread();
		Thread t1=new Thread(jt);
		t1.start();
                Thread t2=new Thread(jt);
		t2.start();
		for(int i=1;i<=100;i++)
		{
			System.out.println("MainThread :"+i);
		}


	}
}


class JavaThread implements Runnable
{
	public void run()
	{
		for(int i=1;i<=100;i++)
		{
			System.out.println("JavaThread  :"+i);
		}
	}
}
