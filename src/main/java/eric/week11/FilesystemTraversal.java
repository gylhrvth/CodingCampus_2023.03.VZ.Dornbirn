package eric.week11;

import java.io.File;
import java.io.FileNotFoundException;

public class FilesystemTraversal {
    public static void main(String[] args) {
        String path = "src/main/java/eric";

        try {
            navigateFileSystem(path, 0);
        } catch (FileNotFoundException e){
            System.out.println("Path could not be found!" + e.getMessage());
        }

    }

    public static void navigateFileSystem(String path, int indentationLevel) throws FileNotFoundException{
        File dir =  new File(path);

        printIndentedPath(indentationLevel);
        System.out.println("├──" + dir.getName());

        if (dir.isDirectory()){
            File[] files = dir.listFiles();
            if (files != null){
                for (File file : files) {
                    navigateFileSystem(file.getAbsolutePath(), indentationLevel + 1);
                }
            }
        }
    }

    public static void printIndentedPath(int indentationLevel){
        for (int i = 0; i < indentationLevel; i++) {
            System.out.print("|  ");
        }
    }
}
