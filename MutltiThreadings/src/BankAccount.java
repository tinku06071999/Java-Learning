import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private int balance = 100;

//    public  void withdraw(int amount){
//        System.out.println(Thread.currentThread().getName() + " attempting to withdraw " + amount);
//        if(balance >= amount){
//            System.out.println(Thread.currentThread().getName() + " proceeding with withdrawal");
//            try{
//                Thread.sleep(10000); // if we use synchrinized then the other thread will wait for 10 sec and in real time application wait may be too much
//                                           // thats why explicit lock introduced
//            }catch (Exception e){
//                System.out.println(e);
//            }
//            balance -= amount;
//            System.out.println(Thread.currentThread().getName() + " Completed withdrawal. Remaining Balance: " + balance);
//        }else{
//            System.out.println(Thread.currentThread().getName() + " insufficient balance.");
//        }


    // using explicit locks

    private final Lock lock = new ReentrantLock(); // its kind of a key of a home (here the withdraw method is home)
    public void withdraw(int amount){
        System.out.println(Thread.currentThread().getName()+" attempting to withdraw " + amount);
        try{
            if(lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                if (balance >= amount) {
                    try {
                        System.out.println(Thread.currentThread().getName() + " proceeding with withdraw");
                        Thread.sleep(3000);
                        balance -= amount;
                        System.out.println(Thread.currentThread().getName() + " completed withdrawal. Remaining balance: " + balance);
                    } catch (Exception e) {
                        System.out.println(e);
                        Thread.currentThread().interrupt(); // used to manually store the state of a thread if it fails
                    } finally {
                        lock.unlock();
                    }
                } else {
                    System.out.println(Thread.currentThread().getName() + " insufficient balance");
                }
            }else{
                System.out.println(Thread.currentThread().getName() + " could not acquire the lock, will try later");
            }
        }catch (Exception e){
            System.out.println(e);
            Thread.currentThread().interrupt(); // used to store the state of the thread , so we can do further task in this. like if(Thread.currentThread().interrupt()){ // do something}
        }
    }
    public int getbalance(){
        return balance;
    }
}
