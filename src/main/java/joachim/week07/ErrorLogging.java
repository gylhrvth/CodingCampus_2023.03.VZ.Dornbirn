package joachim.week07;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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

    public static String getTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE " + "dd.MM.yyyy" + " hh.mm.ss");
        Calendar calendar = Calendar.getInstance();
        return sdf.format(calendar.getTime());
    }

    public static void questioning() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to log something? Y/N");
        boolean asking;
        asking = true;
        while (asking) {
            String answer = scanner.nextLine().toLowerCase();
            if (answer.equals("n") || answer.equals("no")) {
                asking = false;
            }
            if (answer.equals("yes") || answer.equals("y")) {
                try {
                    System.out.println("What would you like to log?\n1.)ERROR\n2.)WARNING\n3.)INFO");
                    int choosing = scanner.nextInt();
                    scanner.nextLine();
                    if (choosing != LOG_LEVEL_ERROR && choosing != LOG_LEVEL_WARNING && choosing != LOG_LEVEL_INFO) {
                        System.out.println("Please choose one of the Options 1.)/2.)/3.)");
                    }
                    if (choosing == LOG_LEVEL_ERROR) {
                        System.out.println("You have chosen an ERROR.\nWhat kind of ERROR occured?");
                        String text = scanner.nextLine();
                        log(LOG_LEVEL_ERROR, text);
                        asking = false;
                    }
                    if (choosing == LOG_LEVEL_WARNING) {
                        System.out.println("You have chosen an WARNING.\nWhat kind of WARNING occured?");
                        String text = scanner.nextLine();
                        log(LOG_LEVEL_WARNING, text);
                        asking = false;
                    }
                    if (choosing == LOG_LEVEL_INFO) {
                        System.out.println("You have chosen an INFO.\nWhat kind of INFO would you like to log??");
                        String text = scanner.nextLine();
                        log(LOG_LEVEL_INFO, text);
                        asking = false;

                    }
                } catch (InputMismatchException ime) {
                    System.out.println("Please choose a given number 1.)/2.)/3.)");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } else {
                System.out.println("Please answer with \"Yes,y ,No or N\"");
            }
        }
    }

    public static void log(int severity, String message) throws IOException {
        BufferedWriter writer = null;
        String errorMassage = " [Error] at ";
        String warningMassage = " [Warning] at ";
        String info = " [Info] at ";
        try {
            File errorLog = new File("C:/Users/Joach/IdeaProjects/CodingCampus_2023.03.VZ.Dornbirn/assets/tmp/errorlog.txt");
            if (errorLog.exists() && errorLog.length() >= 1024 * 1024) {
                File oldLog = new File("C:/Users/Joach/IdeaProjects/CodingCampus_2023.03.VZ.Dornbirn/assets/tmp/errorlog.old");
                oldLog.delete();
                errorLog.renameTo(oldLog);
                errorLog = new File("C:/Users/Joach/IdeaProjects/CodingCampus_2023.03.VZ.Dornbirn/assets/tmp/errorlog.txt");
            }
            writer = new BufferedWriter(new FileWriter(errorLog, true));
            if (severity == LOG_LEVEL_ERROR) {
                writer.write("%s%s%s".formatted(message, errorMassage, getTime() + "\n"));
            }
            if (severity == LOG_LEVEL_WARNING) {
                writer.write("%s%s%s".formatted(message, warningMassage, getTime() + "\n"));
            }
            if (severity == LOG_LEVEL_INFO) {
                writer.write("%s%s%s".formatted(message, info, getTime() + "\n"));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            writer.close();
        }
    }
}
