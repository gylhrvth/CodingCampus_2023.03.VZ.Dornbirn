package mert.week06;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class CalendarTHA {
    public static void main(String[] args) {
        printCalendar(2565, 4);
        System.out.println();
        System.out.println();
        printCalendar2(2022, 5);
    }

    public static void printCalendar2(int year, int month) {
        System.out.println("  Mo  |  Di  |  Mi  |  Do  |  Fr  |  Sa  |  So  |");

        Locale.setDefault(Locale.GERMANY);
        Calendar day = Calendar.getInstance();
        day.set(year, month, 1);


        int firstDay = day.get(java.util.Calendar.DAY_OF_WEEK);
        System.out.println(firstDay);

        int emptyStartDays = 0;
        emptyStartDays = firstDay - 2;

        if (firstDay == Calendar.MONDAY) {
            emptyStartDays = firstDay + 5;

        }

        for (int i = 0; i < emptyStartDays; i++) {
            System.out.print("       ");
        }

        int lastDay = day.getActualMaximum(java.util.Calendar.DAY_OF_MONTH);
        for (int i = 1; i <= lastDay; i++) {
            System.out.printf("%5d |", i);

            day = new GregorianCalendar(year, month - 1, i);
            if ((day.get(java.util.Calendar.DAY_OF_WEEK) == java.util.Calendar.SUNDAY)) {
                System.out.println();
            }
        }
    }


    public static void printCalendar(int year, int month) {
        System.out.println("Thailand");
        System.out.println("  So  |  Mo  |  Di  |  Mi  |  Do  |  Fr  |  Sa  |");

        Locale.setDefault(new Locale.Builder().setRegion("TH").setLanguage("th").build());
        Calendar day = Calendar.getInstance();


        int firstDay = day.get(java.util.Calendar.DAY_OF_WEEK);
        System.out.println(firstDay);
        int emptyStartDays = 0;
        emptyStartDays = firstDay - 2;

        if (firstDay == Calendar.FRIDAY) {
            emptyStartDays = firstDay + 5;
        }

        for (int i = 0; i < emptyStartDays; i++) {
            System.out.print("     ");
        }

        int lastDay = day.getActualMaximum(java.util.Calendar.DAY_OF_MONTH);
        for (int i = 1; i <= lastDay; i++) {
            System.out.printf("%5d |", i);

            day = new GregorianCalendar(year, month - 1, i);
            if ((day.get(java.util.Calendar.DAY_OF_WEEK) == Calendar.SATURDAY)) {
                System.out.println();
            }
        }
    }
}