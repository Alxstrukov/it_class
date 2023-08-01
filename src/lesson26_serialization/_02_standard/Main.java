package lesson26_serialization._02_standard;

import java.io.*;
import java.sql.SQLOutput;

public class Main {
    private static final String PATH_TO_FILE = "src\\lesson26_serialization\\_02_standard\\resourses\\save.save";

    public static void main(String[] args) throws FileNotFoundException {
        Child child = new Child(1);
        try (FileOutputStream os = new FileOutputStream(PATH_TO_FILE);
             ObjectOutputStream oos = new ObjectOutputStream(os);
             FileInputStream fis = new FileInputStream(PATH_TO_FILE);
             ObjectInputStream ois = new ObjectInputStream(fis)) {

//            Cat vasya = new Cat("Vasya", 5);
//            oos.writeObject(vasya);
//            Cat petka = (Cat)ois.readObject();
//            System.out.println(petka);
            System.out.println("Serialize: ");
            oos.writeObject(child);

            System.out.println("Deserialize: ");
            Child child1 = (Child) ois.readObject(); //при десериализации конструктор наследника не вызывается
            // в классе который не имплементит Serializable  должен быть конструктор по умолчанию
            //либо оба класса должны реализовывать интерфейс Serializable
            //Если в классе присутствуют ссылки на другие сложные объекты, то этот класс должен обязательно имплементить Serializable
            System.out.println(child1);


        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
