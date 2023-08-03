package lessons.lesson27_xml_json._03_dom;

import lessons.lesson27_xml_json._00_model.CatModel;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<CatModel> cats = DomProcessor.parseXml();
        cats.forEach(System.out::println);
    }
}
