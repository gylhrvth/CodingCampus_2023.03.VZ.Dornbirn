package ayguen.week06;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Arbeitstage {


    public static void main(String[] args) {


        System.out.println(workDays(2021, 6));
        System.out.println(workDays(2021, 3));


    }

    public static int workDays(int year, int month) {
        int count = 0;
        GregorianCalendar now = new GregorianCalendar(year, month, 1);
        int Sunday = now.getActualMaximum(Calendar.DAY_OF_MONTH);

        for (int i = 1; i < Sunday; i++) {
            now = new GregorianCalendar(year, month, i);
            int weekDay = now.get(Calendar.DAY_OF_WEEK);
            if (weekDay == Calendar.MONDAY ||
                    weekDay == Calendar.TUESDAY ||
                    weekDay == Calendar.WEDNESDAY ||
                    weekDay == Calendar.THURSDAY ||
                    weekDay == Calendar.FRIDAY) {
                count++;

            }
        }
        return count;
    }
}
