package lessons.lesson31_multytread._03_race;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class BankAccount {
    private long balance;
    private final Object lock = new Object();

    //synchronized используется для того, чтобы монитор закрывал достпуп к этому полю во время работы одного метода
    //он также делает операцию атомарной
    //используется для того, чтобы избежать такого понятия как гонки

    public void withdraw(long amount) {
        synchronized (lock) {
            long newAmount = balance - amount;
            balance = newAmount;
            //в данном случае мы синхронизируем блок, а не метод
            //это немножко быстрей, чем синхронизация метода

        }

    }

    public synchronized void deposit(long amount) {
        synchronized (lock) {
            long newAmount = balance + amount;
            balance = newAmount;
        }


    }
    //статические методы также можно синхронизировать
    //в данном случае метод синхронизируется по монитору объекта самого класса
}
