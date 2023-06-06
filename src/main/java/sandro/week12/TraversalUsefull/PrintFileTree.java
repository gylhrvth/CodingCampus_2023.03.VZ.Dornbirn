package sandro.week12.TraversalUsefull;

import java.io.File;

public class PrintFileTree implements IFileReceiver{


    @Override
    public void onFileReceived(int depth, File file) {
        System.out.println("├── ".repeat(depth) + file.getName() +" ("+ file.length()+ ")");
    }
}
