package sandro.week07;

import java.io.*;

public class FileBufferdCountWord {
    public static void main(String[] args) {
        File file = new File ("C:\\Users\\ossdr\\IdeaProjects\\CodingCampus_2023.03.VZ.Dornbirn\\src\\main\\resources\\txt\\simpleText.txt");

        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(file));
            try {
                String text = reader.readLine();
                while (text != null) {

                    System.out.println(text);



                    text = reader.readLine();

                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            close(reader);
        }

    }
    private static void close(Closeable stuff) {
        if (stuff != null) {
            try {
                stuff.close();
            } catch (IOException ioe) {
                //noop
            }
        }
    }
}
