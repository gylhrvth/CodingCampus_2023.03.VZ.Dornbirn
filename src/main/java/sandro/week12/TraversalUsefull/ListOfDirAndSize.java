package sandro.week12.TraversalUsefull;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ListOfDirAndSize implements IFileReceiver {

    private List<File> directorys;


    public ListOfDirAndSize() {
        this.directorys = new ArrayList<>();
    }

    public List<File> getDirectorys() {
        return directorys;
    }

    public void printList() {
        for (File file: directorys) {
            System.out.println(file.getName() +" -- "+file.length());
        }
    }

    @Override
    public void onFileReceived(int depth, File file) {
        if (file.isDirectory()) {
            File[] content = file.listFiles();


            if (file.isDirectory()) {
                directorys.add(file);

            }
        }

    }
}
