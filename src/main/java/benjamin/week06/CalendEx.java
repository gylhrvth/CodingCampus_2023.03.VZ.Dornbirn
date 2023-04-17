package benjamin.week06;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class CalendEx {
    public static void main(String[] args) {
        GregorianCalendar now = new GregorianCalendar();
        SimpleDateFormat date = new SimpleDateFormat("dd.MM.yyyy");
        System.out.println("Date : " + date.format(now.getTime()));

        SimpleDateFormat time = new SimpleDateFormat("HH:mm:ss");
        System.out.println("Time : " + time.format(now.getTime()));

        SimpleDateFormat dateAndTime = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
        System.out.println("Date and Time: " + dateAndTime.format(now.getTime()));

        System.out.println("Birthday at " + birthday());

    }
    public static String birthday (){
        GregorianCalendar calendar = new GregorianCalendar();
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        System.out.println("Geburtstag eingeben");
        Scanner sc = new Scanner(System.in);
        String birthday = sc.nextLine();

        try {
            Date birth = sdf.parse(birthday);
            calendar.setTime(birth);
             sdf = new SimpleDateFormat("EEEE");
        } catch (ParseException pe){
            pe.printStackTrace();
        }
        return sdf.format(calendar.getTime());
    }

}
