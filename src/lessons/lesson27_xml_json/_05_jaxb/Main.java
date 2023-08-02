package lesson27_xml_json._05_jaxb;

import jakarta.xml.bind.JAXBException;
import lesson27_xml_json._05_jaxb.model.CatJaxb;
import lesson27_xml_json._05_jaxb.utils.CatUtils;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws JAXBException, IOException {
        List<CatJaxb> cats = List.of(
                new CatJaxb(1, "Murzik", 2),
                new CatJaxb(2,"Masha",3),
                new CatJaxb(2,"Murka",4),
                new CatJaxb(2,"Barsik",5)
        );

        CatUtils.marshal(cats);
        List<CatJaxb> fromFile = CatUtils.unmarshal();
        CatUtils.printCollection(fromFile);

    }
}

