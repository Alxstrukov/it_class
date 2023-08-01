package lessons.lesson23._01_lambda.interfaces;

import lessons.lesson23._01_lambda.model.Cat;

public interface Searchable<T> {
    boolean test(Cat cat, T value);
}
