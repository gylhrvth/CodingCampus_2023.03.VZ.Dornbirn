package joachim.week07;

import java.io.*;
import java.util.Objects;
import java.util.Scanner;

public class Streames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        File f = new File("assets/tmp/output.txt");
        f.getParentFile().mkdirs();
        try {
            FileOutputStream fos = new FileOutputStream(f, false);
            PrintStream ps = new PrintStream(fos);


            System.out.println("What should we add to the File?");
            String text = scanner.nextLine();
            while (!text.isEmpty()){
                ps.println(text);
                text = scanner.nextLine();
            }

            ps.close();
            System.out.println("Schreiben erfolgreich.");

        } catch (FileNotFoundException fnfe) {
            System.err.println("Was für eine Datei?");
        }
    }
}