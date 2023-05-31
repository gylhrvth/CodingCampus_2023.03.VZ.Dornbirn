package gyula.week12;

import java.io.File;
import java.util.Stack;

public class FileReceiver implements IFileProcessor{

    public FileReceiver(){

    }

    @Override
    public void onFileReceived(int depth, File file) {
        System.out.printf("%s%s%10d\n", "   ".repeat(depth), file.getName(), file.length());
    }
}
