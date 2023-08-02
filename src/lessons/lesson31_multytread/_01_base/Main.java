package lesson31_multytread._01_base;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        //Thread.currentThread().setName("My name");//мы можем установить имя потока
        //System.out.println(Thread.currentThread());//получаем текущий поток, его имя и приоритет, все потоки по умолчанию имеют приоритет 5
        //Thread.currentThread().setPriority(1);//утсанавливая приоритет мы можем оганизовать работу потоков в том порядке, в котором хотим
        //System.out.println(Thread.currentThread());


//        System.out.println("Creating new thread from: " + Thread.currentThread());
//        var myThread = new MyThread();
//        myThread.setDaemon(true);
//        myThread.start();
//        myThread.join();
//
//        System.out.println("Leaving from: " + Thread.currentThread());
//        System.out.println("Creating new thread from: " + Thread.currentThread());
//        var myRunnable = new Thread(new MyRunnable());
//        myRunnable.start();
//        myRunnable.join();
//        System.out.println("Leaving from: " + Thread.currentThread());


        //потоки можно создавать с помощью анонимного класса или с помощью лямбды, в которых мы переопределяем метод run()
        var myThread = new Thread(()->{
            System.out.println("Using thread from" + Thread.currentThread());
        });
        myThread.start();

        var myRunnable = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Using Runnable from" + Thread.currentThread());
            }
        });

        myRunnable.start();


    }
}
