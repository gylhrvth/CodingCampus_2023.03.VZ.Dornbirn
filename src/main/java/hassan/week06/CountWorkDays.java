package hassan.week06;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Date;

public class CountWorkDays {
    public static void main(String[] args) {

        System.out.println(getWorkdays(2021,6));
    }

    public static int getWorkdays(int year, int month){
        int count = 0;
        LocalDate date = LocalDate.of(year, month, 1);
        while (date.getMonthValue() == month) {
            if (date.getDayOfWeek() != DayOfWeek.SATURDAY && date.getDayOfWeek() != DayOfWeek.SUNDAY) {
                count++;
            }
            date = date.plusDays(1);
        }
        return count;
    }
}
