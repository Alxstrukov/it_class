package lesson27_xml_json._04_stax;

import lesson27_xml_json._00_model.CatModel;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<CatModel>cats=StaxPocessor.parseXml();
        cats.forEach(System.out::println);
    }
}
