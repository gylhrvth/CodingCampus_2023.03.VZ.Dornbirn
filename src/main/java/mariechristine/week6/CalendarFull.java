package mariechristine.week6;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarFull {
    public static void main(String[] args) {

//        getCalendar(2023, Calendar.APRIL);

//        calenderConsole(2023, Calendar.APRIL);

        int[][] grid = new int[6][7];
        printCalGrid(grid);

    }

    public static int getCalendar(int year, int month) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month);
        cal.set(Calendar.DAY_OF_MONTH, 1);


        SimpleDateFormat sdf = new SimpleDateFormat("dd");
        try {
            String today = "13.04.2023";
            Date dateToUse = sdf.parse(today);
            cal.setTime(dateToUse);
            System.out.println("Eingelesenes Datum: " + "*" + sdf.format(cal.getTime()));

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        return year;
    }
/*
    public static int calenderConsole(int year, int month) {
        GregorianCalendar now = new GregorianCalendar();
        now.set(Calendar.YEAR, year);
        now.set(Calendar.MONTH, month);
        now.set(Calendar.DAY_OF_MONTH, 1);

        DateFormat sdf = new SimpleDateFormat(" dd ");

        int allDays = Calendar.DAY_OF_MONTH;
        int lastDayOfMonth = now.getActualMaximum(Calendar.DAY_OF_MONTH);
        for (int i = 1; i <= lastDayOfMonth; i++) {
            System.out.println(sdf.format(now.getTime()));
            now.add(Calendar.DAY_OF_MONTH, 1);
        }

        return allDays;
    }
*/
    public static void printCalGrid(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            System.out.println(" ");
            for (int j = 0; j <= grid.length; j++) {
                System.out.print(" Mo | ");

                }
            }
        }
    }
