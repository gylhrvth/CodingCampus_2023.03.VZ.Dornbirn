package sandro.week07;

import java.io.File;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class TestClassForLogging {
//    static {
//        if(Math.random() > 0.5) {
//            System.err.println("ERROR: Was geht ab Sandro?");
//        }
//    }

    public static Random rand = new Random();

    public static void main(String[] args) {
//        long start1 = System.currentTimeMillis();
//
//        double tmp = 0;
//
//        for (int i = 0; i < 100000000; i++) {
//            Date d = new Date();
//            tmp += d.getTime();
//        }
//
//        long duration1 = (System.currentTimeMillis() - start1);
//
//        System.out.println("Took: "+duration1+"ms "+(duration1 / 100000000.0 ));
//
//        if(Math.random() > 0) {
//            return;
//        }

        long start = System.currentTimeMillis();

        int count = 0;
        int measureLimit = 10000;

        long bytes = 0;

        for (int i = 0; i < 100000; i++) {
            int code = rand.nextInt(1, 4);
            //System.out.println(code);
            bytes += FileLogging3.log(FileLogging.INFO, "test ".repeat(code * 3) + "  -- >" + i);
            bytes += FileLogging3.log(code, "Hello World!".repeat(code + 3));
            bytes += FileLogging3.log(code, "Gucci".repeat(code * 2));

            if (count == measureLimit) {
                count = 0;
                long duration = System.currentTimeMillis() - start;
                System.out.println("Took " + measureLimit / (duration / 1000f) + "w/s");
                System.out.println("Took " + (bytes / (duration / 1000f)) / (1024.0 * 1024.0) + "mb/s");
                start = System.currentTimeMillis();
                bytes = 0;
            }

            count++;
        }

        FileLogging3.close();
    }
}
