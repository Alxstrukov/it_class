package lesson31_multytread._05_stop;



public class Main {
    public static void main(String[] args) throws InterruptedException {
        var myRunnable = new MyRunnable();
        var thread = new Thread(new MyRunnable());
        thread.start();
        Thread.sleep(10*1000);
        myRunnable.doStop();
    }
}
