package benjamin.week07;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Logging3 {
    private static final File file = new File("assets/tmp/logfile.txt");
    private static final File oldFile = new File("assets/tmp/logfile.old");
    private static final SimpleDateFormat dateAndTime = new SimpleDateFormat("yyy.MM.dd. HH:mm:ss ");

    private static BufferedWriter bufferedWriter;
    private static long outputSize = 0;

    public static void log(int severity, String message) {
        try {
            GregorianCalendar now = new GregorianCalendar();
            File logFile = file;

            if(bufferedWriter == null) {
                bufferedWriter = new BufferedWriter(new FileWriter(logFile));
            }

            //logFile.getParentFile().mkdirs();

            if (outputSize > 1024 * 1024) {
                bufferedWriter.close();
                File oldLogFile = oldFile;
                if (oldLogFile.exists()) {
                    oldLogFile.delete();
                }
                logFile.renameTo(oldLogFile);
                bufferedWriter = new BufferedWriter(new FileWriter(logFile));
                outputSize = 0;
            }

            String time = dateAndTime.format(now.getTime());

            String outputMessage = "";
            if (severity == 1) {
                outputMessage= time + "ERROR " + message;
            } else if (severity == 2) {
                outputMessage= time + "WARNING: " + message;
            } else if (severity == 3) {
                outputMessage=time + "INFO: " + message;
            }
            outputSize += outputMessage.length();
            bufferedWriter.write(outputMessage);
            bufferedWriter.newLine();
        } catch (IOException fnfe) {
            System.err.println(" not available.");
        }
    }
}
