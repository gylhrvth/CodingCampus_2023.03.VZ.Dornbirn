package eric.week11.fileSystem;

import java.io.File;

abstract class FileReceiver {
    public abstract void onFileReceiver(int depth, File file);

    @Override
    public String toString() {
        return super.toString();
    }
}
