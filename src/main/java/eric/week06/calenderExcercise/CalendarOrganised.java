package eric.week06.calenderExcercise;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarOrganised {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        DateFormat header = new SimpleDateFormat("MMMM yyyy");
        DateFormat weekDays = new SimpleDateFormat("EE");
        DateFormat monthDays = new SimpleDateFormat("dd");
        int today = calendar.get(Calendar.DAY_OF_MONTH);

        System.out.println(header.format(calendar.getTime()));

        for (long i = 0; i < calendar.getActualMaximum(Calendar.DAY_OF_MONTH); i++)
        {
            System.out.println(monthDays.format(calendar.getActualMaximum(Calendar.DAY_OF_MONTH)));

        }
    }

    public static void calendarDesign(){
        Calendar calendar = Calendar.getInstance();
        int weekDays = calendar.getActualMaximum(Calendar.DAY_OF_WEEK);

        for (int i = 0; i < weekDays; i++) {
            System.out.printf("|  %2s");
        }
    }
}