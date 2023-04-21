package gyula.week07;

import java.io.File;
import java.io.InputStream;
import java.util.Objects;
import java.util.Scanner;

public class RessourceExample {
    public static void main(String[] args) {
        File fileAbsolute = new File("/Users/gyula.horvath/IdeaProjects/CodingCampus_2023.03.VZ.Dornbirn/src/main/java/gyula/week07/MyMessage.txt");
        File fileRelative = new File("assets/tmp/hello.txt");

        InputStream inputStream = Objects.requireNonNull(RessourceExample.class.getClassLoader().getResourceAsStream("csv/sales_100.csv"));
        Scanner sc = new Scanner(inputStream);

        while (sc.hasNextLine()){
            String line = sc.nextLine();
            System.out.println(line);
        }
    }
}
