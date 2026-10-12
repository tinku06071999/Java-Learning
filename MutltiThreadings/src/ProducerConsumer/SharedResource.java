package ProducerConsumer;

public class SharedResource {
    boolean isItemAvailable = false;

    public synchronized void  addItem(){
        isItemAvailable = true;

    }
    public synchronized void consumeItem(){
        isItemAvailable = false;
    }
}
