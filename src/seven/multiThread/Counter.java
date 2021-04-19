package seven.multiThread;

public class Counter {

    private volatile int counter=0;

    public synchronized void increment(){
        counter++;
    }
    public synchronized void decrement(){
        counter--;
    }
    public int value(){
        synchronized (this){
            return counter;
        }
    }
}
