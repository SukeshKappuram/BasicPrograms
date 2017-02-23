/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package corejavaexamples.threads.concurrency;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 *
 * @author iamsu
 */
public class ReadWriteLocksExample {
    public static void main(String[] arg){
        
    }
}
class ShoppingCart 
{
    private final ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();
    public void addItem(Object o) 
    {
        rwl.writeLock().lock();
        // modify shopping cart
        rwl.writeLock().unlock();

    }

    public String getSummary()
    {
        String s = "";
        rwl.readLock().lock();
        // read cart, modify s	
        rwl.readLock().unlock();
        return s;
    }
}