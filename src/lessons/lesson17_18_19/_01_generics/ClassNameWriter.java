package lessons.lesson17_18_19._01_generics;

public class ClassNameWriter {

    public <T> void writeClassName(T someObj) {
        System.out.println(someObj.getClass().getSimpleName());

    }
    public <T>T returnObj(T someObj) {
       return someObj;

    }
}
