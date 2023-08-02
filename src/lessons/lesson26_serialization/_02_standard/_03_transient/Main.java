package lesson26_serialization._02_standard._03_transient;

import lesson26_serialization._02_standard.Child;

import java.io.*;
import java.util.Arrays;

public class Main {
    private static final String PATH_TO_FILE = "src\\lesson26_serialization\\_02_standard\\_03_transient\\resources\\cat.save";

    public static void main(String[] args) {
        StandardCat vaska = new StandardCat("Vaska", new StandardBox(Arrays.asList("mouse", "ball")));
        System.out.println(vaska);
        try (FileOutputStream os = new FileOutputStream(PATH_TO_FILE);
             ObjectOutputStream oos = new ObjectOutputStream(os);
             FileInputStream fis = new FileInputStream(PATH_TO_FILE);
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            oos.writeObject(vaska);
            StandardCat.STATIC_FIELD = "new value";
            StandardCat fromFile = (StandardCat) ois.readObject();
            System.out.println(fromFile);



        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
