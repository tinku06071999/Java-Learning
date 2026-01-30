public class ThreadWithLambda {

    public static void main(String[] args) {
        Runnable task = new Runnable() {
            @Override
            public void run() {
                System.out.println("Doing task1");
            }
        };

        // we can convert above thing in more shorter form with the help of lambda fn

        Runnable task2 = () ->{
            System.out.println("Doing task2");
        };
        // or
        Runnable task3 = () -> System.out.println("Doing task3");

        // mpre shorter form to create a thread with Runnable

        Thread t1 = new Thread( () ->{
            for(int i =0; i<10;i++){
                System.out.println(i);
            }
        });
        t1.start();
        // lambda expression make creating thread more easy
    }
}
