package hassan.week06;

import lukas.week03.day4.Colors;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class CreateCalendar {
    public static void main(String[] args) {
        Calendar today = Calendar.getInstance();

        int month = Calendar.APRIL;
        int year = 2023;

        Calendar cal = createCalendar(year, month);
        int[][] calendarData = createCalendarData(cal);
        printCalendar(cal, calendarData, today);

    }

    public static Calendar createCalendar(int year, int month) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.MONTH, month);
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.DAY_OF_MONTH, 1);
        return cal;
    }

    public static int[][] createCalendarData(Calendar cal) {
        int firstDayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        int daysInMonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        int[][] calendarData = new int[6][7];
        int dayOfMonth = 1;
        for (int row = 0; row < 6; row++) {
            for (int col = 0; col < 7; col++) {
                if (dayOfMonth > daysInMonth) {
                    calendarData[row][col] = 0;
                } else if (row == 0 && col < firstDayOfWeek - 2) {
                    calendarData[row][col] = 0;
                } else {
                    calendarData[row][col] = dayOfMonth;
                    dayOfMonth++;
                }
            }
        }
        return calendarData;
    }


    public static void printCalendar(Calendar cal, int[][] calendarData, Calendar today) {

        SimpleDateFormat monthFormat = new SimpleDateFormat("MMMM.yyyy", Locale.getDefault());
        System.out.printf("%s\n", monthFormat.format(cal.getTime()));

        System.out.println("| Mo | Di | Mi | Do | Fr | Sa | So |");


        for (int row = 0; row < 6; row++) {
            System.out.println("|");
            for (int col = 0; col < 7; col++) {
                int dayOfMonth = calendarData[row][col];
                if (dayOfMonth == 0) {
                    System.out.print("    |");
                } else {
                    if (dayOfMonth == today.get(Calendar.DAY_OF_MONTH) &&
                            cal.get(Calendar.MONTH) == today.get(Calendar.MONTH) && cal.get(Calendar.YEAR) == today.get(Calendar.YEAR)) {
                        System.out.printf(" %2d*|", dayOfMonth);
                    } else {
                        System.out.printf(" %2d |", dayOfMonth);
                    }
                }
            }
            System.out.println();
        }
    }
}
