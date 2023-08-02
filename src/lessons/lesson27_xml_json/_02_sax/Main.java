package lesson27_xml_json._02_sax;

import lesson27_xml_json._00_model.CatModel;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser parser = factory.newSAXParser();
            SaxHandler handler = new SaxHandler();
            parser.parse(new FileInputStream("src\\lesson27_xml_json\\_02_sax\\resource\\cats.xml"), handler);
            List<CatModel> cats = handler.getCats();
            cats.forEach(System.out::println);

        } catch (ParserConfigurationException | SAXException | FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
