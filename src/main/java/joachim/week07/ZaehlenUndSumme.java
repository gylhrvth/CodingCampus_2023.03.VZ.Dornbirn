package joachim.week07;

import java.io.File;

public class ZaehlenUndSumme {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Joach\\IdeaProjects\\CodingCampus_2023.03.VZ.Dornbirn\\src\\main\\java\\hassan");


        File[] allefiles = file.listFiles(File::isFile);
        System.out.println(allefiles.length);


        int summe = 0;
        for (int i = 0; i < allefiles.length; i++) {
            summe += allefiles[i].length();

        }
        System.out.println(summe);
    }
}
