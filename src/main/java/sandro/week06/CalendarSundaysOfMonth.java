package sandro.week06;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class CalendarSundaysOfMonth {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        System.out.println(countSundays(2024, -8));


//        String date1 = "2021.10";
//        String date2 = "2021.09";

//        Date date1ToComplete = sdf.parse(date1);
//        GregorianCalendar calenderToComplete = new GregorianCalendar();
//        calenderToComplete.setTime(date1ToComplete);
//

    }

    public static int countSundays(int year, int month) {
        int count = 0;
        GregorianCalendar cal = new GregorianCalendar(year, month - 1, 1);    //November or October

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd EEEE");
        SimpleDateFormat day = new SimpleDateFormat("EEEE");
      //  SimpleDateFormat day = new SimpleDateFormat("EEEE", new Locale.Builder().setLanguage("us").build());



        System.out.println(cal.getTime());
        System.out.println(sdf.format(cal.getTime()));
        System.out.println("Month in Value: " + cal.get(Calendar.MONTH));
        System.out.println("Day of Month: " + cal.get(Calendar.DAY_OF_MONTH));
        System.out.println("Day of Week Value: " + cal.get(Calendar.DAY_OF_WEEK));
        System.out.println("Day of Week Name: " + day.format(cal.getTime()));
        System.out.println("Days of Month amount: " + cal.getActualMaximum(Calendar.DAY_OF_MONTH));



        for (int i = 1; i <= cal.getActualMaximum(Calendar.DAY_OF_MONTH); i++) {
            cal = new GregorianCalendar(year, month - 1, i);    //November or October
            if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY){
                count++;
            }
        }

        return count;
    }

}
