/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package corejavaexamples.threads;

import static java.lang.Thread.sleep;

/**
 *
 * @author iamsu
 */
public class ThreadsExample implements Runnable{
    Thread t;

    public ThreadsExample(int p) {
        t=new Thread(this, "First Thread");
        t.setPriority(p);
        System.out.println("Thread Created "+t);
    }
    public void run()
	{
		for(int i=1;i<=5;i++)
		{
			try{
                            sleep(100);
                            System.out.println(t+" Loop  : "+i);
                        }catch(Exception e){}
		}
	}
}
class JoinDemo{
    public static void main(String args[])
    {
        ThreadsExample th1=new ThreadsExample(Thread.NORM_PRIORITY -2);
        ThreadsExample th2=new ThreadsExample(Thread.NORM_PRIORITY +2);
        ThreadsExample th3=new ThreadsExample(Thread.NORM_PRIORITY +3);
        
        th1.t.start();
        th2.t.start();
        th3.t.start();
        
        try{
            System.out.println("Main Thread is waiting ");
            th1.t.join();
            th2.t.join();
            th3.t.join();
        }catch(Exception e){
            System.out.println(th1.t+" is Alive ?"+th1.t.isAlive());
            System.out.println(th2.t+" is Alive ?"+th2.t.isAlive());
            System.out.println(th2.t+" is Alive ?"+th2.t.isAlive());
        }
        System.out.println("Main Thread Completed ");
    }
}