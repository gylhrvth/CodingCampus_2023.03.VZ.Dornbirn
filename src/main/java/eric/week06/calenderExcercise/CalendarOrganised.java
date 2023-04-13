package eric.week06.calenderExcercise;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarOrganised {
    public static void main(String[] args) {
        for (int i = 0; i < 12; i++) {
            System.out.println();
            System.out.println("[" + i +"]");
            printCalendar(2023, i);
            System.out.println();
        }


    }

    public static void printCalendar(int year, int month) {
        Calendar calendar = new GregorianCalendar(year, month, 1);
        int lastDayOfMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        int firstDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        int emptyStartDays = 0;
        Calendar todayCalendar = Calendar.getInstance();
        int today = todayCalendar.get(Calendar.DAY_OF_MONTH);
        int getYear = todayCalendar.get(Calendar.YEAR);
        int getMonth = todayCalendar.get(Calendar.MONTH);

        emptyStartDays = firstDayOfWeek - 2;

        System.out.println(" MO | DI | MI | DO | FR | SA | SO |");

        if (firstDayOfWeek == Calendar.SUNDAY) {
            emptyStartDays = 6;
        }

        for (int i = 0; i < emptyStartDays; i++) {
            System.out.print("     ");
        }

        for (int i = 1; i <= lastDayOfMonth; i++) {
            calendar = new GregorianCalendar(year, month, i);
            if (calendar.get(Calendar.DAY_OF_MONTH) == today && getMonth == calendar.get(Calendar.MONTH) && getYear == calendar.get(Calendar.YEAR)) {
                System.out.printf("%3d*|", i);
            } else {
                System.out.printf("%3d |", i);
            }
            if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
                System.out.println();
            }
        }
    }
}