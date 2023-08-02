package lessons.lesson17_18_19._02_list;

import java.util.*;

public class Main {

    public static void main(String[] args) {
//        List<Animal> arrList = new ArrayList<>();//если элементы добавляются только в конец, то используем его
//        //доступ по индексу у него 1, вставка по индексу - n,у LinkedList наоборот
//        arrList.add(new Dog());
//        arrList.add(new Cat());
//        arrList.remove(1);
//        arrList.remove(Integer.valueOf(1));
//        System.out.println(arrList.size());
//        List<Cat> catList = new LinkedList<>();//связанный список
//        // скорость поиска по индексу осуществляется медленней,чем у ArrayList
//
//        //создать 2 коллеции ArrayList, LinkedList , размер 500000, заполнить случайными числами, обращаться по индексу
//        // с генератором случайных чисел,засечь время за которое вернутся значения. Затем создать массив из 50 рандомных индексов,


        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        List<String> strList = new ArrayList<>();
        strList.iterator().next();  //вызов итератора на пустой коллекции вызовет исключение NoSuchElementException




//


    }
}
