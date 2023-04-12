package eric.week06.calenderExcercise;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class KalenderSonntag {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        SimpleDateFormat my = new SimpleDateFormat("yyyy.MM");

        System.out.println("--===--");
        System.out.println("Wann ist Sonntag?");
        System.out.println("--===--");


        GregorianCalendar now = new GregorianCalendar();
        now.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
        System.out.println("Datum für den nächsten Sonntag: " + sdf.format(now.getTime()));

        System.out.println("--===--");
        System.out.println("Wie viele Sonntage");
        System.out.println("--===--");


        int year = 2022;
        int month = 2;
        int numberOfSundays = countSundays(year, month);
        System.out.println("Anzahl der Sonntage im Jahr " + year + " im Monat " + month + " ist: " + numberOfSundays);


        System.out.println("--===--");
        System.out.println("Wie viele Arbeitstage");
        System.out.println("--===--");

        int numberOfWorkDays = countWorkDays(year, month);
        System.out.println("Anzahl der Arbeitstage im Jahr " + year + " und Monat " + month + " ist: " + numberOfWorkDays);

    }


    public static int countSundays(int year, int month) {
        int count = 0;
        LocalDate date = LocalDate.of(year, month, 1);
        while (date.getMonthValue() == month) {
            if (date.getDayOfWeek() == DayOfWeek.SUNDAY) {
                count++;
            }
            date = date.plusDays(1);
        }
        return count;
    }

    public static int countWorkDays(int year, int month) {
        int count = 0;
        LocalDate date = LocalDate.of(year, month, 1);
        while (date.getMonthValue() == month) {
            if (date.getDayOfWeek() != DayOfWeek.SATURDAY && date.getDayOfWeek() != DayOfWeek.SUNDAY) {
                        count++;
            }
            date = date.plusDays(1);
        }
        return count;
    }
}
