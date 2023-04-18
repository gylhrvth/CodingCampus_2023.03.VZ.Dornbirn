package sandro.week06;

import lukas.week03.day4.Colors;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.*;

public class CalendarActualDay {
    public static void main(String[] args) {
//        new Thread(() -> {
//            try {
//                Robot robot = new Robot();
//                while (true) {
//                    for (char c : "Einser mit Sternle".toCharArray()) {
//                        int keyKode = KeyEvent.getExtendedKeyCodeForChar(c);
//                        robot.keyPress(keyKode);
//                        robot.keyRelease(keyKode);
//                    }
//                    Thread.sleep(1000);
//                }
//            } catch (AWTException e) {
//                throw new RuntimeException(e);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }).start();

      //   Locale.setDefault(new Locale.Builder().setRegion("TH").setLanguage("th").build());
//            printDays(2565,4);

        String[] month = {"Jänner", "Februar", "März", "April", "Mai", "Juni", "Juli", "August", "September", "Oktober", "November", "Dezember"};
        for (int i = 0; i <= 11; i++) {
            System.out.println(month[i]);
            printDays(2023, i + 1);
        }


    }

    public static void printDays(int year, int month) {
        System.out.println(" |  Mo |  Di |  Mi |  Do |  Fr |  Sa |  So |");
        System.out.println("--------------------------------------------");

        Calendar todayCalendar = Calendar.getInstance();
        //   todayCalendar.set(Calendar.DAY_OF_MONTH, 1);

        //   Calendar cal = new GregorianCalendar(year, month - 1, 1);
        Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1, 1);


        if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
            System.out.print(" |     |     |     |     |     |    ");
        } else {
            for (int i = cal.getFirstDayOfWeek(); i < cal.get(Calendar.DAY_OF_WEEK); i++) {
                System.out.print(" |    ");
            }
        }
        for (int i = 1; i <= cal.getActualMaximum(Calendar.DAY_OF_MONTH); i++) {

            cal.set(year, month - 1, i);
            if (todayCalendar.get(Calendar.MONTH) == (cal.get(Calendar.MONTH))
                    && todayCalendar.get(Calendar.DAY_OF_MONTH) == (cal.get(Calendar.DAY_OF_MONTH))
                    && todayCalendar.get(Calendar.YEAR) == (cal.get(Calendar.YEAR))) {
                if (i <= 9) {
                    System.out.printf(" |  " + Colors.COLORS[1] + i + "*" + Colors.RESET);
                } else {
                    System.out.printf(" | " + Colors.COLORS[1] + i + "*" + Colors.RESET);
                }
            } else {
                System.out.printf(" | " + "%3d", i);
            }
            if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
                System.out.print(" |" + " Week " + cal.get(Calendar.WEEK_OF_YEAR) + "\n");
            }
        }
        for (int i = cal.get(Calendar.DAY_OF_WEEK); i < 8; i++) {
            if (cal.get(Calendar.DAY_OF_WEEK) == 1) {

            } else
                System.out.print(" |    ");
        }
        if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
            System.out.println("--------------------------------------------");
        } else {
            System.out.println(" |" + " Week " + cal.get(Calendar.WEEK_OF_YEAR));
            System.out.println("--------------------------------------------");
        }
    }
}
