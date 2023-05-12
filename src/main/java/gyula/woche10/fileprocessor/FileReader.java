package gyula.woche10.fileprocessor;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {

    public static void readFile(String fileName, ILineProcess lp){
        File f = new File(fileName);
        try {
            Scanner sc = new Scanner(new FileInputStream(f));
            while (sc.hasNextLine()){
                String line = sc.nextLine();
                lp.processLine(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
