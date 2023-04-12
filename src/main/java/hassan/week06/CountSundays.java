package hassan.week06;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class CountSundays {
    public static void main(String[] args) {


        System.out.print("Oktober 2021 hatte soviele sonntags : ");
        System.out.println(getSundays(2021,10));

        System.out.print("April 2023 hat soviele Sonntags : ");
        System.out.println(getSundays(2023,4));
    }

    public static int getSundays(int year, int month) {
        LocalDate date = LocalDate.of(year, month, 1);

        int sundays = 0;

        while (date.getMonthValue() == month){
            if (date.getDayOfWeek() == DayOfWeek.SUNDAY){
                sundays++;
            }
            date = date.plusDays(1);
        }
        return sundays;

    }
}
