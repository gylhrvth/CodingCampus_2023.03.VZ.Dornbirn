package mariechristine.week7;

import java.io.File;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class CSV {

    public static void main(String[] args) {
        InputStream inputStream = Objects.requireNonNull(CSV.class.getClassLoader().getResourceAsStream("csv/sales_100.csv"));
        Scanner sc = new Scanner(inputStream);

        while (sc.hasNextLine()) {
            String text = sc.nextLine();
            System.out.println(text);
        }

        int rows = 0;
        int col = 0;
        String[][] textArr = new String[rows][col];
        for (int i = 0; i < textArr.length; i++) {
            for (int j = 0; j < textArr.length; j++);
        }
    }
}