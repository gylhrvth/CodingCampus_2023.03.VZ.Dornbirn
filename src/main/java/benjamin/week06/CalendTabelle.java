package benjamin.week06;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class CalendTabelle {
    public static void main(String[] args) {

        int year = 2022;
        int month = Calendar.APRIL;
        int today = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);

        printMonth(year, month, today);
    }

    public static void printMonth(int year, int month, int today) {

        Calendar cal = new GregorianCalendar(year, month, today);
        DateFormat sdf = new SimpleDateFormat("yyyy MMMM");
        System.out.println(sdf.format(cal.getTime()));
        System.out.println("|  Mo |  Di |  Mi |  Do |  Fr |  Sa |  So |");

        cal.set(Calendar.DAY_OF_MONTH, 1);

        int firstDay = cal.get(Calendar.DAY_OF_WEEK);

        int emptyDays = (firstDay - Calendar.MONDAY + 7) % 7; //leere Tage Anfang Monat

        for (int i = 0; i < emptyDays; i++) {
            System.out.print("|     ");
        }
        while (cal.get(Calendar.MONTH) == month) { //Tage im Monat
            int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
            if (dayOfMonth == today) {
                System.out.printf("|%3d* ", dayOfMonth);
            } else {
                System.out.printf("|%4d ", dayOfMonth);
            }
            if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
                System.out.println("|");
            }
            cal.add(Calendar.DAY_OF_MONTH, 1);
        }
            while (cal.get(Calendar.DAY_OF_WEEK) != Calendar.TUESDAY) { //leere Tage Ende Monat
                System.out.print("|     ");
                cal.add(Calendar.DAY_OF_MONTH, 1);
            }

    }


//    public static void printAllCalendar(){
//
//        Locale[] loc = Locale.getAvailableLocales();
//        int count = 0;
//        for (Locale value : loc) {
//            DateFormat date = DateFormat.getDateInstance(DateFormat.FULL, value);
//            Calendar cal = Calendar.getInstance(value);
//            System.out.println(cal.getClass() + " " + value.getDisplayName() + date);
//            count++;
//        }
//        System.out.println(count);
//    }
}



