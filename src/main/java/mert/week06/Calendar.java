package mert.week06;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Calendar {
    public static void main(String[] args) {
        printCalendar(2023, 4);


    }

    public static void printCalendar(int year, int month) {

        GregorianCalendar day = new GregorianCalendar(year, month - 1, 1);
        int lastDay = day.getActualMaximum(java.util.Calendar.DAY_OF_MONTH);
        for (int i = 1; i <= lastDay; i++) {
            System.out.printf("%5" + i + " ");
            day = new GregorianCalendar(year, month - 1, i);
            if ((day.get(java.util.Calendar.DAY_OF_WEEK) == java.util.Calendar.SUNDAY)) {
                System.out.println();

            }


        }

    }
}