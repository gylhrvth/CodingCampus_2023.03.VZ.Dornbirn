package joachim.week06;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Sunday {
    public static void main(String[] args) {
        System.out.println("Sontag ist am: " + sunday());
    }

    public static String sunday() {
        GregorianCalendar calendar = new GregorianCalendar();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");

        calendar.set(Calendar.DAY_OF_WEEK, 1);


        return sdf.format(calendar.getTime());
    }
}