package lesson31_multytread._04_dead_lock;

import lombok.SneakyThrows;

public class TestDeadLock {
    public static Object lock1 = new Object();
    public static Object lock2 = new Object();

    public static void main(String[] args) {
        var t1 = new TestThread1();
        var t2 = new TestThread2();
        t1.start();
        t2.start();
    }

    private static class TestThread1 extends Thread{
        @SneakyThrows
        @Override
        public void run() {
           synchronized (lock1){
               System.out.println("Thread 1: Holding lock 1....");
               Thread.sleep(10);
               System.out.println("Thread 1: waiting for lock 2 ");
               synchronized (lock2){
                   System.out.println("Thread 1 Holding lock 1 and lock 2.....");
               }
           }
        }
    }
    private static class TestThread2 extends Thread{
        @SneakyThrows
        @Override
        public void run() {
            synchronized (lock1){
                System.out.println("Thread 2: Holding lock 2....");
                Thread.sleep(10);
                System.out.println("Thread 2: waiting for lock 1 ");
                synchronized (lock2){
                    System.out.println("Thread 2 Holding lock 1 and lock 2.....");
                }
            }
        }
    }
}
