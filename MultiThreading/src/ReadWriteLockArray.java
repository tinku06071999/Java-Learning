import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLockArray {
    private final ReadWriteLock rwLock = new ReentrantReadWriteLock();
    private final Lock readLock = rwLock.readLock();
    private final Lock writeLock = rwLock.writeLock();
    private List<Integer> list = new ArrayList<>();

    public void add(int num){
        writeLock.lock();
        try{
            list.add(num);
            System.out.println("Element by thread " + Thread.currentThread().getName() + " is added");
        }finally {
            writeLock.unlock();
        }
    }
    public int getElement(int i){
        readLock.lock();
        try {
            System.out.println("Element "+ list.get(i)+ " by thread " + Thread.currentThread().getName() + " is printed");
            return list.get(i);
        }finally {
            readLock.unlock();
        }
    }

}
