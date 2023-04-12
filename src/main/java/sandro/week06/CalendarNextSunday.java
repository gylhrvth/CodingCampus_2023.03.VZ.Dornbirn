package sandro.week06;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarNextSunday {
    public static void main(String[] args) {
        GregorianCalendar now = new GregorianCalendar();
        SimpleDateFormat weekDay = new SimpleDateFormat();                      //ist das keine SimpleDateFormat .DAY_OF_WEEK ???
        SimpleDateFormat day = new SimpleDateFormat("EEEEEEE");
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        System.out.println("Heute ist der : " + sdf.format(now.getTime()));
        System.out.println("Weekday Name  : " + day.format(now.getTime()));
        System.out.println("Weekday Number: " + now.get(Calendar.DAY_OF_WEEK));
/*
        int count = 0;
        int daycount = now.get(Calendar.DAY_OF_WEEK);


        if (daycount == 1){
            count = 0;
        } else {
            count = 8 - daycount ;
        }
*/
        int count = (8 - now.get(Calendar.DAY_OF_WEEK)) % 7;


//        while (daycount < 7) {
//            ++count;
//            daycount += count;
//        } if
//        (daycount == 7) {
//            count += 7;
//        } else {
//        }

        System.out.println();
        now.add(Calendar.DAY_OF_MONTH,count);
        System.out.println("der nächste Sonntag ist am : " + sdf.format(now.getTime()));
        System.out.println(day.format(now.getTime()));

        System.out.println("===================================");

        SimpleDateFormat sdf2 = new SimpleDateFormat("dd.MM.yyyy (EEEE)");
        GregorianCalendar now2 = new GregorianCalendar();
        System.out.println(sdf2.format(now2.getTime()));

        now2.set(Calendar.DAY_OF_WEEK, 1);
        now2.add(Calendar.WEEK_OF_YEAR, -1);
        System.out.println(sdf2.format(now2.getTime()));

    }


}



