package lessons.lesson27_xml_json._01_txt.utils;

import lessons.lesson27_xml_json._01_txt.exeptions.TxtException;
import lessons.lesson27_xml_json._01_txt.model.TxtCat;
import lombok.experimental.UtilityClass;

import java.util.Arrays;

@UtilityClass
public class TxtCatFactory {
    private static final String DELIMITER = ",";

    public static TxtCat getInstance(String string) throws TxtException {
        String[] split = string.split(DELIMITER);
        try {
            validateArrayLength(split.length);
            validateForInteger(split[0], split[2]);
            int regNumber = validateNegative(Integer.parseInt(split[0]));
            String name = validateEmpty(split[1]);
            int age = validateNegative(Integer.parseInt(split[2]));
            return new TxtCat(regNumber, name, age);


        } catch (IllegalStateException e) {
            throw new TxtException(string, e);
        }
    }

    private static void validateArrayLength(int length) {
        if (length != 3) {
            throw new IllegalStateException("Wrong line format");
        }
    }

    private static void validateForInteger(String... strings) {
        try {
            Arrays.stream(strings).forEach(Integer::parseInt);
        } catch (NumberFormatException e) {
            throw new IllegalStateException("Number or age is not a int");
        }
    }

    private static int validateNegative(int value) {
        if (value <= 0) {
            throw new IllegalStateException("Negative value for reg number or age");
        }
        return value;
    }

    private static String validateEmpty(String name) {
        if (name.isEmpty()) {
            throw new IllegalStateException("Name is empty");
        }
        return name;
    }

}
