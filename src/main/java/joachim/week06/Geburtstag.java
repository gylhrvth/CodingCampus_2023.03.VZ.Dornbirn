package joachim.week06;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Geburtstag {
    public static void main(String[] args) {
        System.out.println(getBirthday());
    }

    public static String getBirthday() {
        Scanner scanner = new Scanner(System.in);
        GregorianCalendar calendar = new GregorianCalendar();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
//      ^^ Hier wird das pattern und der Kalender eingespielt / Der Scanner wird eingespielt^^

        System.out.println("When is your Birthday. (please wirte in YYYY.MM.DD)");
        String birthday = scanner.nextLine();
//      Abfrage Geburtstag
        try {
            Date date = sdf.parse(birthday);
            calendar.setTime(date);
            sdf = new SimpleDateFormat("EEEE");
//      Formatwechsel das kein Datum sondern der Tag ausgegeben wird.
        } catch (ParseException pe) {
            System.out.println("???");
//      Falls das Datum fehlerhaft eingegeben wird.
        }
        return sdf.format(calendar.getTime());
    }

}
