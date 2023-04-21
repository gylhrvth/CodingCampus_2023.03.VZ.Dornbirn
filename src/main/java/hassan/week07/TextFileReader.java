package hassan.week07;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Objects;
import java.util.Scanner;

public class TextFileReader {
    public static void main(String[] args) {
        InputStream inputStream = Objects.requireNonNull(TextFileReader.class.getClassLoader().getResourceAsStream("txt/simpleText.txt"));
        Reader reader = new InputStreamReader(inputStream);

        Scanner scanner = new Scanner(inputStream);
        BufferedReader bufferedReader = new BufferedReader(reader);

        readWithScanner(scanner);


    }

    public static void readWithScanner(Scanner scanner){
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            System.out.println(line);
        }
        scanner.close();
    }


}
