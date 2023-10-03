package lessons.lesson31_multytread._06_interrupt;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        do {
            if (!Thread.interrupted()) {
                System.out.println("Running");
                try {
                    Thread.sleep(1 * 1000);
                } catch (InterruptedException e) {
                    return;
                }
            } else {
                return;
            }
        } while (true);
    }
}
