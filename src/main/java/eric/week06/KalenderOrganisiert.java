package eric.week06;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class KalenderOrganisiert {
    public static void main(String[] args) {
        int month = 4;
        int year = 2023;

        LocalDate firstDay = LocalDate.of(year, month, 1);
        DayOfWeek weekDay = firstDay.getDayOfWeek();


    }
}