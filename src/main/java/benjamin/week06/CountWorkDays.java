package benjamin.week06;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class CountWorkDays {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        System.out.println(getWorkdays(2021,6));
        System.out.println(getWorkdays(2021, 3));
        System.out.println(getWorkdays(2021,2));

    }

    public static int getWorkdays(int year, int month) {
        GregorianCalendar cal = new GregorianCalendar(year, month - 1, 1);

        int countWorkday = 0;
        while (cal.get(Calendar.MONTH) == month - 1) {

            if (cal.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY && cal.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
                countWorkday++;
            }
            cal.add(Calendar.DAY_OF_MONTH, 1);
        }

        return countWorkday;
    }
}