package lessons.lesson26_serialization._02_standard._03_transient;

import java.io.Serializable;
import java.util.StringJoiner;

public class StandardCat implements Serializable {

    static final long serialVersionUID = 1L;//у каждого класса на основе полей высчитывается  у объекта. Во время сериализации оно записывается в поток

    //если мы его не объявим, то оно будет создано автоматически

    static String STATIC_FIELD = "static";//поля помеченные статик несериализуются
    final String name;//final поля сериализуются
    transient StandardBox box;

    public StandardCat(String name, StandardBox box) {
        this.name = name;
        this.box = box;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", StandardCat.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("box=" + box).add("Static = " + STATIC_FIELD)
                .toString();
    }
}
