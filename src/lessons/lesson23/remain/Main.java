package lessons.lesson23.remain;

import lessons.lesson23._01_lambda.model.Breed;
import lessons.lesson23._01_lambda.model.Cat;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Cat> cats = List.of(
                new Cat("Cat2", Breed.SIAM, 1),
                new Cat("Cat3", Breed.GARBAGE, 3),
                new Cat("Cat4", Breed.SIBERIAN, 2),
                new Cat("Cat5", Breed.SIAM, 1),
                new Cat("Cat6", Breed.SIBERIAN, 1)
        );
        List<Cat> sibCats = getSiberian(cats);
        System.out.println(sibCats);
        Predicate<Cat> siberianCats = cat -> cat.getType().equals(Breed.SIBERIAN);

        List<Cat> streamList = cats.stream().filter(siberianCats).collect(Collectors.toList());//получаем всех сибирских котов из
        // коллекции не используя цикла и того метода, что написан внизу

        List<String> getCatsNames = cats.stream().map(it -> it.getName()).collect(Collectors.toList());//получаем стрим котов, функцией map получаем
        // список имен и получаем коллекцию имен с помощью map
        List<String> siberianCatNames = cats.stream().filter(siberianCats).map(cat -> cat.getName()).collect(Collectors.toList());//получили спиок имен всех сибирских котов

        cats.stream().forEach(System.out::println);


    }

    private static List<Cat> getSiberian(List<Cat> cats) {
        List<Cat> newList = new ArrayList<>();
        for (Cat cat : cats) {
            if (cat.getType().equals(Breed.SIBERIAN)) {
                newList.add(cat);
            }
        }
        return newList;
    }

}
