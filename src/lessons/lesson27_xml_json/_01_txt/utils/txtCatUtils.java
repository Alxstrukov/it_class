package lesson27_xml_json._01_txt.utils;

import lesson27_xml_json._01_txt.exeptions.TxtException;
import lesson27_xml_json._01_txt.model.TxtCat;
import lombok.experimental.UtilityClass;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@UtilityClass
public class txtCatUtils {
    private static final String PATH = "src\\lesson27_xml_json\\_01_txt\\resources\\cats.csv";

    public static List<TxtCat>extract(){
        List<TxtCat> cats = new ArrayList<>();
        try(Scanner scanner = new Scanner(new FileReader(PATH))) {
            while(scanner.hasNextLine()){
                cats.add(TxtCatFactory.getInstance(scanner.nextLine()));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (TxtException e) {
            System.err.println(e);
            System.err.println("Message: " +e.getCause().getMessage());
        }
        return cats;
    }
    public static void printCats(List<TxtCat>cats){
        cats.forEach(System.out::println);
    }
}
