/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package corejavaexamples.threads.concurrency;

import java.util.concurrent.*;

/**
 *
 * @author iamsu
 */
public class ExecutorExample {
    public static void main(String[] arg){
        Task task1=new Task("Task1");
        Task task2=new Task("Task2");
        Task task3=new Task("Task3");
        
        ExecutorService threadExecutor = Executors.newCachedThreadPool();
        System.out.println("Executor Started");
        threadExecutor.execute(task1);
        threadExecutor.execute(task2);
        threadExecutor.execute(task3);
        threadExecutor.shutdown();
        if(threadExecutor.isShutdown()){
            System.out.println("All Task Completed Executor Service is shuting Down");
        }
        
        System.out.println("=======================================");
        
        Process p1=new Process("process1");
        Process p2=new Process("process2");
        Process p3=new Process("process3");
        
        ExecutorService threadExecutorPool1 = Executors.newFixedThreadPool(3);
        ExecutorService threadExecutorPool2 = Executors.newFixedThreadPool(3);
        
        Future<String> f1=threadExecutorPool1.submit(p1);
        Future<String> f2=threadExecutorPool2.submit(p2);
        Future<String> f3=threadExecutorPool2.submit(p3);
    }
}
class Task implements Runnable{
    String taskname;

    public Task(String taskname) {
        this.taskname = taskname;
    }
    
    public void run(){
        System.out.println("The Task name is "+taskname+" executed by "+Thread.currentThread().getName());
    }
    
}
class Process implements Callable{
    String processname;

    public Process(String processname) {
        this.processname = processname;
    }
    
    public String call(){
        System.out.println("The Process name is "+processname+" executed by "+Thread.currentThread().getName());
        return processname;
    }
}