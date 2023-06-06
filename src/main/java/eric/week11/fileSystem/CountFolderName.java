package eric.week11.fileSystem;

import lukas.week03.day4.Colors;

import java.io.File;
import java.util.HashMap;

public class CountFolderName extends FileReceiver {
    private HashMap<String, Integer> extMap;

    public CountFolderName() {
        this.extMap = new HashMap<>();
    }

    @Override
    public void onFileReceiver(int depth, File file) {
        if (file.isFile()){
            String extension = getExtension(file.getName());
            extMap.put(extension, extMap.getOrDefault(extension, 0) + 1);
        }
    }


    private String getExtension(String fileName){
        int dotIndex = fileName.lastIndexOf(".");
        if (dotIndex >= 0){
            return fileName.substring(dotIndex + 1);
        }
        return "";
    }

    public void printFileExtensions() {
        System.out.println(Colors.COLORS[3] + "---===Count all File extensions===---" + Colors.RESET);
        for (String extension : extMap.keySet()) {
            int count = extMap.get(extension);
            System.out.println(extension + ": " + count);
        }
    }
}
