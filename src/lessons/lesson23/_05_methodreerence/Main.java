package lessons.lesson23._05_methodreerence;

import java.util.function.Function;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        Function<String, Boolean> function = str -> Boolean.valueOf(str);
        System.out.println(function.apply("TRUE"));

        Function<String, Boolean> function1 = Boolean::valueOf;//заменяем выражение ссылкой на статические метод класса Boolean
        System.out.println(function1.apply("sdfsdf"));

        Integer integer = 5;
        Supplier<String> supplier = () -> integer.toString();
        System.out.println(supplier.get());

        Supplier<String> supplier1 = integer::toString;//аменяем выражение ссылкой на метод объекта integer
        System.out.println(supplier1.get());

        Function<String, String> funct = str -> str.toUpperCase();
        System.out.println(funct.apply("sdfsdf"));

        Function<String, String> funct1 = String::toUpperCase;//ссылка на нестатический метод любого объекта типа строки
        System.out.println(funct1.apply("anne"));

        Function<String, Integer> f1 = str -> new Integer(str);
        System.out.println(f1.apply("1234"));

        Function<String, Integer> f2 = Integer::new;//ссылка на конструктор
        System.out.println(f2.apply("12"));


    }
}

