package lessons.lesson21._02_new;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
//        Calendar calendar = Calendar.getInstance();
//        String month = calendar.getDisplayName(Calendar.MONTH, Calendar.LONG_FORMAT, new Locale("ru"));
//        System.out.println(month);

        LocalDate dateNow = LocalDate.now(); // определяет текущую дату
        LocalDate someDate = LocalDate.of(2023, 5, 15);
        System.out.println(dateNow.getYear());    //Эта и следующая строчка абсолютно равны
        System.out.println(dateNow.get(ChronoField.YEAR));

        someDate.withYear(2022);
        System.out.println(someDate);//ничего не изменится потому что объект someDate неизменяемый

        someDate = someDate.withYear(2022);//теперь изменится
        System.out.println(someDate);

        System.out.println(someDate.isBefore(dateNow));
        someDate = someDate.plusYears(1);//та и следующая строчка эквиваленты
        someDate = someDate.plus(1, ChronoUnit.YEARS);
        System.out.println(someDate);
        someDate = someDate.minusYears(2);

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        System.out.println(now.format(DateTimeFormatter.ofPattern("dd MMMM y HH:mm:ss")));

        // способ парсинга строки в дату

        //одали строку, преобразовали ее к объекту LocalDateTime, а затем применили format чтоб отформатировать в том виде, в котором нам удобно
        System.out.println(LocalDateTime.parse("15-06-2020 23:15:29",DateTimeFormatter.ofPattern("dd-MM-y HH:mm:ss")).format(DateTimeFormatter.ofPattern("EEEE dd MMMM HH:mm")));



    }
}
