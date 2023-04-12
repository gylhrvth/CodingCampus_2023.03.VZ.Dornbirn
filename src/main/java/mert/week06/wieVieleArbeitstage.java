package mert.week06;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class wieVieleArbeitstage {
    public static void main(String[] args) {

        System.out.println(getWorkdays(2023, 6));
        System.out.println(getWorkdays(2023, 3));
        System.out.println(getWorkdays(2023, 2));


    }

    public static int getWorkdays(int year, int month) {
        int count = 0;
        GregorianCalendar day = new GregorianCalendar(year, month - 1, 1);
        int lastDay = day.getActualMaximum(Calendar.DAY_OF_MONTH);
        for (int i = 0; i < lastDay; i++) {
            day = new GregorianCalendar(year, month, i);
            if (day.get(Calendar.DAY_OF_WEEK) == Calendar.MONDAY ||
                    day.get(Calendar.DAY_OF_WEEK) == Calendar.TUESDAY ||
                    day.get(Calendar.DAY_OF_WEEK) == Calendar.WEDNESDAY ||
                    day.get(Calendar.DAY_OF_WEEK) == Calendar.THURSDAY ||
                    day.get(Calendar.DAY_OF_WEEK) == Calendar.FRIDAY
            ){
                ++count;
            }

        }
        return count;
    }
}
