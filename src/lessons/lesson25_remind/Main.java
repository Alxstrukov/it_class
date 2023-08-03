package lessons.lesson25_remind;


import lessons.lesson25_remind.model.Cat;
import lessons.lesson25_remind.model.Dog;
import lessons.lesson25_remind.utils.CompetitionUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        List<Cat> cats = new ArrayList<>();
        List<Dog> dogs = new ArrayList<>();
        Map<String, String> errors = new HashMap<>();
        CompetitionUtils.parseFile(cats, dogs, errors);
        List<Cat> sortedCats = CompetitionUtils.sortByBirthDate(cats);
        List<Dog> sortedDogs = CompetitionUtils.sortByBirthDate(dogs);

        List<Cat> youngCats = CompetitionUtils.filterAnimals(sortedCats, true);
        List<Dog> youngDogs = CompetitionUtils.filterAnimals(sortedDogs, true);
        List<Cat> oldCats = CompetitionUtils.filterAnimals(sortedCats, false);
        List<Dog> oldDogs = CompetitionUtils.filterAnimals(sortedDogs, false);
        CompetitionUtils.printResults(youngCats, youngDogs, oldCats, oldDogs, errors);


    }

}
