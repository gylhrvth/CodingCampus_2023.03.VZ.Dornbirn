package sandro.week12.TraversalUsefull;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Vector;

public class FileWalker {
    private Vector<IFileReceiver> frList;


    public FileWalker(){
        frList = new Vector<>();
    }

    public void addFileReceiver(IFileReceiver fr){
        if (!frList.contains(fr)){
            frList.add(fr);
        }
    }

    public void start(File f) throws FileNotFoundException{
        start(0, f);
    }
    private void start(int depth, File f) throws FileNotFoundException{
        if (!f.exists()){
            throw new FileNotFoundException("Aaaaagh!");
        }

        for (IFileReceiver fr : frList) {
            fr.onFileReceived(depth, f);
        }

        if (f.isDirectory()){
            File[] content = f.listFiles();
            for (File ff: content) {
                start(depth + 1, ff);
            }
        }
    }
}
