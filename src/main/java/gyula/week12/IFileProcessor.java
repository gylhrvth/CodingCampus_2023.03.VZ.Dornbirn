package gyula.week12;

import java.io.File;

public interface IFileProcessor {
    void onFileReceived(int depth, File file);
}
