package hassan.week07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class Logging {
    private static File file = new File("assets/temp/Logging.txt");
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Calendar date = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.mm.dd");

        file.getParentFile().mkdirs();

        System.out.println("Please pick [1], [2], or [3]");
        log(sc.nextInt(),sdf.format(date.getTime()));

    }

    public static void log(int severity, String message) {
        Locale.setDefault(new Locale("en"));
        Calendar date = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE");

        try {
            FileOutputStream fos = new FileOutputStream(file, true);
            PrintStream ps = new PrintStream(fos);

            if (severity == 1) {
                ps.println(message + " -->ERROR: Couldn´t find todays date.");
            }

            if (severity == 2) {
                date.add(Calendar.DAY_OF_YEAR, 1);
                ps.println(message + " -->WARNING: Tomorrow is " + sdf.format(date.getTime()) + "!");
            }

            if (severity == 3) {
                ps.println(message + " -->INFO: Today is " + sdf.format(date.getTime()) + "!");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Ein Fehler ist aufgetreten" + e.getMessage());
        }
    }
}
