package hassan.week06;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateExercises {
    public static void main(String[] args) {

        Date date = new Date();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        SimpleDateFormat dateTimeFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

        System.out.println("Nur Datum : " + dateFormat.format(date));
        System.out.println("Nur Zeit : " + timeFormat.format(date));
        System.out.println("Datum und Zeit : " + dateTimeFormat.format(date));






    }

}
