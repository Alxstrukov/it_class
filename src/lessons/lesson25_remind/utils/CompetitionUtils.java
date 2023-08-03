package lessons.lesson25_remind.utils;

import lessons.lesson25_remind.exceptions.CompetitionException;
import lessons.lesson25_remind.model.Animal;
import lessons.lesson25_remind.model.Cat;
import lessons.lesson25_remind.model.Dog;
import lombok.experimental.UtilityClass;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import static lessons.lesson25_remind.constants.CompetitionConstants.*;

@UtilityClass
public class CompetitionUtils<T> {

    public static void parseFile(List<Cat> cats, List<Dog> dogs, Map<String, String> errors) {

        try (Scanner scanner = new Scanner(new FileReader(PATH_TO_FILE))) {
            while (scanner.hasNextLine()) {
                fillingCollection(scanner.nextLine(), cats, dogs, errors);
            }
        } catch (FileNotFoundException exception) {
            System.out.printf("File hasn't been found by path \"%s\"%n", PATH_TO_FILE);
            System.exit(1);
        }
    }

    private static void fillingCollection(String textLine, List<Cat> cats, List<Dog> dogs, Map<String, String> errors) {
        try {
            Animal animal = AnimalFactory.getInstance(textLine);
            if (animal instanceof Cat) {
                cats.add((Cat) animal);
            } else {
                dogs.add((Dog) animal);
            }
        } catch (CompetitionException e) {
            processException(errors, e);
        }
    }

    private static void processException(Map<String, String> errors, CompetitionException e) {
        Pattern pattern = Pattern.compile(EMAIL_REGEX);
        Matcher matcher = pattern.matcher(e.getErrorLine());
        if (matcher.find()) {
            errors.put(matcher.group(), String.format("Error in string \"%s\" - %s%n", e.getErrorLine(), e.getCause().getMessage()));
        } else {
            System.out.println(String.format("Error in string \"%s\" - %s%n", e.getErrorLine(), e.getCause().getMessage()));
        }
    }

    public static void printResults(List<Cat> cats, List<Dog> dogs) {
        System.out.println("Cats list size: " + cats.size());
        printList(cats);
        System.out.println("Dogs list size: " + dogs.size());
        printList(dogs);
    }

    public static <T> List<T> sortByBirthDate(List<T> animals) {
        return animals.stream().sorted().collect(Collectors.toList());
    }

    private static <T> void printList(List<T> list) {
        list.forEach(System.out::println);
    }


    public static <T extends Animal> List<T> filterAnimals(List<T> participants, boolean isYoung) {
        return participants.stream().filter(isYoung ? YOUNG_PREDICATE : OLD_PREDICATE).collect(Collectors.toList());
    }

    public static void printResults(List<Cat> youngCats, List<Dog> youngDogs, List<Cat> oldCats, List<Dog> oldDogs, Map<String, String> errors) {
        System.out.println("First day participants: ");
        printResults(youngCats, youngDogs);
        System.out.println("----------------------------------------");
        System.out.println("Second day participants: ");
        System.out.println("Cats list size: " + oldCats.size());
        printList(oldCats);
        System.out.println("Dogs list size: " + oldDogs.size());
        printList(oldDogs);
        printMap(errors);
    }

    private static void printMap(Map<String, String> errors) {
        if (!errors.isEmpty()) {
            System.out.println("Errors quantity: " + errors.size());
            errors.forEach((k, v) -> System.out.println(k + ": " + v));
        }
    }
}
