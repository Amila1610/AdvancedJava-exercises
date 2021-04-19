package seven.thread;

public class HelloThread extends Thread {

    @Override
    public void run() {
        System.out.println("Hello from the third Thread: " + Thread.currentThread().getName());
    }
}
