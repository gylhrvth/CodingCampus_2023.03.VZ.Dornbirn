package sandro.week12.TraversalUsefull;

import java.io.File;
import java.util.HashMap;

public class SumOfFileSize implements IFileReceiver{
    private int sum;

    public SumOfFileSize(){
        this.sum = 0;
    }

    public void resetSum(){
        sum = 0;
    }
    public int getSum() {
        return sum;
    }

    @Override
    public void onFileReceived(int depth, File file) {
        if (file.isFile()) {
            sum += file.length();
        }
    }
}
