/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package corejavaexamples.threads.concurrency;

import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author iamsu
 */
public class AtomicVariableExample {
    public static void main(String args[])
    {
        AtomicInteger value=new AtomicInteger(45);
        System.out.println("Initaial Value "+value.get());
        value.getAndIncrement();
        System.out.println("After Increment Value "+value.get());
        value.set(76);
        System.out.println("After Setting Value "+value.get());
        value.getAndDecrement();
        System.out.println("After Decrement Value "+value.get());
        value.compareAndSet(45,87);
        System.out.println("After updating Value "+value.get());
    }
}
