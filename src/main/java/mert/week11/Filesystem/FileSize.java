package mert.week11.Filesystem;

import java.io.File;

public class FileSize extends FileReceiver {
    private long totalSize;


    @Override
    public void getFileReceived(int depth, File file) {
        totalSize = file.length();
    }
}
