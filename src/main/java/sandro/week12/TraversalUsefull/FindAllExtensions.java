package sandro.week12.TraversalUsefull;

import java.io.File;
import java.util.HashMap;
import java.util.Vector;

public class FindAllExtensions implements IFileReceiver {
    private HashMap<String, Integer> extensions;
    //todo sort the Hashmap Value example
   // private Vector<String, Integer> v;


    public FindAllExtensions() {
        this.extensions = new HashMap<String, Integer>();
    }

    public HashMap<String, Integer> getExtensions() {
        return extensions;
    }

    public void printHashMap() {
        for (String ext : extensions.keySet()) {
            System.out.println(ext + " ==> " + extensions.get(ext) + " " );
        }
    }

    @Override
    public void onFileReceived(int depth, File file) {
        if (file.isFile()) {
            String fileName = file.getName();
            int pos = fileName.lastIndexOf(".");
            String ext = "";
            if (pos >= 0) {
                ext = fileName.substring(pos);
                if (extensions.containsKey(ext)) {
                    extensions.put(ext, extensions.get(ext) + 1);
                } else {
                    extensions.put(ext, 1);
                }
            }
//            System.out.println(ext);
        }
    }
}
