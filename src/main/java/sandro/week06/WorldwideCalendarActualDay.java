package sandro.week06;

import lukas.week03.day4.Colors;

import java.util.Calendar;
import java.util.Locale;

public class WorldwideCalendarActualDay {
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

        //       Locale.setDefault(new Locale.Builder().setRegion("TH").setLanguage("th").build());
        //       printDays(2565,4);

        String[] month = {"Jänner", "Februar", "März", "April", "Mai", "Juni", "Juli", "August", "September", "Oktober", "November", "Dezember"};
        for (int i = 0; i <= 11; i++) {
            System.out.println(month[i]);
            printDays(2023, i + 1);
        }


    }

    public static void printDays(int year, int month) {
        Calendar todayCalendar = Calendar.getInstance();
        //   todayCalendar.set(Calendar.DAY_OF_MONTH, 1);

        //   Calendar cal = new GregorianCalendar(year, month - 1, 1);
        Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1, 1);

        int startweek;
        startweek = cal.getFirstDayOfWeek();

        String[] weekdays = {"So", "Mo", "Di", "Mi", "Do", "Fr", "Sa"};

        for (int i = 0; i < 7; i++) {
            int weekDayIndex = (i + startweek - 1) % 7;
            System.out.print(" |  " + weekdays[weekDayIndex]);
        }
        System.out.println(" |");

//        if (startweek == 2) {
//            String[] weekday = {" |  Mo", " |  Di", " |  Mi", " |  Do", " |  Fr", " |  Sa", " |  So"};
//            for (int i = 0; i <= 6; i++) {
//                System.out.print(weekday[i]);
//            }
//            System.out.println();
//            System.out.println("--------------------------------------------");
//        }
//        if (startweek == 1) {
//            String[] weekday = {" |  So"," |  Mo", " |  Di", " |  Mi", " |  Do", " |  Fr", " |  Sa"};
//            for (int i = 0; i <= 6; i++) {
//                System.out.print(weekday[i]);
//            }
//            System.out.println();
//            System.out.println("--------------------------------------------");
//        }


        int breakDay;
        breakDay = cal.getFirstDayOfWeek() - 1;
        if (breakDay == 0) {
            breakDay = Calendar.SATURDAY;
        }


        int emptyDays = cal.get(Calendar.DAY_OF_WEEK) - 2;
        if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
            emptyDays = 6;
        }

        if (breakDay == Calendar.SATURDAY) {
            emptyDays = cal.get(Calendar.DAY_OF_WEEK) - 1;
        }

        for (int i = 0; i < emptyDays; i++) {
            System.out.print(" |    ");
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
            if (cal.get(Calendar.DAY_OF_WEEK) == breakDay) {
                System.out.print(" |" + " Week " + cal.get(Calendar.WEEK_OF_YEAR) + "\n");
            }
        }
        int countUpTo = 8;
        if (breakDay == Calendar.SATURDAY) {
            countUpTo = 7;
        }
        int currentDayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        if (currentDayOfWeek != breakDay) {
            for (int i = currentDayOfWeek; i < countUpTo; i++) {
                System.out.print(" |    ");
            }
        }
        if (currentDayOfWeek == breakDay) {
            System.out.println("--------------------------------------------");
        } else {
            System.out.println(" |" + " Week " + cal.get(Calendar.WEEK_OF_YEAR));
            System.out.println("--------------------------------------------");
        }
    }
}
