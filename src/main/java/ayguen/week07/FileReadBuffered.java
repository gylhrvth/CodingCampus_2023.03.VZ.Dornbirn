package ayguen.week07;

import java.io.*;
import java.util.Scanner;

public class FileReadBuffered {


    public static void main(String[] args) {

        File file = new File("C:\\Users\\DCV\\IdeaProjects\\CodingCampus_2023.03.VZ.Dornbirn\\assets\\tmp\\output\\test1");

        Scanner scanner = null;
        try {
            scanner = new Scanner(new FileInputStream(file));
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            close(scanner);

        }
    }
    private static void close(Closeable reader) {
        if (reader != null) {
            try {
                reader.close();
            } catch (IOException e) {


            }
        }
    }
}
