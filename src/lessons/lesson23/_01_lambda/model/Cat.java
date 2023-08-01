package lessons.lesson23._01_lambda.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Comparator;


@AllArgsConstructor
@Data
@ToString
public class Cat implements Comparator<Cat> {

    private String name;
    private Breed type;
    private int age;


    @Override
    public int compare(Cat o1, Cat o2) {
        return o1.getAge()-o2.getAge();
    }
}
