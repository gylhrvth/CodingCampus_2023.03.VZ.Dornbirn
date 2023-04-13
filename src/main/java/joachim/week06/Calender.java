package joachim.week06;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Calender {
    public static void main(String[] args) {
        GregorianCalendar calender = new GregorianCalendar();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
        System.out.println(sdf.format(calender.getTime()));
        sdf = new SimpleDateFormat("HH.mm.ss.SSSS");
        System.out.println(sdf.format(calender.getTime()));
        sdf = new SimpleDateFormat("yyyy.MM.dd" + " HH.mm.ss");
        System.out.println(sdf.format(calender.getTime()));
    }
}
