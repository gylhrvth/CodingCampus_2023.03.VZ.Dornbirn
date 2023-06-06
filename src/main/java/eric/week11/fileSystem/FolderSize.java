package eric.week11.fileSystem;

import java.io.File;
import java.util.Stack;

public class FolderSize extends FileReceiver{

    @Override
    public void onFileReceiver(int depth, File file) {
        Stack<File> stack = new Stack<>();
        stack.push(file);

        while (!stack.isEmpty()){
            File currentFile = stack.pop();
            if (currentFile.isFile()){
                depth += currentFile.length();
            } else if (currentFile.isDirectory()) {
                File[] files = currentFile.listFiles();
                if (files != null){
                    for (File f : files){
                        stack.push(f);
                    }
                }
            }
        }
    }
}
