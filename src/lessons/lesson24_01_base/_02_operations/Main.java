package lessons.lesson24_01_base._02_operations;

import lessons.lesson23._01_lambda.model.Breed;
import lessons.lesson23._01_lambda.model.Cat;
import org.w3c.dom.ls.LSOutput;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<Cat> cats = List.of(
                new Cat("Cat2", Breed.SIAM, 1),
                new Cat("Cat3", Breed.GARBAGE, 3),
                new Cat("Cat4", Breed.SIBERIAN, 2),
                new Cat("Cat5", Breed.SIAM, 1),
                new Cat("Cat6", Breed.SIBERIAN, 1)
        );
        List<Cat> cats2 = List.of(
                new Cat("Cat2", Breed.SIAM, 1),
                new Cat("Cat3", Breed.GARBAGE, 3),
                new Cat("Cat4", Breed.SIBERIAN, 2),
                new Cat("Cat5", Breed.SIAM, 1),
                new Cat("Cat6", Breed.SIBERIAN, 1)
        );

        System.out.println(cats.stream().allMatch(it -> it.getAge() < 10));//возвращает тру если все элементы подходят под условие
        System.out.println(cats.stream().allMatch(it -> it.getAge() == 3));

        System.out.println(cats.stream().anyMatch(it -> it.getAge() == 3));//возвращает тру если хотя бы один элемент соответствует услувию

        Stream<Cat> unionStream = Stream.concat(cats.stream(), cats2.stream());//объединяет два стрима в один
//        System.out.println(unionStream.count());//возвращает кол-во элементов в стриме

//        System.out.println(unionStream.distinct().count());//ыбирает из потока только уникальные элементы
//
//        cats.stream().filter(it -> it.getName().length() > 5 && it.getAge() > 3);
//        Cat firstCat = cats.stream().filter(it -> it.getAge() > 10).findFirst().orElse(new Cat("noname", Breed.GARBAGE, 0));
//        System.out.println(firstCat);
//
//        cats.stream().forEach(System.out::println);

    //    cats.stream().skip(2).limit(2).forEach(System.out::println);//skip пропускает элементы,limit ограничивает стрим

     //   System.out.println(cats.stream().max(Comparator.comparingInt(Cat::getAge)));//возвращает максимальное значение по условию
       // System.out.println(cats.stream().min(Comparator.comparingInt(Cat::getAge)));//озвращает минимальное значение по условию

      //  cats.stream().map(it -> it.getName()).forEach(System.out::println);

        Stream<String>stringStream=Stream.ofNullable(null);//озвращает поток из одного объекта если он не null инча возвращает пустую строку
        System.out.println(cats.stream().map(it -> it.getAge()).reduce(Integer::sum));

        int identity = 2;
        System.out.println(cats.stream().map(it -> it.getAge()).reduce(identity, (x, y) -> x * y));

        cats.stream().filter(it->it.getAge()<3).collect(Collectors.toCollection(HashSet::new));
        System.out.println(cats.stream().collect(Collectors.toMap(Cat::getName, Cat::getAge)));//преобразование в map


    }
}
