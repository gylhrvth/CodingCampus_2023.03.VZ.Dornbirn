package lukas.week06;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;

public class CalendarRehearsal {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar();

        Calendar calendar2 = Calendar.getInstance();

        System.out.println(calendar2.getClass());

        System.out.println(calendar2.get(Calendar.DAY_OF_WEEK));

        calendar2.add(Calendar.DAY_OF_WEEK, 1);

        System.out.println(calendar2.get(Calendar.DAY_OF_WEEK));

        calendar2.add(Calendar.DAY_OF_WEEK, -1);

        System.out.println(calendar2.get(Calendar.DAY_OF_WEEK));

        System.out.println(calendar2.getFirstDayOfWeek());

        Locale.setDefault(new Locale("th"));

        DateFormat sdf = new SimpleDateFormat("dd.MM.yyyy EEEE");

        System.out.println(sdf.format(calendar2.getTime()));

        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));

        Date date = new Date(1000000);

        System.out.println(date);

        //Welches Datum ist später?
        Date date1 = new Date(0);
        Date date2 = new Date(10);

        boolean isDate1LaterThanDate2 = date1.compareTo(date2) > 0;
        System.out.println(isDate1LaterThanDate2);

        long millisDate1 = date1.getTime();
        long millisDate2 = date2.getTime();

        System.out.println("Is date1 later than date2: " + (millisDate1 > millisDate2));

        int dayCounter = 0;

        Calendar c = Calendar.getInstance();
        //Alle Tage ausgeben seit 1970 bis jetzt
        for (long i = 0; i < System.currentTimeMillis(); i = i + 1000 * 60 * 60 * 24) {
            System.out.println(new Date(i));
            dayCounter++;

            c.setTime(new Date(i));

            if(c.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
                System.out.println("Samstag (weil Joachim es will)");
            }
        }
        System.out.println(dayCounter);
    }
}
