package benjamin.week07;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class StreamCountWords {
    public static void main(String[] args) {

        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader("C:\\Users\\Beni\\IdeaProjects\\CodingCampus_2023.03.VZ.Dornbirn\\src\\main\\resources\\txt\\simpleText.txt"));
            int wordCount = 0;
            String text = reader.readLine();
            while (text != null) {
                String[] word = text.split("\\s+");
                wordCount += word.length;
                text = reader.readLine();
            }
            System.out.println("Anzahl der Wörter: " + wordCount);

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    //noop
                }
            }
        }
    }
}