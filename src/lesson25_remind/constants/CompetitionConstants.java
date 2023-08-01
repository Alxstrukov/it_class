package lesson25_remind.constants;

import lesson25_remind.model.Animal;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.function.Predicate;

public class CompetitionConstants {
    public static final String PATH_TO_FILE = "src\\lesson25_remind\\data\\pet.txt";
    public static final String DELIMETER = "[,;]";
    public static final String CHIP_REGEX = "(?=\\d{15}\\b)\\d{3}09(?:81|56)\\d{8}";
    public static final String EMAIL_REGEX = "\\w+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*\\.\\w{2,4}";
    public static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd-MM-y");

    public static final LocalDate AGE_DELIMETER = LocalDate.now().minusYears(2);
    public static final Predicate<Animal> YOUNG_PREDICATE = it -> it.getBirthDate().isAfter(AGE_DELIMETER);
    public static final Predicate<Animal> OLD_PREDICATE = it -> it.getBirthDate().isBefore(AGE_DELIMETER);


}
