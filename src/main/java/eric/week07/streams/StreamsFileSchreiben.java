package eric.week07.streams;


import java.io.*;
import java.util.Scanner;

public class StreamsFileSchreiben {
    public static void main(String[] args) {
        File file = new File("assets/tmp/output.txt");
        file.getParentFile().mkdirs();

        Scanner sc = new Scanner(System.in);
        try {
            FileOutputStream fos = new FileOutputStream(file, true);
            PrintStream ps = new PrintStream(fos);

            System.out.println("Bitte dein Text eingeben: ");
            System.out.print(">> ");

            String line = sc.nextLine();

            while (!line.equals("")) {
                ps.println(line);
                System.out.print(">> ");
                line = sc.nextLine();
            }
            ps.close();
            sc.close();
        } catch (FileNotFoundException fnfe) {
            System.out.println("Ein Fehler ist Aufgetreten " + fnfe.getMessage());
        }
    }
}
