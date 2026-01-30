import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample {

    private final Lock lock  = new ReentrantLock();

    public void outerMethod(){
        lock.lock();
        try{
            System.out.println("Outer Method");
            innerMethod();
        }finally {
            lock.unlock();
        }
    }
    public void innerMethod(){
        lock.lock();
        try {
            System.out.println("Inner Method");
            outerMethod();
        }finally {
            lock.unlock();
        }
    }
    public static void main(String[] args) {
       ReentrantLockExample example = new ReentrantLockExample();
       example.outerMethod(); // create deadlock

        //ReentrantLock()
        // ReentrantLock() make sure that lock is switch between both the method
        //it is the part of java.util.concurrent.locks package
        //it provides more flexible way of synchronization compared to synchronized keyword
        //it allows a thread to enter a lock multiple times (reentrant behaviour) without causing deadlock.
        // It offers features like:
        //Reentrancy: The same thread can acquire the lock multiple times. Each lock acquisition must be paired with a corresponding unlock.
        //Explicit Locking: Unlike synchronized, Reentrant Lock requires manual locking and unlocking using lock() and unlock().
        //Interruptible: Threads waiting for a lock can be interrupted.
        //TryLock() Support: Threads can attempt to acquire a lock without waiting indefinitely.
        //Fairness Policy: Locks can be configured to grant access in first-come-first-serve order.
        //Reentrant locks can be created with a fairness option:

        //ReentrantLock fairLock = new ReentrantLock(true); // Fair lock

        //Fair lock: Threads acquire the lock in the order they requested it (first-come-first-serve).
        //Non-fair lock (default): Threads may acquire the lock in an arbitrary order, which can improve throughput but may cause starvation.
    }

}
