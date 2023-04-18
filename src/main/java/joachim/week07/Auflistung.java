package joachim.week07;

import java.io.File;


public class Auflistung {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Joach\\IdeaProjects\\CodingCampus_2023.03.VZ.Dornbirn\\src\\main\\java\\joachim\\week02");


        File[] alleFiles = file.listFiles();
        for (int i = 0; i < alleFiles.length; i++) {
            System.out.println(alleFiles[i].getName());
        }
    }
}
