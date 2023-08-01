package lessons._20_map.homework;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Departments> dict = new HashMap<>();
        Departments gomelDep = new Departments(Arrays.asList("Vetka", "Dobrush"));
        Departments brestDep = new Departments(Arrays.asList("Pinsk", "Kobrin"));
        gomelDep.addDepartment("Mozir");
        dict.put(Regions.GOMEL.value, gomelDep);
        dict.put(Regions.BREST.value, brestDep);
        System.out.println(dict);
    }

    private static enum Regions {
        GOMEL("Gomel"),
        BREST("Brest");

        String value;

        Regions(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    private static class Departments {
        List<String> departments;

        public Departments(List<String> departments) {
            this.departments = new ArrayList<>(departments);
        }

        public void addDepartment(String dep) {
            departments.add(dep);
        }

        @Override
        public String toString() {
            return "Departments{" +
                    "departments=" + departments +
                    '}';
        }
    }
}
