package sandro.week07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class FileWrite {
    public static void main(String[] args) {



        File f = new File("assets/temp/output.txt");
        f.getParentFile().mkdirs();

        try {
            FileOutputStream fos = new FileOutputStream(f, false);
            PrintStream ps = new PrintStream(fos);

            Scanner sc = new Scanner(System.in);

            String text = "x";
            while (!text.isEmpty()) {
                System.out.print(">> ");
                text = sc.nextLine();
                ps.println(text);
            }
            ps.close(); // printstream close?
            sc.close();
            System.out.println("files completed");
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
            System.out.println(f.getAbsoluteFile() + " path is not valid");
        }


    }


}
