package lessons.lesson27_xml_json._04_stax;

import lessons.lesson27_xml_json._00_model.CatModel;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class StaxPocessor {
    private static final String PATH = "src\\lessons.lesson27_xml_json\\_04_stax\\resource\\cats.xml";


    public static List<CatModel> parseXml() {
        List<CatModel> cats = new ArrayList<>();

        try {
            XMLInputFactory factory = XMLInputFactory.newInstance();
            XMLStreamReader reader = factory.createXMLStreamReader(new FileReader(PATH));
            CatModel cat = null;
            while (reader.hasNext()) {
                reader.next();
                if (reader.getEventType() == XMLStreamReader.START_ELEMENT) {
                    if (reader.getLocalName().equalsIgnoreCase("cat")) {
                        cat = new CatModel();
                        if (reader.getAttributeCount() > 0) {
                            String regNumber = reader.getAttributeValue(null, "regNumber");
                            cat.setRegNumber(Integer.parseInt(regNumber));

                        }
                    }

                        if (reader.getLocalName().equalsIgnoreCase("name")) {
                            cat.setName(reader.getElementText());
                        }
                         if (reader.getLocalName().equalsIgnoreCase("age")) {
                            cat.setAge(Integer.parseInt(reader.getElementText()));
                        }

                    }
                if(reader.getEventType() == XMLStreamReader.END_ELEMENT){
                    if(reader.getLocalName().equalsIgnoreCase("cat")){
                        cats.add(cat);
                    }
                }
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (XMLStreamException e) {
            e.printStackTrace();
        }


        return cats;
    }
}
