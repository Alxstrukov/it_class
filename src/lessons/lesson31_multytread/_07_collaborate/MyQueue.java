package lesson31_multytread._07_collaborate;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;

@RequiredArgsConstructor//создаст коструктор в который войдут только поля @NonNull или final
public class MyQueue {
    private int i;
    @NonNull// это поле войдет в коснтруктор
    boolean valueSet = false;

    @SneakyThrows
    public synchronized int get() {
        while (!valueSet) {
            wait();
        }
        System.out.println("Received " + i);
        valueSet = false;
        notify();
        return i;
    }

    @SneakyThrows
    public synchronized void put(int i) {
        while (valueSet) {
            wait();
        }
        valueSet = true;
        this.i = i;
        System.out.println("Sent " + i);
        notify();
    }
}
