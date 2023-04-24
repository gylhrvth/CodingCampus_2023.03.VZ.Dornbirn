package ayguen.week07;

import java.io.*;
import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Logging {
    public static final int LOG_LEVEL_INFO = 1;
    public static final int LOG_LEVEL_WARNING = 3;
    public static final int LOG_LEVEL_ERROR = 2;
    public static void main(String[] args) {

        log(LOG_LEVEL_ERROR, "");
        log(LOG_LEVEL_INFO, "");
        log(LOG_LEVEL_WARNING, "");
        log(LOG_LEVEL_ERROR, "");
        log(LOG_LEVEL_INFO, "");
        log(LOG_LEVEL_WARNING, "");
        log(LOG_LEVEL_ERROR, "");
        log(LOG_LEVEL_INFO, "");
        log(LOG_LEVEL_WARNING, "");

    }

    public static void log(int severity, String message) {
        GregorianCalendar now = new GregorianCalendar();
        SimpleDateFormat date = new SimpleDateFormat("yyyy.MM.dd  HH:mm:ss");
        File f = new File("assets/tmp/test.txt");

        try {

            System.out.println("1-3");
            FileOutputStream fos = new FileOutputStream(f, true);
            PrintStream ps = new PrintStream(fos);

            if (severity == LOG_LEVEL_INFO) {
                ps.println(message +date.format(now.getTime()) + " ----> INFO ----> Heute ist Freitag" );
            }
            if (severity == LOG_LEVEL_ERROR) {
                ps.println(message + date.format(now.getTime()) + "----> ERROR ----> Das ist eine Fehlernachricht" );
            }
            if (severity == LOG_LEVEL_WARNING) {
                ps.println(message + date.format(now.getTime()) + "----> WARNING ----> Diese Aufgabe ist nicht cool!");
            }


            ps.close();
            System.out.println("File schreiben erfolgreich");
        } catch (FileNotFoundException fnfe) {
            System.out.println(f.getAbsolutePath() + "ist nicht erreichbar");
        }


    }
}




