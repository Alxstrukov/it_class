package lesson22.matcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("best");
        Matcher matcher = pattern.matcher("Java is the best language"); //этого еще недостаточно для работы
        matcher.find();//ищет совпадения
        System.out.println(matcher.group());

        System.out.println(matcher.lookingAt());//ищет совпадения только в начале
        matcher.usePattern(Pattern.compile("is"));
        System.out.println(matcher.find());
        matcher.reset();
        //используется для сбрасывания состояния, если один и  тот же matcher используетсяя несколько раз

        String str = "John Johnson Frank Erickson";
        pattern = Pattern.compile("John.*\\b");//жадный квантификатор
        matcher = pattern.matcher(str);

        String replacedString = matcher.replaceAll("Erick");
        System.out.println(replacedString);

        pattern = Pattern.compile("John.*?\\b"); //ленивый квантификатор
        matcher = pattern.matcher(str);
        replacedString = matcher.replaceAll("Erick");
        System.out.println(replacedString);

        pattern = Pattern.compile("John"); //ленивый квантификатор
        matcher = pattern.matcher(str);
        replacedString = matcher.replaceAll("Erick");
        System.out.println(replacedString);

        pattern = Pattern.compile("(java\\w*)"); //в скобки мы заключаем группу символов для поиска, кол-во скобок определяет кол-во групп
        matcher = pattern.matcher("java .net javascript");

        while(matcher.find()){
            System.out.println(matcher.group());
        }

        str = "http://yandex.ru.1258.html";
        pattern =Pattern.compile("http://[a-z\\.]*(\\d+).html");
        matcher = pattern.matcher(str);
        matcher.find();
        System.out.println(matcher.group(1));

        System.out.println(matcher.groupCount()); //метод считает кол-во групп, в данном примере будет одна группа
// метод matcher.start() -вернет индекс начала вхождения  символа в группу

        String str1 = "Java Angular JavaScripta";
        Pattern pattern1 = Pattern.compile("A.*?a");
        Matcher matcher1 = pattern1.matcher(str1);
        while(matcher1.find()){
            System.out.println(str1.substring(matcher1.start(),matcher1.end()));
        }


    }
}
