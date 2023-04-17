package sandro.week06;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class CalendarDateTime {
    public static void main(String[] args) {
        GregorianCalendar now = new GregorianCalendar();

        SimpleDateFormat date = new SimpleDateFormat("dd.MM.YYYY");
        SimpleDateFormat time = new SimpleDateFormat("HH:mm:ss");

        System.out.println("Today is : " + date.format(now.getTime()));
        System.out.println();
        System.out.println("It is : " + time.format(now.getTime()) + " a Clock");
        System.out.println();
        System.out.println("Today is : " + date.format(now.getTime()) + ", at " + time.format(now.getTime()) +" a Clock");


    }


}
