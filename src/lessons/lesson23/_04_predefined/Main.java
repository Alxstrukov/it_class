package lessons.lesson23._04_predefined;

import java.util.function.*;

//встроенные функциональные интерфейсы для реализации лямб
public class Main {
    public static void main(String[] args) {
        //T->boolean
        Predicate<Integer> negativeNumbers = i -> i < 0;
        System.out.println(negativeNumbers.test(-25));

        Predicate<String> shortString = i -> i.length() < 5;
        System.out.println(shortString.test("blablabla"));

        Predicate<String> containsA = i -> i.contains("A");
        System.out.println(containsA.or(shortString).test("qazws"));

        //Consumer<T>
        //принимает значение и ничего не возвращает
        //T->void

        Consumer<String> printUpperCase = (str) -> System.out.println(str.toUpperCase());
        printUpperCase.accept("blablabla");
        Consumer<String> printLowerCase = (str) -> System.out.println(str.toLowerCase());
        printUpperCase.andThen(printLowerCase).accept("wLaBLAbLA");

        //Function
        //принимает значение какого-то типа и возвращает другой тип
        // T->R

        Function<Double, Long> doubleToLong = Math::round;
        System.out.println(doubleToLong.apply(15.85));

        //Supplier
        //возвращает либо то же значение или  разное значение
        //ничего не принимает на вход
        //()->T

        String str = "one";
        Supplier<String> supplier = str::toUpperCase;
        System.out.println(supplier.get());

        //UnaryOperator
        //T->T
        UnaryOperator<String> unaryOperator = String::toUpperCase;//ссылка на методы
        System.out.println(unaryOperator.apply("two"));




    }
}
