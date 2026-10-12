package ProducerConsumer;

public class Consumer implements Runnable{
    SharedResource sharedResource;

    public Consumer(SharedResource sharedResource){
        this.sharedResource = sharedResource;
    }

    @Override
    public void run(){
        System.out.println("Consumer Thread: " + Thread.currentThread().getName() + " is consuming items.");
        try {
            System.out.println("Consumer Thread: " + Thread.currentThread().getName() + " is waiting for items to consume.");
        } catch (Exception e) {
            e.printStackTrace();
        }
        sharedResource.consumeItem();
    }
}
