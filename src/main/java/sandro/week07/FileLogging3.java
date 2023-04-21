package sandro.week07;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileLogging3 {
    public static int ERROR = 1;
    public static int WARNING = 2;
    public static int INFO = 3;
    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd. HH:mm:ss");
    private static String[] codetextList = {"ALT-INFO", "ERROR", "WARNING", "INFO"};
    private static File logFile = new File("assets/temp/logFile.txt");

    private static BufferedWriter bufferedWriter = null;

    private static long currentLogSize = 0;

    public static int log(int severity, String message) {
        try {
            if (bufferedWriter == null) {
                bufferedWriter = new BufferedWriter(new FileWriter(logFile));    //true wechseln, nur false für test
            }
            if (currentLogSize > 1024 * 1024) {
                bufferedWriter.close();
                createBackupFile(logFile);
                bufferedWriter = new BufferedWriter(new FileWriter(logFile));    //true wechseln, nur false für test
                currentLogSize = 0;
            }

            //   Calendar now = Calendar.getInstance();


            if (severity < 1 || severity >= codetextList.length) {
                severity = 0;
            }
            String codetext = codetextList[severity];

            String outputMessage = String.format("%s %s: %s\n",
                    sdf.format(new Date()),
                    codetext,
                    message);
            currentLogSize += outputMessage.length();
            bufferedWriter.write(outputMessage);
            return outputMessage.length();
        } catch (IOException fnfe) {
            System.out.println(logFile.getAbsolutePath() + " ist nicht erreichbar.");
        }
        return 0;
    }

    public static void close() {
        if (bufferedWriter != null) {
            try {
                bufferedWriter.close();
            } catch (IOException exc) {
                //noop
            }
        }
    }

    public static void createBackupFile(File log) {
        Path logFile = Path.of(log.getAbsolutePath());
        Path backup = Path.of(log.getAbsolutePath() + ".old");
        try {
            Files.copy(logFile, backup, StandardCopyOption.REPLACE_EXISTING);
            Files.delete(logFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
