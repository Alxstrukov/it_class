package lessons.lesson31_multytread._06_interrupt;

import lombok.SneakyThrows;

public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        var thread = new Thread(new MyRunnable());
        thread.start();
        Thread.sleep(5 * 1000);
        thread.interrupt();
        thread.resume();
    }
}
