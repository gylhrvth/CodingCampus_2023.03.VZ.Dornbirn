package mariechristine.week7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Logging {
    public static final int LOG_LEVEL_ERROR = 1;
    public static final int LOG_LEVEL_WARNING = 2;
    public static final int LOG_LEVEL_INFO = 3;

    private static File LOG_FILE = new File("assets/tmp/output1.txt");

    public static void main(String[] args) {
        //Strg+Alt+L = Code formatieren

        LOG_FILE.delete();

        Logging.log(1, "ERROR: Hier ist ein Fehler passiert!");

        log(LOG_LEVEL_ERROR, "ERROR: Hier ist ein Fehler passiert!");
        log(LOG_LEVEL_WARNING, "WARNING: Keine passende Aufgabe gefunden!");
        log(LOG_LEVEL_INFO, "INFO: Guten Morgen!");


    }

    public static void log(int severity, String message) {
        try {
            FileOutputStream fos = new FileOutputStream(LOG_FILE, true);
            PrintStream ps = new PrintStream(fos);

            Calendar calendar = Calendar.getInstance();
            SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy hh:mm:ss");

            if (severity == 1) {
                System.out.println(sdf.format(calendar.getTime()) + " " + message);
                ps.println(sdf.format(calendar.getTime()) + " " + message);
            } else if (severity == 2) {
                System.out.println(sdf.format(calendar.getTime()) + " " + message);
                ps.println(sdf.format(calendar.getTime()) + " " + message);
            } else if (severity == 3) {
                System.out.println(sdf.format(calendar.getTime()) + " " + message);
                ps.println(sdf.format(calendar.getTime()) + " " + message);
            }

            ps.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

