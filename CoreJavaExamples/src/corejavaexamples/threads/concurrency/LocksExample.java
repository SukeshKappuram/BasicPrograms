/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package corejavaexamples.threads.concurrency;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 *
 * @author iamsu
 */
public class LocksExample extends Thread{
    private static final ReentrantReadWriteLock rwlock=new ReentrantReadWriteLock();
    @Override
    public void run()
    {
        try{
            readData();
            sleep(2000);
            writeData();
        }catch(final Exception e){
            
        }
    }
    
    public void readData(){
        try{
            rwlock.readLock().lock();
            System.out.println(Thread.currentThread().getName()+" is reading and the value is 5");
        }finally{
            System.out.println(Thread.currentThread().getName()+" is exiting after reading");
            rwlock.readLock().unlock();
        }
    }
    
    public void writeData(){
        try{
            rwlock.readLock().lock();
            Random rand =new Random();
            int n=rand.nextInt(50);
            System.out.println(Thread.currentThread().getName()+" has the write lock and is writing");
            System.out.println("The new value is:"+(5+n));
        }finally{
            System.out.println(Thread.currentThread().getName()+" is releasing the lock and exiting after writing");
            rwlock.readLock().unlock();
        }
    }
}

class ReentrantLockImplementation implements Runnable{
    final Lock lock=new ReentrantLock();
    String name;
    Thread t;
    
    public void createThread(String threadName){
        name=threadName;
        t=new Thread(this, name);
        System.out.println("Thread Created "+t.getName());
    }
     
    public void run(){
        do{
            try{
                if(lock.tryLock(400,TimeUnit.MICROSECONDS)){
                    try{
                        System.out.println(Thread.currentThread().getName()+" acquired Lock");
                        Thread.sleep(1000);
                    }finally{
                        lock.unlock();
                        System.out.println(Thread.currentThread().getName()+" released Lock");
                    }
                    break;
                }
                else{
                    System.out.println(Thread.currentThread().getName()+" could not acquire Lock");
                }
            }catch(Exception e){}
        }while(true);
    }
}

class ReentrantLockTest{
    public static void main(String args[])
    {
        ReentrantLockImplementation obj=new ReentrantLockImplementation();
        obj.createThread("Thread 1");
        obj.createThread("Thread 2");
        obj.createThread("Thread 3");
        
        LocksExample obj1=new LocksExample();
        LocksExample obj2=new LocksExample();
        
        obj1.start();
        obj2.start();
    }
}