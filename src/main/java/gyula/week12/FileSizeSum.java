package gyula.week12;


import java.io.File;
import java.util.Stack;

public class FileSizeSum extends FileReceiver {
    private int lastDepth;
    private Stack<Long> sumFileSizes;

    public FileSizeSum(){
        super();
        lastDepth = -1;
        sumFileSizes = new Stack<>();
    }

    @Override
    public void onFileReceived(int depth, File file) {
        Long size = 0L;
        if (file.isFile()){
            size = file.length();
        }

        if (depth > lastDepth){
            sumFileSizes.push(size);
            lastDepth = depth;
        } else if (depth <= lastDepth){
            if (depth < lastDepth){
                size = sumFileSizes.pop();
                System.out.println("Total: " + size);
                lastDepth = depth;
            }
            Long lastSize = sumFileSizes.pop();
            sumFileSizes.push(lastSize + size);
        }

        System.out.println(file.getName() + " " + sumFileSizes);
    }
}
