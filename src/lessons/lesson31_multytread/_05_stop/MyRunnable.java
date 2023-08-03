package lessons.lesson31_multytread._05_stop;

import lombok.SneakyThrows;

public class MyRunnable implements Runnable {
    private boolean doStop = false;

    public synchronized void doStop(){
        this.doStop = true;
    }

    public boolean keepRunning(){
        return !doStop;
    }
    @SneakyThrows
    @Override
    public void run() {

        while(keepRunning()){
            System.out.println("I am running");
            Thread.sleep(3*1000);

        }
    }
}
