package ayguen.week06;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

import gyula.week02.ConsoleInputNumber;

public class CalendarUebungen {


    public static void main(String[] args) {

        GregorianCalendar now = new GregorianCalendar();


        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        System.out.println(sdf.format(now.getTime()));

        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        System.out.println(timeFormat.format(now.getTime()));

        SimpleDateFormat dateAndTime = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
        System.out.println(sdf.format(now.getTime()) + " " + timeFormat.format(now.getTime()));


        SimpleDateFormat date = new SimpleDateFormat("dd.MM.yyyy");
        Scanner sc = new Scanner(System.in);
        String name = readText("Geben Sie ihr Geburtsdatum ein");

        String[] tagNamen = {"", "Sonntag", "Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag", "Samstag"};
        SimpleDateFormat tagFormat = new SimpleDateFormat("EEEE");

        try {
            Date dateTo = date.parse(name);
            GregorianCalendar calenderGeb = new GregorianCalendar();
            calenderGeb.setTime(dateTo);
            System.out.println(date.format(calenderGeb.getTime()));
            System.out.println(tagNamen[calenderGeb.get(Calendar.DAY_OF_WEEK)]);
            System.out.println(tagFormat.format(calenderGeb.getTime()));
            /*
            if (calenderGeb.get(Calendar.DAY_OF_WEEK) == 1)
                System.out.println("Sonntag");
            if (calenderGeb.get(Calendar.DAY_OF_WEEK) == 2)
                System.out.println("Montag");
            if (calenderGeb.get(Calendar.DAY_OF_WEEK) == 3)
                System.out.println("Dienstag");
            if (calenderGeb.get(Calendar.DAY_OF_WEEK) == 4)
                System.out.println("Mittwoch");
            if (calenderGeb.get(Calendar.DAY_OF_WEEK) == 5)
                System.out.println("Donnerstag");
            if (calenderGeb.get(Calendar.DAY_OF_WEEK) == 6)
                System.out.println("Freitag");
            if (calenderGeb.get(Calendar.DAY_OF_WEEK) == 7)
                System.out.println("Samstag");
            */
        } catch (ParseException pe) {
            pe.printStackTrace();

        }
        GregorianCalendar calendarSo = new GregorianCalendar();

    }

    public static String readText(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextLine();
    }




}

