package sandro.week12.TraversalUsefull;

import java.io.File;

public interface IFileReceiver {
    void onFileReceived(int depth, File file);
}
