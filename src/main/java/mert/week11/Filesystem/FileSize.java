package mert.week11.Filesystem;

import java.io.File;

public class FileSize extends FileReceiver {
    private long totalSize;

    public FileSize() {
        totalSize = 0;
    }

    @Override
    public void onFileReceived(int depth, File file) {
        if (file.isFile()) {
            totalSize += file.length();
        }
    }

    long getTotalSize() {
        return totalSize;
    }
}
