package mariechristine.week6;

import joachim.week06.Workdays;

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
        getSundays(2023, Calendar.APRIL);

        int workDays = getWorkDays(2023, Calendar.JANUARY);
        System.out.println(workDays);

    }

    /*    public static String yourBirthday(String text) {
            Scanner sc = new Scanner(System.in);
            System.out.println(text);
            return sc.nextLine();

        }
  */


    public static int getSundays(int year, int month) {
        GregorianCalendar now = new GregorianCalendar();
        now.set(Calendar.YEAR, year);
        now.set(Calendar.MONTH, month);
        now.set(Calendar.DAY_OF_MONTH, 1);

        int sun = Calendar.DAY_OF_MONTH;
        int lastDayOfMonth = now.getActualMaximum(Calendar.DAY_OF_MONTH);
        for (int i = 1; i <= lastDayOfMonth; i++) {
            int currentDayOfWeek = now.get(Calendar.DAY_OF_WEEK);
            if (currentDayOfWeek == 1) {
                System.out.println("Sunday");
            }
            System.out.println(now.getTime());
            now.add(Calendar.DAY_OF_MONTH, 1);
        }


        return sun;
    }



    public static int getWorkDays(int year, int month) {
        GregorianCalendar now = new GregorianCalendar();
        now.set(Calendar.YEAR, year);
        now.set(Calendar.MONTH, month);
        now.set(Calendar.DAY_OF_MONTH, 1);

        int workDays = 0;
        int workDay = Calendar.DAY_OF_MONTH;
        int lastDayOfMonth = now.getActualMaximum(Calendar.DAY_OF_MONTH);
        for (int i = 0; i < lastDayOfMonth; i++) {
            int currWeekDay = now.get(Calendar.DAY_OF_WEEK);
            if (currWeekDay == Calendar.SATURDAY || currWeekDay == Calendar.SUNDAY) {
                System.out.println("Wochenende");
            } else {
                System.out.println("Arbeitstag");
                workDays++;
            }
//            System.out.println(now.getTime());
            now.add(Calendar.DAY_OF_WEEK, 1);



        }


        return workDays;
    }


}


