package eric.week07.streams;

import lukas.week03.day4.Colors;

import java.io.*;

public class StreamsCountWords {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\syn7e\\IdeaProjects\\CodingCampus_2023.03.VZ.Dornbirn\\src\\main\\resources\\txt\\simpleText.txt");
        int count = 0;

        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String input;
            while ((input = reader.readLine()) != null) {
                String[] words = input.split("\\S+");
                count += words.length;
            }
            System.out.println("Das File: " + file.getPath() + "\nenthält " + Colors.COLORS[2] + count + Colors.RESET + " Wörter.");
            reader.close();
        } catch (IOException e) {
            e.getStackTrace();
        }
    }
}
