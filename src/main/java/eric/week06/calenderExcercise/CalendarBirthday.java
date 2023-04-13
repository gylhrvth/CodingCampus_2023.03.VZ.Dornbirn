package eric.week06.calenderExcercise;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class CalendarBirthday {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        SimpleDateFormat withDayName = new SimpleDateFormat("dd.MM.yyyy EEE");

        System.out.println("--===--");
        System.out.println("Aufgabe 2");
        System.out.println("--===--");

        System.out.println("Bitte gib dein Geburtstag ein: ");
        try {
            String text = sc.nextLine();
            Date dateToComplete = sdf.parse(text);
            GregorianCalendar calenderToComplete = new GregorianCalendar();
            calenderToComplete.setTime(dateToComplete);
            int getWeekDays = calenderToComplete.get(Calendar.DAY_OF_WEEK);
            String[] weekDays = {"", "Sonntag", "Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag", "Samstag"};
            System.out.println(withDayName.format(dateToComplete));
            System.out.println("Der Wochentag an dem du Geburtstag hast, ist " + weekDays[getWeekDays] + ".");
        } catch (ParseException pe) {
            pe.printStackTrace();
        }
    }
}
