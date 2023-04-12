package sandro.week06;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarActualDay {
    public static void main(String[] args) {
        GregorianCalendar cal = new GregorianCalendar();
        printDays(2023, 4);

    }

    public static void printDays(int year, int month) {
        GregorianCalendar cal = new GregorianCalendar(year, month - 1, 1);
        boolean first = true;
        for (int i = 1; i <= cal.getActualMaximum(Calendar.DAY_OF_MONTH); i++) {
            cal = new GregorianCalendar(year, month - 1, i);
            if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.MONDAY) {
                System.out.println("\n");
            }
            if (!first) {
                System.out.print(" ");
            }
            System.out.printf("%2d", i);
            first = false;
        }

    }
}
