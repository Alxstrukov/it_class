package lesson31_multytread._01_base;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Running in:  " + Thread.currentThread());
        System.out.println("Hello from Runnable");
    }
}
