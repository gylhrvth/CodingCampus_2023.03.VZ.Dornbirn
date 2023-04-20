package sandro.week07;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class FileLogging {
    public static int ERROR = 1;
    public static int WARNING = 2;
    public static int INFO = 3;
    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd. HH:mm:ss");
    private static String[] codetextList = {"ALT-INFO", "ERROR", "WARNING", "INFO"};
    private static File logFile = new File("assets/temp/logFile.txt");



    public static void log(int severity, String message) {

        if (logFile.length() > 1024 * 1024){
            createBackupFile(logFile);
        }

     //   Calendar now = Calendar.getInstance();


        if (severity < 1 || severity >= codetextList.length) {
            severity = 0;
        }
        String codetext = codetextList[severity];

        try {
            FileOutputStream fos = new FileOutputStream(logFile, true);    //true wechseln, nur false für test
            PrintStream ps = new PrintStream(fos);

            ps.printf("%s %s: %s\n",
                    sdf.format(new Date()),
                    codetext,
                    message);

            ps.close();
            //System.out.println("File schreiben war erfolgreich");
        } catch (FileNotFoundException fnfe) {
            System.out.println(logFile.getAbsolutePath() + " ist nicht erreichbar.");
        }

    }

    public static void createBackupFile(File log){
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
