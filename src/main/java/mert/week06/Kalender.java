package mert.week06;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Kalender {
    public static void main(String[] args) {
        GregorianCalendar now = new GregorianCalendar();

        SimpleDateFormat date = new SimpleDateFormat("dd.MM.yyyy");
        System.out.println(date.format(now.getTime()));

        SimpleDateFormat time = new SimpleDateFormat("HH:mm");
        System.out.println(time.format(now.getTime()));

        SimpleDateFormat timeDate = new SimpleDateFormat("dd.MM.yyyy EEEE    HH:mm");
        System.out.println(timeDate.format(now.getTime()));


        Scanner sc = new Scanner(System.in);
        String name = readText("Geben Sie ihr Geburtsdatum ein");

        try {
            Date dateTo = date.parse(name);
            GregorianCalendar calenderGeb = new GregorianCalendar();
            calenderGeb.setTime(dateTo);
            System.out.println(timeDate.format(calenderGeb.getTime()));
            System.out.println(calenderGeb.get(Calendar.DAY_OF_WEEK));


        }catch (ParseException pe){
            pe.printStackTrace();
        }




    }

    public static String readText(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextLine();

    }
}