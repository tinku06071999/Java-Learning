public class MyThread extends Thread{
// State of a thread
    //1. NEW
    //2. RUNNABLE
    //3. RUNNING
    //4. WAITING/BLOCKED
    //5. TERMINATED

//NOTE: A we cant ideintify when a thread is in running state,
// actually the runnable state is considered as running state also
    public MyThread(String threadName){
        super(threadName);
    }
    @Override
    public void run(){
//        System.out.println("RUNNING");
//        try{
//            Thread.sleep(2000);
//        }catch (InterruptedException e){
//            System.out.println(e);
//        }
       // for setPriority() method
//        for (int i =0;i<5;i++){
//            String a = "";
//            for(int j = 0; j < 100000; j++){
//                a += "a";
//            }
//            System.out.println(Thread.currentThread().getName() + " - Priority: " + Thread.currentThread().getPriority());
//            try{
//                sleep(5000);
//            }catch (Exception e){
//                System.out.println(e);
//            }
//        }

        //for serDaemon() method
//        while(true){
//            System.out.println("Hello World !");
//        }
    }

    public static void main(String[] args) throws InterruptedException {
//        MyThread t1 = new MyThread();
//        System.out.println(t1.getState()); // NEW
//        t1.start();
//        System.out.println(t1.getState()); // RUNNABLE
//        Thread.sleep(100); // main thread sleep
//        System.out.println(t1.getState()); // RUNNING will print
//        t1.join(); // join method used to first complete a thread. Here main thread waits for t1 thread to complete
//        System.out.println(t1.getState()); // TERMINATED


//setPriority() method
        // it has three main priority MIN, MAX, MEDIUM

//          MyThread lowP = new MyThread("Low Priority Thread");
//          MyThread medP = new MyThread("Medium Priority Thread");
//          MyThread highP = new MyThread("High Priority Thread");

//        lowP.setPriority(MIN_PRIORITY);
//        medP.setPriority(NORM_PRIORITY);
//        highP.setPriority(MAX_PRIORITY);
//        lowP.start();
//        medP.start();
//        highP.start();

// setDaemon()
//        MyThread t1 = new MyThread("thread1");
//        t1.setDaemon(true); // if we dont use it then the while loop run infinitely
//        t1.start();
//        MyThread t2 = new MyThread("thread2");
////        t2.start(); // run infinitely
//        System.out.println("main done!");



    }
}
