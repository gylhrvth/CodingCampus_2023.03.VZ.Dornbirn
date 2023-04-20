package joachim.week07;

import java.io.File;

public class BiggestUnit {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Joach\\IdeaProjects\\CodingCampus_2023.03.VZ.Dornbirn\\src\\main");
        System.out.println("The biggest unit is " + rekursiveMaxFileSize(file) + " bytes big.");

        File big = searchMaxFileSize(file);
        if (big != null) {
            System.out.println("The biggest unit is " + big.getAbsolutePath() + " with " + big.length() + " bytes size");
        } else {
            System.out.println("There are no files in the directory structure");
        }
    }

    public static long rekursiveMaxFileSize(File fileInput) {
        if (fileInput.isFile()) {
            return fileInput.length();
        }
        long maxsize = 0;
        File[] file = fileInput.listFiles();
        if (file == null) {
            return 0;
        }
        for (File fi : file) {
            long maxSizeOfChild = rekursiveMaxFileSize(fi);
            if (maxSizeOfChild > maxsize) {
                maxsize = maxSizeOfChild;
            }
        }
        return maxsize;
    }

    public static File searchMaxFileSize(File fileInput) {
        if (fileInput.isFile()) {
            return fileInput;
        }

        File fileWithMaxsize = null;
        File[] file = fileInput.listFiles();
        if (file != null) {
            for (File fi : file) {
                File maxSizeOfChild = searchMaxFileSize(fi);
                if (fileWithMaxsize == null || (maxSizeOfChild != null && maxSizeOfChild.length() > fileWithMaxsize.length())) {
                    fileWithMaxsize = maxSizeOfChild;
                }
            }
        }
        return fileWithMaxsize;
    }

}
