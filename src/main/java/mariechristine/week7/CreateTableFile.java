package mariechristine.week7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class CreateTableFile {
    public static void main(String[] args) {
        File f = new File("assets/tmp/output.txt");

        String grid = StreamsTable.printTable();
        try {
            FileOutputStream fos = new FileOutputStream(f, false);
            PrintStream ps = new PrintStream(fos);
            ps.println(grid);
            ps.close();
            System.out.println("Tabelle erstellt.");
        } catch (FileNotFoundException fnfe) {
            System.out.println(f.getAbsolutePath() + " ist nicht erreichbar.");
        }
    }
}
