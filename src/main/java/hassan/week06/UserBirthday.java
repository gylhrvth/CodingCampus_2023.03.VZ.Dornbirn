package hassan.week06;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class UserBirthday {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");

        System.out.println("Gib dein Geburtstag ein :  (Format : dd.MM.yyyy)");
        String input = scanner.nextLine();

        try {
            Date date = dateFormat.parse(input);

            GregorianCalendar calendar = new GregorianCalendar();
            calendar.setTime(date);

            String[] weekdays = {"Sonntag", "Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag", "Samstag"};
            int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
            String weekdayName = weekdays[dayOfWeek - 1];


            System.out.println("Der " + dateFormat.format(date) + " war ein " + weekdayName + ".");
        } catch (ParseException e) {
            System.out.println("Fehler : Datum Format ist nicht richtig angegeben!!!");
        }
    }
}
