package hassan.week07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        String filename = "/Users/zein/IdeaProjects/CodingCampus_2023.03.VZ.Dornbirn/src/main/resources/txt/simpleText.txt";
        int wordCount = 0;

        try {
            File file = new File(filename);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()){
                scanner.next();
                wordCount++;
            }

            scanner.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }

        System.out.println("Anzahl der Wörter: " + wordCount);
    }
}
