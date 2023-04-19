package mert.week07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class FileLogin {
    public static void main(String[] args) {
        GregorianCalendar now = new GregorianCalendar();
        SimpleDateFormat date = new SimpleDateFormat("yyyy.MM.dd  HH:mm:ss");

        File f = new File("assets/tmp/test.txt");



        try {

            System.out.println("1-3");
            FileOutputStream fos = new FileOutputStream(f, true);
            PrintStream ps = new PrintStream(f);

            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();

            ps.print(date.format(now.getTime()) + "    ");
            ps.println(line);

//TODO String mit severity verknüpfen


            ps.close();
            System.out.println("File schreiben erfolgreich");
        } catch (FileNotFoundException fnfe) {
            System.out.println(f.getAbsolutePath() + "ist nicht erreichbar");
        }

    }

    public static void log(int severity, String message) {
        if (severity == 1) {
            System.out.println(message + "ERROR");
        }
        if (severity == 2) {
            System.out.println(message + "WARNING");
        }
        if (severity == 3) {
            System.out.println(message + "INFO");
        }
    }
}