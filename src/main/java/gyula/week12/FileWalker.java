package gyula.week12;

import java.io.File;
import java.util.Vector;

public class FileWalker {
    private Vector<IFileProcessor> fp;

    public FileWalker(){
        this.fp = new Vector<>();
    }

    public void addFileProcessor(IFileProcessor processor){
        if (!fp.contains(processor)){
            fp.add(processor);
        }
    }

    public void process(File startFile){
        process(0, startFile);
    }

    private void process(int depth, File startFile){
        for (IFileProcessor processor : fp) {
            processor.onFileReceived(depth, startFile);
        }
        if (startFile.isDirectory()){
            File[] fList = startFile.listFiles();
            for (int i = 0; i < fList.length; i++) {
                process(depth + 1, fList[i]);
            }
        }
    }
}
