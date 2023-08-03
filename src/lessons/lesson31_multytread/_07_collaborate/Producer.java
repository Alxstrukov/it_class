package lessons.lesson31_multytread._07_collaborate;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Producer implements Runnable{

    private MyQueue myQueue;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            myQueue.put(i);
        }
    }
}
