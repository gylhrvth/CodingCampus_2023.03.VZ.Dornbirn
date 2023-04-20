package benjamin.week07;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;

public class ReadFileAndPrint {
    public static void main(String[] args) {

        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader("C:\\Users\\Beni\\IdeaProjects\\CodingCampus_2023.03.VZ.Dornbirn\\assets\\tmp\\logfile.txt"));
            String input = reader.readLine();
            while (input != null) {
                System.out.println(input);
                input = reader.readLine();
            }
        } catch (IOException e) {
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
