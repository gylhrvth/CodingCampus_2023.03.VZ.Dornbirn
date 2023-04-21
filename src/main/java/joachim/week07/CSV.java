package joachim.week07;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class CSV {
    public static void main(String[] args) {
        String[][] data = createArr1("csv/sales_100.csv");
        print(data);

    }

    public static String[][] createArr1(String fileName) {
        int countOfLines = count(fileName);
        String[][] arr = new String[countOfLines][];

        InputStream inputStream = Objects.requireNonNull(CSV.class.getClassLoader().getResourceAsStream(fileName));
        Scanner scanner = new Scanner(inputStream);

        int currentLine = 0;
        while (scanner.hasNextLine()) {
            String text = scanner.nextLine();
            arr[currentLine] = text.split(",");
            ++currentLine;
        }
        return arr;
    }

    public static int count(String fileName) {
        InputStream inputStream = Objects.requireNonNull(CSV.class.getClassLoader().getResourceAsStream(fileName));
        Scanner scanner = new Scanner(inputStream);

        int count = 0;
        while (scanner.hasNextLine()) {
            String text = scanner.nextLine();
            ++count;
        }
        return count;
    }

    public static void print(String[][] data) {
        int[] width = new int[data[0].length];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j].length() > width[j])
                    width[j] = data[i][j].length();
            }
        }
        for (String[] datum : data) {
            for (int j = 0; j < datum.length; j++) {
                System.out.printf("| %" + width[j] + "s ", datum[j]);
            }
            System.out.println("|");
        }
    }

//    public static String[][] order(String[][] arr) {
//        String temp = "";
//        for (int i = 1; i < arr.length - 1; i++) {
//            for (int j = 0; j < arr.length - 1; j++) {
//                if (arr[j].compareTo(arr[j + 1]) > 0) {
//                    temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }
//        return arr;
//    }
}