package mariechristine.week6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Kalender {
    public static void main(String[] args) {

        GregorianCalendar now = new GregorianCalendar();
/*      System.out.printf("%1$td.%1$tm.%1$tY\n", now);

        System.out.println("Aufgabe: Wann und wo?");
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        System.out.println(sdf.format(now.getTime()));
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        System.out.println(timeFormat.format(now.getTime()));
        SimpleDateFormat timeAndDate = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
        System.out.println(timeAndDate.format(now.getTime()));

        SimpleDateFormat dayFormat = new SimpleDateFormat("EEEE", new Locale.Builder().setLanguage("de").build());

        String[] weekdays = new String[]{"", "Sonntag", "Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag", "Samstag"};

        try {
            String birthday = yourBirthday("Was ist dein Geburstag?");
            Date d = sdf.parse(birthday);
            now.setTime(d);
            System.out.println("Dein Geburtstag ist am: " + weekdays[now.get(Calendar.DAY_OF_WEEK)] + ", den " + sdf.format(now.getTime()));
            System.out.println("Dein Geburtstag ist am: " + dayFormat.format(now.getTime()) + ", den " + sdf.format(now.getTime()));

            now.add(Calendar.DAY_OF_WEEK, 7);
            System.out.println(dayFormat.format(now.getTime()));

        } catch (ParseException pe) {
            pe.printStackTrace();
        }


 */
        getSundays(2023, 1);

    }

/*    public static String yourBirthday(String text) {
        Scanner sc = new Scanner(System.in);
        System.out.println(text);
        return sc.nextLine();

    }
*/
    public static int getSundays(int year, int month) {
        GregorianCalendar now = new GregorianCalendar();
        System.out.println("Der Monat hat: " + now.getActualMaximum(Calendar.DAY_OF_MONTH) + " Tage.");

        for (int i = 0; i <= now.getActualMaximum(Calendar.DAY_OF_MONTH); i++) {



        }

        return year;
    }

}

