package lessons.lesson23._01_lambda.interfaces.impl;

import lessons.lesson23._01_lambda.interfaces.Searchable;
import lessons.lesson23._01_lambda.model.Breed;
import lessons.lesson23._01_lambda.model.Cat;

public class BreedSearchable implements Searchable<Breed> {
    @Override
    public boolean test(Cat cat, Breed value) {
        return cat.getType().equals(value);
    }
}
