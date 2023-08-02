package lesson26_serialization._04_externakizable;

import java.io.*;
import java.sql.SQLOutput;

public class Main {
    private static final String PATH = "src\\lesson26_serialization\\_04_externakizable\\resource\\save.save";
    public static void main(String[] args) {
       ExtendedUser extendedUser =  new ExtendedUser("Vasya Pupkin","vasek125","Thi$ismYpa$$");

        try(ObjectOutput ou = new ObjectOutputStream(new FileOutputStream(PATH));
        ObjectInput oi = new ObjectInputStream(new FileInputStream(PATH))) {
            System.out.println(extendedUser);
            ou.writeObject(extendedUser);
            System.out.println("===========================");
            ExtendedUser fromFile = (ExtendedUser) oi.readObject();
            System.out.println(fromFile);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
