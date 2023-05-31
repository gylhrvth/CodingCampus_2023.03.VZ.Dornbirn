package hassan.week12.FileSystemExc;

import java.io.File;

public abstract class FileReceiver {
    public abstract void onFileReceived(int depth, File file);
}
