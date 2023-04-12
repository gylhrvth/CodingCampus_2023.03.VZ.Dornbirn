package hassan.week06;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class NextSunday {
    public static void main(String[] args) {

        GregorianCalendar calendar = new GregorianCalendar();

       int currentDay = calendar.get(Calendar.DAY_OF_WEEK);

       int daysUNtilSunday = Calendar.SUNDAY - currentDay;
       if (daysUNtilSunday <= 0){
           daysUNtilSunday += 7;

           calendar.add(Calendar.DAY_OF_MONTH, daysUNtilSunday);

           SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");

           System.out.println("Das Datum des nächsten Sonntag ist : " + dateFormat.format(calendar.getTime()));
       }
    }
}
