package lesson27_xml_json._06_json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import lesson27_xml_json._00_model.CatModel;
import lesson27_xml_json._05_jaxb.model.CatJaxb;

import java.io.*;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class Main {
    private static final String PATH = "src\\lesson27_xml_json\\_06_json\\resources\\cats.json";

    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();
    private static final Type TYPE = new TypeToken<List<CatJaxb>>(){}.getType();

    public static void main(String[] args) throws IOException {
        List<CatJaxb> cats = List.of(
                new CatJaxb(1, "Murzik", 2),
                new CatJaxb(2,"Masha",3),
                new CatJaxb(2,"Murka",4),
                new CatJaxb(2,"Barsik",5)
        );

        String gsonString = gson.toJson(cats);
        OutputStream os = new FileOutputStream(PATH);
        os.write(gsonString.getBytes(StandardCharsets.UTF_8));

        List<CatJaxb>catsFromString = gson.fromJson(new FileReader(PATH),TYPE);
        catsFromString.forEach(System.out::println);
    }
}
