package hassan.week06;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class CreateCalendarInternational {

    public static void main(String[] args) {

        int month = Calendar.APRIL;
        int monthThai = Calendar.APRIL;

        Locale.setDefault(new Locale.Builder().setRegion("TH").setLanguage("th").build());
        printCalendar(2023, monthThai);

        System.out.println();
        System.out.println("------------------------------------");
        System.out.println();

        Locale.setDefault(Locale.GERMANY);
        printCalendar(2023, month);


        // Alle kalender die es gibt
//        Locale[] locales = Locale.getAvailableLocales();
//        int kalenderzahl = 0;
//        for (Locale locale: locales) {
//
//            DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL, locale);
//            Calendar calendar = Calendar.getInstance(locale);
//            System.out.println(calendar.getClass() + " " + locale.getDisplayName() + " - " + dateFormat.format(calendar.getTime()));
//            kalenderzahl++;
//        }
//        System.out.println("Anzahl: " + kalenderzahl);

    }

    public static Calendar createCalendar(int year, int month) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.MONTH, month);
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.DAY_OF_MONTH, 1);
        return cal;
    }

    public static int[][] createCalendarData(Calendar cal) {
        int firstDayOfWeek = cal.getFirstDayOfWeek();
        int daysInMonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        int[][] calendarData = new int[6][7];
        int dayOfMonth = 1;
        int row = 0;
        int col = (cal.get(Calendar.DAY_OF_WEEK) - firstDayOfWeek + 7) % 7;
        while (dayOfMonth <= daysInMonth) {
            calendarData[row][col] = dayOfMonth;
            dayOfMonth++;
            col++;
            if (col == 7) {
                col = 0;
                row++;
            }
        }
        return calendarData;
    }


    public static void printCalendar(int year, int month) {
        Calendar cal = createCalendar(year, month);
        int[][] calendarData = createCalendarData(cal);

        SimpleDateFormat monthFormat = new SimpleDateFormat("MMMM.yyyy", Locale.getDefault());
        System.out.printf("%s\n", monthFormat.format(cal.getTime()));

        System.out.println("| Mo | Di | Mi | Do | Fr | Sa | So |");

        for (int row = 0; row < 6; row++) {
            System.out.print("|");
            for (int col = 0; col < 7; col++) {
                int dayOfMonth = calendarData[row][col];
                if (dayOfMonth == 0) {
                    System.out.print("    |");
                } else {
                    System.out.printf(" %2d |", dayOfMonth);
                }
            }
            System.out.println();
        }
    }
}


