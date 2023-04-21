package eric.week07.datenStroemeExcersice;

import java.io.File;
import java.nio.file.Path;
import java.util.Scanner;

public class SearchForGreatest2 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        
    }

    public static void askForPath(){
        String directoryPath = null;
        File directory = null;
        boolean validInput = false;


        while (!validInput) {
            System.out.println("Bitte gib ein Verzeichnungspfad an.");
            directoryPath = sc.nextLine();
            directory = new File(directoryPath);


            if (directory.exists() && directory.isDirectory()) {
                validInput = true;
            } else {
                System.out.println("Ungültiger Verzeichnispfad" + directoryPath);
            }
        }
    }

    public static void printFileStructure(File f, /*File start,*/ long sizeToSearch){
        String directoryPath = null;
        File directory = null;
        boolean validInput = false;


        while (!validInput) {
            System.out.println("Bitte gib ein Verzeichnungspfad an.");
            directoryPath = sc.nextLine();
            directory = new File(directoryPath);


            if (directory.exists() && directory.isDirectory()) {
                validInput = true;
            } else {
                System.out.println("Ungültiger Verzeichnispfad" + directoryPath);
            }
        }
        if (f.isFile() && f.length() == sizeToSearch) {
//            Path startPath = Path.of(start.getAbsolutePath());
            Path fPath = Path.of(f.getAbsolutePath());

//            System.out.println(startPath.relativize(fPath));
        }

        if (f.isDirectory()){
            File[] content = f.listFiles();
            if (content != null){
                for (File fi: content) {
                    printFileStructure(fi, sizeToSearch);
                }
            }
        }
    }

    public static long getBiggestFileSize(File f){
        if (f.isFile()){
            return f.length();
        }

        File[] content = f.listFiles();
        if (content == null){
            return 0;
        }

        long max = 0;
        for (File fi : content) {
            long tempSize = getBiggestFileSize(fi);
            if (tempSize > max){
                max = tempSize;
            }
        }
        return max;
    }
}
