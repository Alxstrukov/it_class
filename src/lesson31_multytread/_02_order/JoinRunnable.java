package lesson31_multytread.order;

import lombok.SneakyThrows;

public class JoinRunnable extends Thread {

    public JoinRunnable(String name) {
        super(name);
    }

    @SneakyThrows
    @Override
    public void run() {
        String currentThreadName = Thread.currentThread().getName();
        for (int i = 0; i < 10; i++) {
            System.out.println(currentThreadName + " is running! ");
            Thread.sleep(500);

        }
        System.out.println(currentThreadName + " completed! ");
    }
}
