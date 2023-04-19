package ayguen.week06;



import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test1 {
    public static void main(String[] args) {
        System.out.println(getSundays(2023, 4));
        //System.out.println(getSundays(2021, 9));
    }


    public static int getSundays(int year, int month){
        int count = 0;
        GregorianCalendar now = new GregorianCalendar(year, month, 1);
        int Sunday = now.getActualMaximum(Calendar.DAY_OF_MONTH);

        for (int i = 1; i < Sunday ; i++) {
            now = new GregorianCalendar(year, month, 1);

        }



        return count;
    }
}





