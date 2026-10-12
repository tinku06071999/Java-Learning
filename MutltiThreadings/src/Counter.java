public class Counter {

    // for synchronization

    private int count = 0;

    //if we not use synchronised keyword before the void here or with count++(i.e. shared resource) then result is not predictable
    // but when we used synchronized keyword here then result will be as expected
    //without synchrinized keyword is is k/a critical case (the shared resource) and the situation is race condition
    // after using synchronised keyword race condition will go and if more than one
    // thread are accessing a shared resource than only one thread will access that at a time
    // this is k/a mutual exclusion

    public  void increment(){
        count++;
    }
    public int getCount(){
        return count;
    }

}
