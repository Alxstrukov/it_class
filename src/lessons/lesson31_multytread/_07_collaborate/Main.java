package lesson31_multytread._07_collaborate;

public class Main {
    public static void main(String[] args) {
        var myQueue = new MyQueue();
        Consumer consumer = new Consumer(myQueue);
        Producer producer = new Producer(myQueue);
        var t1 = new Thread(consumer);//передали объект типа Runnable
        var t2 = new Thread(producer);//передали объект типа Runnable

        t1.start();
        t2.start();
    }
}
