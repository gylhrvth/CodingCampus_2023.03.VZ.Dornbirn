package benjamin.week07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class WriteFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        File f = new File("assets/tmp/output.txt");
        f.getParentFile().mkdirs();
        try {
            FileOutputStream fos = new FileOutputStream(f, true);
            PrintStream ps = new PrintStream(fos);
            String line = " ";
            System.out.println("Insert your text hier!");
            while ((!line.isEmpty())) {
                line = sc.nextLine();
                ps.println(line);
                ps.close();
            }
            sc.close();

            System.out.println("File writing was successful");
        } catch (FileNotFoundException fnfe) {
            System.err.println(f.getAbsolutePath() + " not available.");
        }
    }
}
