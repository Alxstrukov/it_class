package lessons.lesson22.pattern;


//регулярки - это шаблон для поиска в текте
//Используются 2 класса Pattern и Match
//в Java любое представление шаблона это всегда строка


import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String str = "java .net javascript";
        System.out.println(str.matches("\\d{5}"));
        //Регулярки можно разделить нанесколько групп
        //первые - метасимволы
        //^ - начало строки; $ -конец строки;
        // \d - цифра
        // \b - конец слова
        // .-любой символ
        // \t, \n, \r

        //для группировки
        //[asd] - один какой нибудь символ из этих трех
        //[^asd] - все символы кроме тех, что перечислены в скобках
        //[a-zA-Z]- все символы алфавита

        //Квантификаторы
        //?, * + {n} {n,}

        // Pattern pattern = Pattern.compile("java",Pattern.CASE_INSENSITIVE);// в строке найти java независимо от регистра
        // System.out.println(pattern.pattern());//вернет java
//
//        Pattern pattern = Pattern.compile("\\s");
//        String[]strings = pattern.split(str);
//        System.out.println(Arrays.toString(strings));


        System.out.println(Pattern.matches("Java","Java is a language"));//проверяет на полное совпадение,
        //вернет false



    }
}
