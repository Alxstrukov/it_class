package lesson27_xml_json._05_jaxb.utils;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;
import lesson27_xml_json._05_jaxb.model.CatAggregator;
import lesson27_xml_json._05_jaxb.model.CatJaxb;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CatUtils {

    private static final String INPUT_FILE = "src\\lesson27_xml_json\\_05_jaxb\\resources\\cats.xml";
    private static final String OUTPUT_FILE = "src\\lesson27_xml_json\\_05_jaxb\\resources\\fileCats.xml";

    public static List<CatJaxb> unmarshal() throws JAXBException, FileNotFoundException {
        JAXBContext jaxbContext = JAXBContext.newInstance(CatAggregator.class);//указываем что именно мы хотим получить
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();//создаем аналог парс

        CatAggregator catAggregator = (CatAggregator) unmarshaller.unmarshal(new FileReader(INPUT_FILE));
        return catAggregator.getCats();
    }

    public static void marshal(List<CatJaxb> cats) throws JAXBException, IOException {
        CatAggregator catAggregator = new CatAggregator();
        catAggregator.setCats(cats);
        JAXBContext jaxbContext = JAXBContext.newInstance(CatAggregator.class);
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(catAggregator, new FileWriter(OUTPUT_FILE));
    }

    public static void printCollection(List<CatJaxb> cats) {
        cats.forEach(System.out::println);
    }
}
