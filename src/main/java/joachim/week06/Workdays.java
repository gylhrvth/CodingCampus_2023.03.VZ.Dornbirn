package joachim.week06;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Workdays {
    public static void main(String[] args) {

        System.out.println(count(2023, 3));
    }

    public static int count(int year, int month) {
        GregorianCalendar calendar = new GregorianCalendar(year,month-1, 1);
        int lastDay =  calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        int Workday = 0;
        for (int day = 1; day <= lastDay; day++) {
            calendar = new GregorianCalendar(year,month-1, day);
            if(calendar.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY && calendar.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY){
                Workday++;
            }
        }
        return Workday;
    }
}