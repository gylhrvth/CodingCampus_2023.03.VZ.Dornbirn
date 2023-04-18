package joachim.week07;

import java.io.File;


public class ZaehlenUndSummeRekursive {


    public static void main(String[] args) {
        File file = new File("C:\\Users\\Joach\\IdeaProjects\\CodingCampus_2023.03.VZ.Dornbirn\\src\\main");
        System.out.println("Menge der Dateien: " + rekursive(file));
        System.out.println("Größe des Ordners: " + rekursive2(file) + "Bytes");

    }

    public static int rekursive(File fileInput) {
        if (fileInput.isFile()) {
            return 1;
        }

        int number = 0;
        File[] files = fileInput.listFiles();
        if(files != null){
            for (File fi : files) {
                number += rekursive(fi);
            }
        }
        return number;
    }
    public static long rekursive2(File fileInput) {
        if (fileInput.isFile()) {
            return fileInput.length();
        }

        long size = 0;
        File[] files = fileInput.listFiles();
        if(files != null){
            for (File fi : files) {
                size += rekursive2(fi);
            }
        }
        return size;
    }
}