package benjamin.week06;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class NextSunday {
    public static void main(String[] args) {
        GregorianCalendar cal = new GregorianCalendar();
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
//        try {
//            cal.setTime(sdf.parse("01.01.2000"));
//        } catch (ParseException pe){
//            pe.printStackTrace();
//        }
//        cal.add(Calendar.DAY_OF_MONTH, (8 - cal.get(Calendar.DAY_OF_WEEK)) % 7);
        cal.set(Calendar.DAY_OF_WEEK, 1);
        System.out.println("Nächster Sonntag am: " + sdf.format(cal.getTime()));
    }
}
