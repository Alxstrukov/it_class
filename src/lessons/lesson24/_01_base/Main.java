package lessons.lesson24_01_base._01_base;

import lessons.lesson23._01_lambda.model.Breed;
import lessons.lesson23._01_lambda.model.Cat;

import java.util.List;
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

        Stream<Cat> catStream = cats.stream();
        System.out.println(catStream.filter(it -> it.getAge() > 2).count());


    }
}
