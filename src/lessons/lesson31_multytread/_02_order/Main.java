package lessons.lesson31_multytread._02_order;

public class Main {
    private static volatile boolean running;//volatile это служебное слово, которое говорит о том,
    // что значение этой переменной всегда будет браться из памяти, а не из кэша

    public static void main(String[] args) {

        var thread1 = new Thread(() -> {

            while (!running) {
            }
            System.out.print("You ");
        });

        var thread2 = new Thread(()->{
            running = true;
            System.out.print("I love ");
        });
        thread1.start();
        thread2.start();


    }
}
