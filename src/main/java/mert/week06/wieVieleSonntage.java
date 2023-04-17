package mert.week06;


import java.util.Calendar;

import java.util.GregorianCalendar;

public class wieVieleSonntage {
    public static void main(String[] args) {
        System.out.println(getSundays(2023, 4));
        System.out.println(getSundays(2021, 2));

    }

    public static int getSundays(int year, int month) {
        int sundays = 0;
        GregorianCalendar day = new GregorianCalendar(year, month - 1, 1);
        int lastDay = day.getActualMaximum(Calendar.DAY_OF_MONTH);
        for (int i = 0; i < lastDay; i++) {
           day = new GregorianCalendar(year, month, i);
            if (day.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
                sundays++;
            }


        }
        return sundays;

    }

}
