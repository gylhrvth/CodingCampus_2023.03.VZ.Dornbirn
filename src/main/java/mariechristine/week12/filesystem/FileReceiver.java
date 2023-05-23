package mariechristine.week12.filesystem;

import java.io.File;

public abstract class FileReceiver {

    abstract public int onFileReceived(int depth, File file);

}
