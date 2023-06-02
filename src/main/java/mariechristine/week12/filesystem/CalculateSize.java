package mariechristine.week12.filesystem;

import java.io.File;

public class CalculateSize extends FileReceiver {
    @Override
    public int onFileReceived(int depth, File file) {
        if (file.isFile()) {
            return (int) file.length();
        }

        File[] fileContent = file.listFiles();
        int sum = 0;
        for (int i = 0; i < fileContent.length; i++) {
            sum += onFileReceived(depth, file);
        }
        return sum;
    }
}
