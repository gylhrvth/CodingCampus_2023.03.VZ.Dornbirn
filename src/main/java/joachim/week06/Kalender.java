package joachim.week06;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Kalender {
    public static void main(String[] args) {
        System.out.println("| Mo|| Di|| Mi|| Do|| Fr|| Sa|| So|");
        createCalender(2023, Calendar.APRIL);
    }


    public static int createCalender(int year, int month) {
        GregorianCalendar cal = new GregorianCalendar(year, month, 1);
        Calendar lastCal = new GregorianCalendar(year, month - 1, 1);

        int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        int weekday = 1;
        int lastMonth = lastCal.getActualMaximum(Calendar.DAY_OF_MONTH);
        int emptySpace = 0;
        int weekStart = cal.get(Calendar.DAY_OF_WEEK);

        Calendar todayCalendar = Calendar.getInstance();
        int today = todayCalendar.get(Calendar.DAY_OF_YEAR);

        if (weekStart != Calendar.SUNDAY) {
            emptySpace = weekStart - 2;
        } else {
            emptySpace = 6;
        }
        for (int i = emptySpace; i > 0; i--) {
            System.out.printf("|%3d|", lastMonth - i + 1);

        }
        for (int day = 1; day <= lastDay; day++) {
            cal = new GregorianCalendar(year, month, day);

            if (cal.get(Calendar.DAY_OF_YEAR) == today && cal.get(Calendar.YEAR) == todayCalendar.get(Calendar.YEAR)) {
                System.out.printf("|*%2d|", weekday);
                weekday++;
            } else {
                System.out.printf("|%3d|", weekday);
                weekday++;

            }
            if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
                System.out.println();
            }
        }
        weekday = 1;
        if (cal.get(Calendar.DAY_OF_WEEK) != 1)
            for (int i = cal.get(Calendar.DAY_OF_WEEK); i <= Calendar.SATURDAY; i++) {
                System.out.printf("|%3d|", weekday);
                weekday++;
            }
        else {
            //noop
        }


        return weekday;
    }


}


