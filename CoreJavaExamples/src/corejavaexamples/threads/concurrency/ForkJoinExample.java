/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package corejavaexamples.threads.concurrency;

import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

/**
 *
 * @author iamsu
 */
public class ForkJoinExample {
    public static void main(String[] arg){
        final int data[]=new int[200];
        final Random random =new Random();
        for(int i=0;i<data.length;i++){
            data[i]=random.nextInt(350);
        }
        final ForkJoinPool pool=new ForkJoinPool(4);
        final MaxFinder finder =new MaxFinder(data);
        System.out.println("The max value is "+pool.invoke(finder));
    }
}
class MaxFinder extends RecursiveTask<Integer>{
    private static final int SEQUENTIAL_THRESHOLD = 100;
    private final int[] data;
    private final int start;
    private final int end;

    public MaxFinder(int[] data, int start, int end) {
        this.data = data;
        this.start = start;
        this.end = end;
    }

    public MaxFinder(int[] data) {
        this(data,0,data.length);
    }
    
    protected Integer compute(){
        final int length =end -start;
        if(length <SEQUENTIAL_THRESHOLD){
            return computeDirectly();
        }
        final int split =length/2;
        final MaxFinder left= new MaxFinder(data, start,start+split);
        left.fork();
        final MaxFinder right= new MaxFinder(data, start+split,end);
        return Math.max(right.compute(),left.join());
    }
    private Integer computeDirectly(){
        System.out.println(Thread.currentThread()+" is searching array index : "+start+" to "+end);
        int max=Integer.MIN_VALUE;
        for(int i=start;i<end;i++){
            if(data[i]>max){
                max=data[i];
            }
        }
        return max;
    }
}
