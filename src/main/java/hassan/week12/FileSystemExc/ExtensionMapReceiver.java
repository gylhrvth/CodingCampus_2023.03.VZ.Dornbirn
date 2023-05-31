package hassan.week12.FileSystemExc;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class ExtensionMapReceiver extends FileReceiver {
    private Map<String, Integer> extensionMap;

    public ExtensionMapReceiver() {
        this.extensionMap = new HashMap<>();
    }

    @Override
    public void onFileReceived(int depth, File file) {
        if (file.isFile()) {
            String extension = getExtension(file.getName());
            extensionMap.put(extension, extensionMap.getOrDefault(extension,0) + 1);
        }
    }

    private String getExtension(String fileName) {
        int dotIndex = fileName.lastIndexOf(".");
        if (dotIndex >= 0 && dotIndex < fileName.length() - 1) {
            return fileName.substring(dotIndex + 1);
        }
        return "";
    }
}
