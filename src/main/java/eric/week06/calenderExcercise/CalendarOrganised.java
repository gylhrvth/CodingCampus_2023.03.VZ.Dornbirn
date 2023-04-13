package eric.week06.calenderExcercise;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class CalendarOrganised {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        int month = Calendar.APRIL;
        int year = 2023;


        header();
        Calendar calendar = createCalendarData(year, month);
        int[][] calData = calendarSize(calendar);
        calendarDesign(calendar, calData, cal);

    }


    public static Calendar createCalendarData(int year, int month) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.MONTH, month);
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        return calendar;
    }

    public static int[][] calendarSize(Calendar calendar) {
        int firstDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        int daysOfMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        int[][] data = new int[6][7];
        int daysInMonth = 1;
        for (int row = 0; row < 6; row++) {
            for (int col = 0; col < 7; col++) {
                if (daysInMonth > daysOfMonth) {
                    data[row][col] = 0;
                } else if (row == 0 && col < firstDayOfWeek - 2) {
                    data[row][col] = 0;
                } else {
                    data[row][col] = daysInMonth;
                    daysInMonth++;
                }
            }
        }
        return data;
    }

    public static void calendarDesign(Calendar calendar, int[][] calData, Calendar today) {
        System.out.print("| MO | DI | MI | DO | FR | SA | SO |");
        System.out.println();
        for (int row = 0; row < 6; row++) {
            System.out.println("|");
            for (int col = 0; col < 7; col++) {

                int dayOfMonth = calData[row][col];

                if (dayOfMonth == 0) {
                    System.out.println("    |");
                } else {
                    if (dayOfMonth == today.get(Calendar.DAY_OF_MONTH) && calendar.get(Calendar.MONTH) == today.get(Calendar.MONTH)
                            && calendar.get(Calendar.YEAR) == today.get(Calendar.YEAR)) {
                        System.out.printf("%2s*|", dayOfMonth);
                    } else {
                        System.out.printf("%2s |", dayOfMonth);
                    }
                }
            }
            System.out.println();
        }
    }

    public static void header() {
        Calendar calendar = Calendar.getInstance();
        DateFormat header = new SimpleDateFormat("MMMM yyyy");

        System.out.printf("| %2s \n ", header.format(calendar.getTime()));

    }
}