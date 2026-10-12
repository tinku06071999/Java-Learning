import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLockExample {

    public static void main(String[] args) {
        RWThread t1 = new RWThread("Thread1");
        RWThread t2 = new RWThread("Thread2");
        RWThread t3 = new RWThread("Thread3");
        t1.start();
        t2.start();
        t3.start();
        try{
            t1.join();
            t2.join();
            t3.join();
        }catch (Exception e){

        }

        System.out.println();

    }
}
class RWThread extends Thread{

    ReadWriteLockArray rwArr = new ReadWriteLockArray();
    public RWThread(String nameOfThread){
        super(nameOfThread);
    }
    @Override
    public void run() {
        rwArr.add(4);
        rwArr.getElement(0);
    }
}