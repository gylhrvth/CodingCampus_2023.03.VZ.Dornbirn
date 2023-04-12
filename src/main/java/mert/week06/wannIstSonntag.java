package mert.week06;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class wannIstSonntag {
    public static void main(String[] args) {
        GregorianCalendar now = new GregorianCalendar(2023, Calendar.FEBRUARY, 10);
        System.out.println(now.getTime());

        now.add(Calendar.DATE, (8 - now.get(Calendar.DAY_OF_WEEK)) % 7);
        System.out.println(now.getTime());


    }
}
