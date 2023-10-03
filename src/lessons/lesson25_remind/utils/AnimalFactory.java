package lessons.lesson25_remind.utils;

import lessons.lesson25_remind.exceptions.CompetitionException;
import lessons.lesson25_remind.model.Animal;
import lessons.lesson25_remind.model.Cat;
import lessons.lesson25_remind.model.Dog;
import lessons.lesson25_remind.model.Genus;
import lombok.experimental.UtilityClass;

import java.time.LocalDate;

import static lessons.lesson25_remind.constants.CompetitionConstants.*;

@UtilityClass
public class AnimalFactory {
    public static Animal getInstance(String textString) throws CompetitionException {
        String[] split = textString.split(DELIMETER);
        try {
            long chipNumber = Long.parseLong(validateStringMatches(split[0], CHIP_REGEX));
            String name = validateStringByEmpty(split[2]);
            LocalDate birthDate = LocalDate.parse(split[3], FORMATTER);
            String breed = validateStringByEmpty(split[4]);
            String email = validateStringMatches(split[5], EMAIL_REGEX);
            return split[1].equalsIgnoreCase("cat") ? new Cat(chipNumber, Genus.of(split[1]), name, birthDate, breed, email) :
                    new Dog(chipNumber, Genus.DOG, name, birthDate, breed, email);
        } catch (IllegalStateException e) {
            throw new CompetitionException(e, textString);
        }
    }

    private static String validateStringMatches(String value, String regex) throws IllegalStateException {

        if (value.matches(regex)) {
            return value;

        }
        throw new IllegalStateException("Chip number or email has invalid format");
    }

    private static String validateStringByEmpty(String value) throws IllegalStateException {
        if (!value.isEmpty()) {
            return value;

        }
        throw new IllegalStateException("Name or breed is empty");
    }


}
