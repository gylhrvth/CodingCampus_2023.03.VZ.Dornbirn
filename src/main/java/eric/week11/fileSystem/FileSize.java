package eric.week11.fileSystem;

import lukas.week03.day4.Colors;

import java.io.File;

public class FileSize extends FileReceiver {
    private long totalSize;

    @Override
    public void onFileReceiver(int depth, File file) {
        if (file.isFile() && file.exists()){
            totalSize += file.length();
        }
    }

    public void printFileSize(){
        System.out.println(Colors.COLORS[1] + "---===Total Size===---" + Colors.RESET);
        System.out.println("Total size of Files is: " + totalSize + " KB");
    }
}
