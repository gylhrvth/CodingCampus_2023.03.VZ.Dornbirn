package hassan.week07;

import java.io.*;
import java.util.Scanner;

public class WriteFile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        File file = new File("assets/tmp/output.txt");
        file.getParentFile().mkdirs();

        try {

            FileOutputStream fileOutputStream = new FileOutputStream(file,true);
            PrintStream stream = new PrintStream(fileOutputStream);

            String input = "x";

            while (!input.isEmpty()){
                System.out.print("gib was ein ");
                input = scanner.nextLine();
                stream.println(input);
            }

            System.out.println("Eingabe war erfolgreich in datei geschrieben");
            stream.close();

        }catch (IOException e){
            System.out.println("Beim schreiben der Datei ist ein fehler aufgetreten");
        }
        scanner.close();

    }

}
