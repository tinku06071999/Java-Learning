public class Test {
// for Synchronization
    public static void main(String[] args){
        Counter counter = new Counter();
        MyThread1 t1 = new MyThread1(counter);
        MyThread1 t2 = new MyThread1(counter);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println(counter.getCount());
    }
}
 class MyThread1 extends Thread{
    private Counter counter;
    public MyThread1(Counter counter){
        this.counter = counter;
    }
    @Override
     public void run(){
        for(int i =0; i<10000;i++){
            counter.increment();
        }
    }
}
