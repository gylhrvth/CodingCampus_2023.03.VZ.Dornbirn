package ayguen.week06;

import java.time.DayOfWeek;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;


public class asdfasdfasdfasdfa {

    public static void main(String[] args) {
        System.out.println("  Mo  |  Di  |  Mi  |  Do  |  Fr  |  Sa  |  So  |");
        Locale.setDefault(new Locale.Builder().setRegion("TH").setLanguage("th").build());
        thailand(2565, 8);
    }

    public static void thailand(int year, int month) {


        Calendar now = Calendar.getInstance();
        int firstDay = now.getFirstDayOfWeek();
        System.out.println(firstDay);
        int emptyStartDays = 0;
        emptyStartDays = firstDay - 2;
        if (firstDay == Calendar.SUNDAY) {
            emptyStartDays = 6;
        }
        for (int i = 0; i < emptyStartDays; i++) {
            System.out.print("       ");

        }
        now.set(year, month-1, 1);
        int lastDay = now.getActualMaximum(java.util.Calendar.DAY_OF_MONTH);
        for (int i = 1; i <= lastDay; i++) {
            System.out.printf("%5d |", i);
            if ((now.get(java.util.Calendar.DAY_OF_WEEK) == java.util.Calendar.SUNDAY)) {
                System.out.println();
            }
            now.add(Calendar.DAY_OF_WEEK, 1);

        }
    }
}

