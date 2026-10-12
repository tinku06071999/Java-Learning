package ProducerConsumer;

public class Producer implements Runnable{
    SharedResource sharedResource;
    public Producer(SharedResource sharedResource){
        this.sharedResource = sharedResource;
    }
    @Override
    public void run() {
        // Implementation for producer logic
        System.out.println("Producer Thread: " + Thread.currentThread().getName() + " is producing items.");
        try {

        }catch (Exception e){

        }
        sharedResource.addItem();
    }

}
