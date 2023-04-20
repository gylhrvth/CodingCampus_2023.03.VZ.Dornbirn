package joachim.week07;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ErrorLogging {

    private static final int LOG_LEVEL_ERROR = 1;
    private static final int LOG_LEVEL_WARNING = 2;
    private static final int LOG_LEVEL_INFO = 3;

    public static void main(String[] args) {

        questioning();
    }

    public static void getTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE " + "dd.MM.yyyy" + " hh.mm.ss");
        Calendar calendar = Calendar.getInstance();
        System.out.println(sdf.format(calendar.getTime()));
    }

    public static void questioning() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to log something? Y/N");
        boolean asking;
        asking = true;
        while (asking) {
            String answer = scanner.next().toLowerCase();
            if (answer.equals("n") || answer.equals("no")) {
                asking = false;
            }
            if (answer.equals("yes") || answer.equals("y")) {
                try {
                    System.out.println("What would you like to log?\n1.)ERROR\n2.)WARNING\n3.)INFO");
                    int choosing = scanner.nextInt();
                    if (choosing != LOG_LEVEL_ERROR && choosing != LOG_LEVEL_WARNING && choosing != LOG_LEVEL_INFO) {
                        System.out.println("Please choose one of the Options 1.)/2.)/3.)");
                    }
                    if (choosing == LOG_LEVEL_ERROR) {
                        System.out.println("You have chosen an ERROR.\nWhat kind of ERROR occured?");
                        log(LOG_LEVEL_ERROR, scanner.nextLine());
                        asking = false;
                    }
                    if (choosing == LOG_LEVEL_WARNING) {
                        System.out.println("You have chosen an WARNING.\nWhat kind of WARNING occured?");
                        log(LOG_LEVEL_WARNING, scanner.nextLine());
                        asking = false;
                    }
                    if (choosing == LOG_LEVEL_INFO) {
                        System.out.println("You have chosen an INFO.\nWhat kind of INFO?");
                        log(LOG_LEVEL_INFO, scanner.nextLine());
                        asking = false;

                    } else {
                        System.out.println("Please answer with \"Yes,y ,No or N\"");

                    }
                } catch (InputMismatchException ime) {
                    System.out.println("Please choose a given number 1.)/2.)/3.)");
                }
            }
        }
    }


    public static void log(int severity, String message) {
        if(severity == LOG_LEVEL_ERROR){

        }
        if(severity == LOG_LEVEL_WARNING){

        }
        if(severity == LOG_LEVEL_INFO){

        }
        return;
    }
}
