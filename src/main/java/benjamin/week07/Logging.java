package benjamin.week07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Logging {
    private static final File file = new File("assets/tmp/logfile.txt");
    private static final File oldFile = new File("assets/tmp/logfile.old");
    private static final SimpleDateFormat dateAndTime = new SimpleDateFormat("yyy.MM.dd. HH:mm:ss ");

    public static void log(int severity, String message) {
        GregorianCalendar now = new GregorianCalendar();
        File logFile = file;
        logFile.getParentFile().mkdirs();

        if (logFile.length() > 10000) {
            File oldLogFile = oldFile;
            if (oldLogFile.exists()) {
                oldLogFile.delete();
            }
            logFile.renameTo(oldLogFile);
        }

        String time = dateAndTime.format(now.getTime());

        try {
            FileOutputStream fos = new FileOutputStream(logFile, true);
            PrintStream ps = new PrintStream(fos);

            if (severity == 1) {
                ps.println(time + "ERROR " + message);
            } else if (severity == 2) {
                ps.println(time + "WARNING: " + message);
            } else if (severity == 3) {
                ps.println(time + "INFO: " + message);
            }

            ps.close();

        } catch (FileNotFoundException fnfe) {
            System.err.println(logFile.getAbsolutePath() + " not available.");
        }
    }
}
