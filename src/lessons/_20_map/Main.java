package lessons._20_map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();//не сохраняет порядок добавления, распределяет по хэшу
        map.put("One",1);
        map.put("Two",2);
        map.put("Three",3);
        map.put("Four",4);
//        System.out.println(map.keySet());
//        System.out.println(map.values());

        System.out.println(map);
        Map<String,Integer>map1 = new LinkedHashMap<>();//сохраняет порядок добавления
        map1.put("One",1);
        map1.put("Two",2);
        map1.put("Three",3);
        map1.put("Four",4);
        System.out.println(map1);

        Map<String,Integer>map2 = new TreeMap<>();//отсортирует по алфавиту
        map2.put("One",1);
        map2.put("Two",2);
        map2.put("Three",3);
        map2.put("Four",4);
        System.out.println(map2);
        //список областей через список, сет,


    }

}
