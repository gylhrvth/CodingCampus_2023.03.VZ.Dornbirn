package sandro.week12.TraversalGyula;

import java.io.File;

public interface IFileReceiver {
    void onFileReceived(int depth, File file);
}
