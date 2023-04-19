package benjamin.week07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Logging {
    public static void main(String[] args) {

    }

    public static void log(int severity, String message){
        GregorianCalendar now = new GregorianCalendar();
        File f = new File("assets/tmp/logging.txt");
        f.getParentFile().mkdirs();

        SimpleDateFormat dateAndTime = new SimpleDateFormat("yyy.MM.dd. HH:mm:ss ");
        String time = dateAndTime.format(now.getTime());

        try {
            FileOutputStream fos = new FileOutputStream(f, true);
            PrintStream ps = new PrintStream(fos);

            if(severity == 1){
                ps.println(time + "ERROR " + message);
            }else if (severity == 2){
                ps.println(time + "WARNING: " + message);
            }else if (severity == 3){
                ps.println(time + "INFO: " + message);
            }
            ps.close();
            System.out.println("Log successful!");

        }catch (FileNotFoundException fnfe) {
            System.err.println(f.getAbsolutePath() + " not available.");

        }
    }
}
