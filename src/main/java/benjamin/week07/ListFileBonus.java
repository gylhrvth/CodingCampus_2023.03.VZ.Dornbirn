package benjamin.week07;

import lukas.week03.day4.Colors;

import java.io.File;

public class ListFileBonus {

    public static void main(String[] args) {

        File directory = new File("C:\\Users\\Beni\\IdeaProjects\\CodingCampus_2023.03.VZ.Dornbirn\\src\\main\\java\\benjamin");
        printFile("", directory);
    }

    public static void descendingFile(File[] file) {
        for (int i = 0; i < file.length; i++) {
            for (int j = 0; j < file.length - i - 1; j++) {
                if ((file[j].isFile() != file[j + 1].isFile())&& file[j].compareTo(file[j + 1]) > 0) {
                    File temp = file[j];
                    file[j] = file[j + 1];
                    file[j + 1] = temp;
                }
            }
        }
    }

    public static void printFile(String indent, File file) {
        System.out.print(indent);
        if (file.isFile()) {
            System.out.print(Colors.COLORS[2]);
        }
        System.out.print(file.getName());
        if (file.isFile()) {
            System.out.print(Colors.RESET);
        }
        System.out.println();
        if (file.isFile()) {
            return;
        }

        File[] fileList = file.listFiles();
        if (file != null) {
            descendingFile(fileList);
            for (File fi : fileList) {
                printFile(indent + "   ", fi);
            }
        }
    }
}
