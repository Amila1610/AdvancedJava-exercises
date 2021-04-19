package seven.thread;

public class HelloRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("Hello from second Thread. My name is: " + Thread.currentThread().getName());

    }
}
