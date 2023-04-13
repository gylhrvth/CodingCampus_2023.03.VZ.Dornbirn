package sandro.week06;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class CalendarCountWorkdays {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        System.out.println(getWorkDays(2021, 6));
        System.out.println();
        System.out.println(getWorkDays(2021, 3));
        System.out.println();
        System.out.println(getWorkDays(2021, 2));


    }

    public static int getWorkDays(int year, int month) {
        int count = 0;
        GregorianCalendar cal = new GregorianCalendar(year, month - 1, 1);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd EEEE");

        System.out.println(cal.getTime());
        System.out.println(sdf.format(cal.getTime()));

        for (int i = 1; i <= cal.getActualMaximum(Calendar.DAY_OF_MONTH); i++) {
            cal = new GregorianCalendar(year, month - 1, i);

            if (cal.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY && cal.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
                count++;
            }
        }
        return count;
    }

}
