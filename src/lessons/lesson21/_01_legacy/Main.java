package lessons.lesson21._01_legacy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

//Date
//данный класс в современных проектах почти не используется
public class Main {
    public static void main(String[] args) throws ParseException {
        Date now = new Date();
        System.out.println(now);//вернет настоящее время
        Date someDateAfter70 = new Date(1672587l);
        Date someDateBefore70 = new Date(-999992000l);
        System.out.println(someDateAfter70);
        System.out.println(someDateBefore70);

        java.sql.Date sqlNow = new java.sql.Date(1687367966656l);
        //java.sql.Date sqlDateBefore70 = new java.sql.Date(1687367966656l);
        System.out.println(sqlNow);
        System.out.println(someDateBefore70.before(sqlNow));

        Calendar calendarNow = Calendar.getInstance(); //определяет настоящую дату
        System.out.println(calendarNow);

        calendarNow.set(2,2);
        System.out.println(calendarNow);
        calendarNow.add(2,3);
        System.out.println(calendarNow);

        SimpleDateFormat format = new SimpleDateFormat();//для отформатированной даты
        System.out.println(format.format(now));

        String pattern = "EEEE dd-MMMM-yy    HH:mm:ss S";// паттерн в котором мы хотим выводить дату
       // SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
        format.applyPattern(pattern);
        System.out.println(format.format(now));
        Locale ru = new Locale("ru");

        String someDate = "21-06-2023";
        String patt = "dd-MM-y";
        SimpleDateFormat dateFormat = new SimpleDateFormat(patt);
        Date date = dateFormat.parse(someDate);
        System.out.println(date);












    }

}
