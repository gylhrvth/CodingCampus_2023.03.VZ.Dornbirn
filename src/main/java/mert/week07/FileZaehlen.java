package mert.week07;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileZaehlen {


    public static void main(String[] args) {
        String text = scann();
        searchLetter(text);

    }


    public static String scann() {
        try {
            FileInputStream fis = new FileInputStream("assets/tmp/test.txt");
            Scanner sc = new Scanner(fis);
            while (sc.hasNext()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Datei nicht gefunden");
        }
        return null;
    }


    public static void searchLetter(String text) {

        int anzahl = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'a')
                anzahl++;
        }
        System.out.println("Anzahl der Vorkommen von a: " + anzahl);
    }
}

