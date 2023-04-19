package hassan.week07;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Streams2 {
    public static void main(String[] args) {

        //Exception
        try {
            //pfad
            FileInputStream fis = new FileInputStream("/Users/gyula.horvath/IdeaProjects/CodingCampus_2023.03.VZ.Dornbirn/src/main/java/gyula/week07/MyMessage.txt");

            //Scanner
            Scanner sc = new Scanner(fis);

            //schleife zum input holen
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                //input ausdrucken
                System.out.println(line);
            }

            //scanner schließen
            sc.close();

            //expection nachricht
        } catch (FileNotFoundException fnfe){
            System.out.println("Datei wurde nicht gefunden.");
        }
    }
}
