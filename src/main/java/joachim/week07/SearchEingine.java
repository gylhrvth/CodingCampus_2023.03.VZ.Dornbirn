package joachim.week07;

import java.io.File;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SearchEingine {
    public static void main(String[] args) {

        search(searchFile(), searchCrit());
    }

    public static void search(File fileInput, String crit) {
        if (fileInput.getName().contains(crit)) {
            System.out.println(fileInput.getAbsolutePath());
        }
        File[] file = fileInput.listFiles();
        if (file != null) {
            for (File fi : file) {
                search(fi, crit);
            }
        }
    }

    public static File searchFile() {
        Scanner scanner = new Scanner(System.in);
        File path = null;
        System.out.println("Please enter a pathway");
        path = new File(scanner.next());
        if (path.exists() && path.isDirectory()) {
            return path;
        } else {
            System.out.println("A valid pathway please!");
            searchFile();
        }
        return path;
    }
    public static String searchCrit(){
        System.out.println("What are we looking for?");
        Scanner scanner = new Scanner(System.in);
        String crit = scanner.next();
        return crit;
    }
}