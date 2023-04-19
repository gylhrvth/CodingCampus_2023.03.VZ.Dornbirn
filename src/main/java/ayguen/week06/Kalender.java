package ayguen.week06;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Kalender {
    public static void main(String[] args) {
        kalo(2023, 6);
    }

    public static void kalo(int year, int month) {

        System.out.println("|  Mo  ||  Di  ||  Mi  ||  Do  ||  Fr  ||  Sa  ||  So  |");
        GregorianCalendar now = new GregorianCalendar(year, month - 1, 1);

        int firstDay = now.get(Calendar.DAY_OF_WEEK);
        System.out.println(firstDay);
        int emptyDays = 0;
        emptyDays = firstDay - 2;
        if (firstDay == Calendar.SUNDAY) {
            emptyDays = 6;
        }

        for (int i = 0; i < emptyDays; i++) {
            System.out.print("        ");
        }

        int lastDayOfMonth = now.getActualMaximum(Calendar.DAY_OF_MONTH);
        for (int i = 1; i <= lastDayOfMonth; i++) {
            //now = new GregorianCalendar(year, month - 1, i);

            System.out.printf("|" + "%5d |", i);
            if (now.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
                System.out.println();

            }
            now.add(Calendar.DAY_OF_WEEK, 1);
        }

    }
}
