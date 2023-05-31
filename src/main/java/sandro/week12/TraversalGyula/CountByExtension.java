package sandro.week12.TraversalGyula;

import java.io.File;

public class CountByExtension implements IFileReceiver{
    private String ext;
    private int count;

    public CountByExtension(String ext){
        this.ext = ext;
        this.count = 0;
    }

    public void resetCount(){
        count = 0;
    }

    public int getCount() {
        return count;
    }

    @Override
    public void onFileReceived(int depth, File file) {
        if (file.getName().endsWith(ext)){
            ++count;
        }
    }
}
