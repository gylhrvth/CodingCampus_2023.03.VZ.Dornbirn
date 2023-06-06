package eric.week11.fileSystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Vector;

public class FilesystemTraversal {

    private Vector<FileReceiver> frList = new Vector<>();

    public static void main(String[] args) {
        String path = "C:\\Users\\syn7e\\IdeaProjects\\CodingCampus_2023.03.VZ.Dornbirn\\src\\main\\java\\lukas";
        String target = "java";

        FilesystemTraversal ft = new FilesystemTraversal();

        FileSize size = new FileSize();
        CountFileEndName endName = new CountFileEndName(target);
        CountFolderName folderName = new CountFolderName();

        ft.frList.add(size);
        ft.frList.add(endName);
        ft.frList.add(folderName);
        ft.frList.add(new FolderSize());

        try {
            navigateFileSystem(path, 0);
            ft.navigate(path);
        } catch (FileNotFoundException e) {
            System.out.println("Path could not be found!" + e.getMessage());
        }
        size.printFileSize();
        endName.printCountFileEndName();
        folderName.printFileExtensions();
    }

    public void navigate(String path) throws FileNotFoundException {
        File root = new File(path);
        navigateRecursive(root, 0);
    }

    public void navigateRecursive(File file, int depth) {
        for (FileReceiver receiver : frList) {
            receiver.onFileReceiver(depth, file);
        }

        if (file.isDirectory()) {
            File[] files = file.listFiles();
            if (files != null) {
                for (File f : files) {
                    navigateRecursive(f, depth + 1);
                }
            }
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
