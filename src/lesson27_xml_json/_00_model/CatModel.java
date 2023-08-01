package lesson27_xml_json._00_model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import lombok.ToString;

@AllArgsConstructor
@ToString
@NoArgsConstructor
@Data
public class CatModel {
    private int regNumber;
    private String name;
    private int age;
}
