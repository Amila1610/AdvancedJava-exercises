package seven.thread;

public class Executor {
    public static void main(String[] args) {

        System.out.println("Hello from: " + Thread.currentThread().getName());

        HelloRunnable helloRunnable=new HelloRunnable();
        //Second Thread
        Thread newThread= new Thread(helloRunnable);
        System.out.println("Befor the function...");
        newThread.start();

        //Third Thread
        new HelloThread().start();
    }
}
