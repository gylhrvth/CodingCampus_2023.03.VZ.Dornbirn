package eric.week11.fileSystem;

import lukas.week03.day4.Colors;

import java.io.File;

public class CountFileEndName extends FileReceiver {
    private String target;
    private int count;

    public CountFileEndName(String target) {
        this.target = target;
        this.count = 0;
    }

    @Override
    public void onFileReceiver(int depth, File file) {
        if (file.isFile() && file.getName().endsWith(target)) {
            count++;
        }
    }

    public int getCount() {
        return count;
    }

    public void printCountFileEndName(){
        System.out.println(Colors.COLORS[2] + "---===Count End File Name===---" + Colors.RESET);
        System.out.println("The amount of Files that end with: ." + target + " is: " + count);
    }
}
