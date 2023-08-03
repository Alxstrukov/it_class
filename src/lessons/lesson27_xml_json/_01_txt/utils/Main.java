package lessons.lesson27_xml_json._01_txt.utils;

import lessons.lesson27_xml_json._01_txt.model.TxtCat;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<TxtCat>txtCats = txtCatUtils.extract();
        txtCatUtils.printCats(txtCats);
    }
}
