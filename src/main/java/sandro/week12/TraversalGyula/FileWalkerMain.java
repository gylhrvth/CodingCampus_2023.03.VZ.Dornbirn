package sandro.week12.TraversalGyula;

import java.io.File;
import java.io.FileNotFoundException;

public class FileWalkerMain {
    public static void main(String[] args) {
        FileWalker fw = new FileWalker();
        fw.addFileReceiver(new PrintFileTree());
        CountByExtension cbe = new CountByExtension(".java");
        fw.addFileReceiver(cbe);

        try {
            fw.start(new File("src/main/java/sandro"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Count .java files: " + cbe.getCount());
    }
}
