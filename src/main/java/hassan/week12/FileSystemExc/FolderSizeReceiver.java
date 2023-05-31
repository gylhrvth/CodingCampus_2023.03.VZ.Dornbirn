package hassan.week12.FileSystemExc;

import lukas.week03.day4.Colors;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Stack;

public class FolderSizeReceiver extends FileReceiver {
    private Stack<Long> sizeStack;
    private int indentationLevel;

    public FolderSizeReceiver() {
        this.sizeStack = new Stack<>();
        indentationLevel = 0;
    }

    @Override
    public void onFileReceived(int depth, File file) {
        if (file.isDirectory()) {
            while (sizeStack.size() <= depth) {
                sizeStack.add(0L);
            }

            indentationLevel = depth;
            long folderSize = calculateFolderSize(file);
            sizeStack.set(indentationLevel, sizeStack.get(indentationLevel) + folderSize);
        }
    }

    private long calculateFolderSize(File directory) {
        long size = 0;

        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    size += file.length();
                } else if (file.isDirectory()) {
                    size += calculateFolderSize(file);
                }
            }
        }
        return size;
    }

    private void printFolderSize(File directory) {
        System.out.println("        Größe: " + sizeStack.get(indentationLevel) + " Bytes");

        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    indentationLevel++;
                    printFolderSize(file);
                    indentationLevel--;
                }
            }
        }
    }

    public void printResults() {
        System.out.println("            == 3 ==             ");
        System.out.println(Colors.COLORS[3] +"    Ergebnisse der Ordnergröße    " + Colors.RESET);
        printFolderSize(new File("/path"));
        System.out.println();
    }
}


