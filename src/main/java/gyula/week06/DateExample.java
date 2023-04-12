package gyula.week06;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateExample {
    public static void main(String[] args) {
        GregorianCalendar now = new GregorianCalendar();

        System.out.println(now);
        System.out.printf("%td.%tm.%tY\n", now, now, now);
        System.out.printf("%1$td.%1$tm.%1$tY\n", now);


        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        System.out.println(sdf.format(now.getTime()));
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        System.out.println(timeFormat.format(now.getTime()));


        try {
            String text = "14.05.2023";
            Date dateToComplete = sdf.parse(text);
            GregorianCalendar calenderToComplete = new GregorianCalendar();
            calenderToComplete.setTime(dateToComplete);
            System.out.println("Erfolgreich eingelesen. " + sdf.format(calenderToComplete.getTime()));
        } catch (ParseException pe){
            pe.printStackTrace();
        }

        System.out.println("Year: " + now.get(Calendar.YEAR));
        System.out.println("Month: " + now.get(Calendar.MONTH));
        System.out.println("Day: " + now.get(Calendar.DAY_OF_MONTH));
        System.out.println("Weekday: " + now.get(Calendar.DAY_OF_WEEK));

        now.add(Calendar.DAY_OF_MONTH, 14);
        System.out.println("14 Tage später...");
        System.out.println(sdf.format(now.getTime()));
        now.add(Calendar.DAY_OF_MONTH, -28);
        System.out.println("und 28 Tage davor...");
        System.out.println(sdf.format(now.getTime()));

        now = new GregorianCalendar();
        now.set(Calendar.DAY_OF_MONTH, 1);
        System.out.println("Erster Tag im Monat: " + sdf.format(now.getTime()));

        now = new GregorianCalendar();
        now.add(Calendar.MONTH, 1);
        now.set(Calendar.DAY_OF_MONTH, 1);
        now.add(Calendar.DAY_OF_MONTH, -1);
        System.out.println("Letzter Tag im Monat: " + sdf.format(now.getTime()));

        now = new GregorianCalendar();
        System.out.println("Dieses Monat hat " + now.getActualMaximum(Calendar.DAY_OF_MONTH) + " viel Tage.");

        GregorianCalendar userDate = new GregorianCalendar(2023, 11,25);
        System.out.println("Weihnachten: " + sdf.format(userDate.getTime()));

    }
}
