package mariechristine.week7;

import java.io.*;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\DCV\\IdeaProjects\\CodingCampus_2023.03.VZ.Dornbirn\\src\\main\\java\\mariechristine\\week7\\BonusFileReadWrite.java");

        BufferedReader bR = null;
        try {
            bR = new BufferedReader(new FileReader(f));
            String input;
            while ((input = bR.readLine()) != null) {
                System.out.println(input);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
