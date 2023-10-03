package lessons.lesson17_18_19._03_set;

import java.util.HashSet;
import java.util.Set;

public class Main {

       //System.exit(0); прекращает выполение программы, после этой команды не выполнится блок finally

    public static void main(String[] args) {
        Set<Cat> set = new HashSet<>();
        Cat cat1 = new Cat("Barsik", 2, "Vasya");
        Cat cat2 = new Cat("Murzik", 3, "Lesha");

        set.add(cat1);
        set.add(cat2);
        System.out.println(set);
        cat2.setName("Masha");//поменяли имя, стал другой хэшкод, поэтому следующая строчка не удалит этот объект
        set.remove(cat2);
        System.out.println(set);

        Set<Integer>intSet = new HashSet<>();
        intSet.add(1);
        intSet.add(5);
        intSet.add(3);
        intSet.add(2);
        intSet.add(15);
        intSet.add(16);
        System.out.println(intSet);

        //если не переопределить equals то Set не поймет, уникальный перед ним объект, или он уже содержится в Set.
        // Это происходит потому что непереопределенный equals сравнивает по ссылкам, так же как и двойное равно.
        //Поэтому нужно обязательно переопределять equals и hashсode


    }
}
