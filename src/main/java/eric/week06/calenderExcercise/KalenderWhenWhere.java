package eric.week06.calenderExcercise;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class KalenderWhenWhere {
    public static void main(String[] args) {
        GregorianCalendar now = new GregorianCalendar();
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MMMMMMMM.yyyy");
        SimpleDateFormat tf = new SimpleDateFormat("HH:mm:ss");

        System.out.println("--===--");
        System.out.println("Aufgabe 1");
        System.out.println("--===--");

        System.out.println("Heutiges Datum:     " + sdf.format(now.getTime()));
        System.out.println("Uhrzeit:            " + tf.format(now.getTime()));
        System.out.println("Datum und Uhrzeit:  " + sdf.format(now.getTime()) + " " + tf.format(now.getTime()));
    }
}
