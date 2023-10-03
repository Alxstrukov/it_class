package lessons.lesson17_18_19._01_generics;

public class Main {
    public static void main(String[] args) {
//        BoxInt boxInt = new BoxInt(100500);
//        BoxString boxString = new BoxString("Vasya");
//
//        System.out.println(boxInt.doSmth());
//        System.out.println(boxString.doSmth());

//        var box1 = new GenericBox<>(250);
//        var box2 = new GenericBox<>("Kasym");
//        System.out.println(box1.doSmth());
//        System.out.println(box2.doSmth());


        var classNameWriter = new ClassNameWriter();
        classNameWriter.writeClassName(new BoxInt(100));
        classNameWriter.writeClassName("SomeString");

        System.out.println(classNameWriter.returnObj(100L).getClass().getSimpleName());

        System.out.println((String)doSmth("Vasia"));
        Integer result = doSmth1(15,58.5);
        System.out.println(result);

    }
    private static <T,E> T doSmth(E term){
        return (T)term.getClass().getName();
    }

    private static <T,E extends Number>T doSmth1(int firstTerm, E secondTerm){
        Integer result = firstTerm + secondTerm.intValue();
        return (T)result;

    }
}
