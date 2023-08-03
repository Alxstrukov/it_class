package lessons.lesson27_xml_json._05_jaxb.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@XmlAccessorType(XmlAccessType.FIELD) //это значит что парсится будет по полям
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class CatJaxb {
    @XmlAttribute //казали что это поле - аттрибут
    private int regNumber;
    private String name;
    private int age;


}
