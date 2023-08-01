package lessons.lesson23._01_lambda.interfaces.impl;

import lessons.lesson23._01_lambda.interfaces.Searchable;
import lessons.lesson23._01_lambda.model.Cat;

public class AgeSearchable implements Searchable<Integer> {
    @Override
    public boolean test(Cat cat, Integer value) {
        return cat.getAge() == value;
    }
}
