package mariechristine.week7;

import java.io.File;
import java.util.Scanner;

public class SearchFile {
    public static void main(String[] args) {

        File startPath = new File("C:\\Users\\DCV\\IdeaProjects\\CodingCampus_2023.03.VZ.Dornbirn\\src\\main\\java\\mariechristine");
        String text = lookUpPath("Gib einen Dateipfad ein!");


    }

    public static String lookUpPath(String text) {
        Scanner sc = new Scanner(System.in);
        System.out.println(text);
        return sc.nextLine();

    }

//   public static long lookUpBiggestFile() {}

}
