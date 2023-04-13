package joachim.week06;

import java.util.Calendar;
import java.util.Locale;


public class Thailand {
    public static void main(String[] args) {
        Locale.setDefault(new Locale.Builder().setRegion("TH").setLanguage("th").build());
        int year = 2003;
        int month = Calendar.APRIL;

        printCalender(year,month);
    }

    public static void printCalender(int year, int month){
        System.out.println("| So|| Mo|| Di|| Mi|| Do|| Fr|| Sa|");
        lastMonth(year, month);
        thisMonth(year, month);
        nextMonth();
    }

    public static Calendar lastMonth(int year, int month) {
        Calendar cal = Calendar.getInstance();
        cal.set(year, month, 1);
        Calendar lastCal = Calendar.getInstance();
        lastCal.set(year, month - 1, 1);
        int lastMonth = lastCal.getActualMaximum(Calendar.DAY_OF_MONTH);
        int emptySpace = 0;
        int weekStart = cal.get(Calendar.DAY_OF_WEEK);


        if (weekStart != Calendar.SATURDAY) {
            emptySpace = weekStart - 1;
        } else {
            emptySpace = 6;
        }
        for (int i = emptySpace; i > 0; i--) {
            System.out.printf("|%3d|", lastMonth - i + 1);

        }
        return cal;
    }

    public static Calendar thisMonth(int year, int month) {
        Calendar cal = Calendar.getInstance();
        Calendar todayCalendar = Calendar.getInstance();
        int today = todayCalendar.get(Calendar.DAY_OF_YEAR);
        int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        int weekday = 1;
        for (int day = 1; day <= lastDay; day++) {
            cal.set(year, month, day);

            if (cal.get(Calendar.DAY_OF_YEAR) == today && cal.get(Calendar.YEAR) == todayCalendar.get(Calendar.YEAR)) {
                System.out.printf("|*%2d|", weekday);
                weekday++;
            } else {
                System.out.printf("|%3d|", weekday);
                weekday++;

            }
            if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
                System.out.println();
            }
        }
        return cal;
    }

    public static int nextMonth() {
        return 0;
    }


}