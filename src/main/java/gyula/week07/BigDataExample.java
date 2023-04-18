package gyula.week07;

import java.io.File;
import java.nio.file.Path;

public class BigDataExample {
    public static void main(String[] args) {
        File startPath = new File("/Users/gyula.horvath/IdeaProjects/CodingCampus_2023.03.VZ.Dornbirn/src/");

        long bigestFileSize = getBigestFileSize(startPath);
        System.out.println("big: " + bigestFileSize);

        printFileStructure(startPath, startPath, bigestFileSize);
    }


    public static void printFileStructure(File f, File start, long sizeToSearch){
        if (f.isFile() && f.length() == sizeToSearch) {
            Path startPath = Path.of(start.getAbsolutePath());
            Path fPath = Path.of(f.getAbsolutePath());

            System.out.println(startPath.relativize(fPath));
        }

        if (f.isDirectory()){
            File[] content = f.listFiles();
            if (content != null){
                for (File fi: content) {
                    printFileStructure(fi, start, sizeToSearch);
                }
            }
        }
    }

    public static long getBigestFileSize(File f){
        if (f.isFile()){
            return f.length();
        }

        File[] content = f.listFiles();
        if (content == null){
            return 0;
        }

        long max = 0;
        for (File fi : content) {
            long tempSize = getBigestFileSize(fi);
            if (tempSize > max){
                max = tempSize;
            }
        }
        return max;
    }


}
