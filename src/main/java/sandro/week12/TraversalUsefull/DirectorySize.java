package sandro.week12.TraversalUsefull;

import java.io.File;
import java.util.HashMap;

public class DirectorySize implements IFileReceiver {
    private HashMap<String, Integer> dir;
    public DirectorySize() {
        this.dir = new HashMap<String, Integer>();
    }
    public HashMap<String, Integer> getExtensions() {
        return dir;
    }

    public void printHashMap() {
        for (String ext : dir.keySet()) {
            System.out.println(ext + " ==> " + dir.get(ext) + " " );
        }
    }
    public HashMap<String, Integer> getDir() {
        return dir;
    }
    @Override
    public void onFileReceived(int depth, File file) {
        if (file.isDirectory()) {
            String fileName = file.getName();
            int size = (int) file.length();

                if (dir.containsKey(fileName)) {
                    dir.put(fileName, dir.get(fileName) + size);
                } else {
                    dir.put(fileName, size);
                }
            }
//            System.out.println(ext);
        }
    }