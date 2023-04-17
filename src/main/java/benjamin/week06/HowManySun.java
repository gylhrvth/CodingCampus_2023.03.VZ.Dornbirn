package benjamin.week06;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;


public class HowManySun {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        System.out.println(getSundays(2023, 3));

    }

    public static int getSundays(int year, int month) {
        GregorianCalendar cal = new GregorianCalendar(year, month - 1, 1);

        int countSunday = 0;
        while (cal.get(Calendar.MONTH) == month - 1) {

            if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY ) {
                countSunday++;
            }
            cal.add(Calendar.DAY_OF_MONTH, 1);
        }
        return countSunday;
    }
}

