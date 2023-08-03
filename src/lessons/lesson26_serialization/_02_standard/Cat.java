package lessons.lesson26_serialization._02_standard;

import java.io.Serializable;
import java.util.StringJoiner;

public class Cat implements Serializable {
    private String name;
    private int age;

    public Cat() {
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Cat.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("age=" + age)
                .toString();
    }
}
