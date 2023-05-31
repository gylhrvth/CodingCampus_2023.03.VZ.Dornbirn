package gyula.week12;

import java.io.File;

public class FileWalkerMain {
    public static void main(String[] args) {
        FileWalker fw = new FileWalker();
        fw.addFileProcessor(new FileReceiver());
        fw.addFileProcessor(new FileSizeSum());

        fw.process(new File("src/main/java/gyula"));
    }
}
