package hassan.week07;

import java.io.*;
import java.util.Objects;
import java.util.Scanner;

public class DynamicWordCounter {
    public static void main(String[] args) {
//        String filename = "/Users/zein/IdeaProjects/CodingCampus_2023.03.VZ.Dornbirn/src/main/resources/txt/simpleText.txt";

        try {
//            File file = new File(filename);
//            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Objects.requireNonNull(DynamicWordCounter.class.getClassLoader().getResourceAsStream("txt/simpleText.txt"))));

            String wordToFind;
            int count = 0;

            Scanner scanner = new Scanner(System.in);
            System.out.println("Welches Wort soll gezaählt werden?  ");
            wordToFind = scanner.nextLine();

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (word.equals(wordToFind)) {
                        count++;
                    }
                }
            }

            bufferedReader.close();

            System.out.println("Das Wort \"" + wordToFind + "\" kommt " + count + " mal vor");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
