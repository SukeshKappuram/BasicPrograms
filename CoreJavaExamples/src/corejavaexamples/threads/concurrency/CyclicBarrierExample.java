/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package corejavaexamples.threads.concurrency;
import java.util.concurrent.CyclicBarrier;
/**
 *
 * @author iamsu
 */
public class CyclicBarrierExample {
    public static void main(String[] arg){
    Runnable barrier1Action = new Runnable() {
        public void run() {
            System.out.println("BarrierAction 1 executed ");
        }
    };
    
    Runnable barrier2Action = new Runnable() {
        public void run() {
            System.out.println("BarrierAction 2 executed ");
        }
    };

    CyclicBarrier barrier1 = new CyclicBarrier(2, barrier1Action);
    CyclicBarrier barrier2 = new CyclicBarrier(2, barrier2Action);

    CyclicBarrierRunnable barrierRunnable1 =new CyclicBarrierRunnable(barrier1, barrier2);

    CyclicBarrierRunnable barrierRunnable2 =new CyclicBarrierRunnable(barrier1, barrier2);
    
    Thread t1=new Thread(barrierRunnable1);
    t1.start();
    Thread t2=new Thread(barrierRunnable2);
    t2.start();
    }
}
class CyclicBarrierRunnable implements Runnable{

    CyclicBarrier barrier1 = null;
    CyclicBarrier barrier2 = null;

    public CyclicBarrierRunnable(
            CyclicBarrier barrier1,
            CyclicBarrier barrier2) {

        this.barrier1 = barrier1;
        this.barrier2 = barrier2;
    }

    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() +" waiting at barrier 1");
            this.barrier1.await();

            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() +" waiting at barrier 2");
            this.barrier2.await();

            System.out.println(Thread.currentThread().getName() +
                                " done!");

        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
