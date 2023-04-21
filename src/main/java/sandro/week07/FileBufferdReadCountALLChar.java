package sandro.week07;

import java.io.*;

public class FileBufferdReadCountALLChar {
    public static void main(String[] args) {
        File logfile = new File("assets/temp/logFile.txt");

        int count = 0;
        int sum = 0;
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(logfile));
            try {
                String text = reader.readLine();
                while (text != null) {
                    System.out.println(text.length());
                    count = text.length();
                    //        countChars(text);
                    text = reader.readLine();
                    sum += count;
                }

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            close(reader);
        }

        System.out.println("total char sum: " + sum);
    }


//    public static int countChars(String text) {
//        int count = 0;
//        int sum = 0;
//        for (int i = 0; i < text.length(); i++) {
//            count++;
//        }
//        sum += countChars(text);
//        return sum;
//    }

    public static void close(Closeable stuff) {
        if (stuff != null) {
            try {
                stuff.close();
            } catch (IOException ioe) {
                //noop
            }
        }
    }
}
