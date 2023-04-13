package mariechristine.week6;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class CalendarFull {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();

        getCalendar(2023, Calendar.APRIL);

    }

    public static int getCalendar(int year, int month) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month);
        cal.set(Calendar.DAY_OF_MONTH, 1);
        SimpleDateFormat dayFormat = new SimpleDateFormat(" dd ");
        System.out.println("|  Mo |  Di |  Mi |  Do |  Fr |  Sa |  So |");

        int days = Calendar.DAY_OF_MONTH;
        int lastDayOfMonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        for (int i = 1; i <= lastDayOfMonth; i++) {
            int currentDayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
            if (currentDayOfWeek == 2) {
                System.out.println(" ");
            }
            System.out.print("  ");

//            System.out.println(cal.getTime());
            System.out.print(dayFormat.format(cal.getTime()));
            cal.add(Calendar.DAY_OF_MONTH, 1);

        }
        return days;
    }
}




