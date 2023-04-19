package ayguen.week07;

import java.io.File;
import java.nio.file.Path;
import java.util.Scanner;

public class GroessteDatei {
    public static void main(String[] args) {

        File start = new File("C:\\Users\\DCV\\IdeaProjects\\CodingCampus_2023.03.VZ.Dornbirn\\src\\main\\java\\ayguen");


        long biggestFileSize = getBiggestFileSize(start);
        System.out.println("big: " + biggestFileSize);

        printFileStructure(start, start, biggestFileSize);

    }

    public static void printFileStructure (File f, File start, long sizeToSearch){

        if (f.isFile() && f.length() == sizeToSearch){
            Path startPath = Path.of(start.getAbsolutePath());
            Path fPath = Path.of(f.getAbsolutePath());

            System.out.println(startPath.relativize(fPath));
        }

        if (f.isDirectory()){
            File[] content = f.listFiles();
            if (content != null){
                for (File fi : content)
                printFileStructure(fi, start, sizeToSearch);
            }
        }
    }

    public static long getBiggestFileSize (File f){

         if (f.isFile()){
            return f.length();
        }

        File[] content = f.listFiles();
        if (content == null ){
            return 0;
        }

        long max = 0 ;
        for (File fi : content){
            long tempSize = getBiggestFileSize(fi);
            if (tempSize > max){
                max = tempSize;
            }

        }
        return max;
    }
}
