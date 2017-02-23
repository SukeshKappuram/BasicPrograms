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
public class SynchronizedMethodsExample {
    int d;
    boolean flag =false;
    synchronized int getData(){
        if(!flag){
            try{
                wait();
            }
            catch(Exception e){}
        }
            System.out.println("Got Data "+d);
            flag=false;
            notify();
            return d;
    }
    synchronized void putData(int d){
        if(flag){
            try{
                wait();
            }
            catch(Exception e){}
        }
        this.d=d;
        flag=true;
        System.out.println("put Data"+d);
        notify();
    }
}
class Producer implements Runnable{
    SynchronizedMethodsExample t;
    public Producer(SynchronizedMethodsExample t){
        this.t=t;
        new Thread(this,"Producer").start();
        System.out.println("put Called by producer");
    }
    public void run()
    {
        int data=0;
        while(true){
            data=data+1;
            t.putData(data);
        }
    }
}
class Consumer implements Runnable{
    SynchronizedMethodsExample t;
    public Consumer(SynchronizedMethodsExample t){
        this.t=t;
        new Thread(this,"Consumer").start();
        System.out.println("put Called by Consumer");
    }
    public void run()
    {
        int data=0;
        while(true){
            t.getData();
        }
    }
}
class MultiThreadClass{
    public static void main(String args[])
    {
        SynchronizedMethodsExample se=new SynchronizedMethodsExample();
        Producer p=new Producer(se);
        Consumer c=new Consumer(se);
    }
}
