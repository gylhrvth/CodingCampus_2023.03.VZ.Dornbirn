package hassan.week12.FileSystemExc;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.FileSystemNotFoundException;

public class FileSystem {
    private FileReceiver fileReceiver;

    public FileSystem() {
        this.fileReceiver = fileReceiver;
    }

    public void navigateFileSystem(String path) {

        SizeReceiver fileSizeReceiver = new SizeReceiver();
        navigateDirectory(new File(path), fileSizeReceiver, 0);
        fileSizeReceiver.printResults();

        ExtensionCounter extensionCounter = new ExtensionCounter(".java");
        navigateDirectory(new File(path), extensionCounter, 0);
        extensionCounter.printResults();

        FolderSizeReceiver folderSizeReceiver = new FolderSizeReceiver();
        navigateDirectory(new File(path), folderSizeReceiver, 0);
        folderSizeReceiver.printResults();


    }



    private void navigateDirectory(File directory, FileReceiver receiver, int depth) {
        receiver.onFileReceived(depth, directory);

        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    navigateDirectory(file, receiver, depth + 1);
                } else {
                    receiver.onFileReceived(depth + 1, file);
                }
            }
        }


    }
}


//    public void navigateFileSystem(String path) {
//        navigateFileSystem(new File(path), 0);
//    }


//    private void navigateFileSystem(File file, int indentationLevel) {
//        try {
//            if (!file.exists()) {
//                throw new FileNotFoundException("Path not found");
//            }
//
//            fileReceiver.onFileReceived(indentationLevel, file);
//            printIndentation(indentationLevel);
//            System.out.println("|-- " + file.getName());
//
//            if (file.isDirectory()) {
//                File[] children = file.listFiles();
//                if (children != null) {
//                    for (File child : children) {
//                        navigateFileSystem(child, indentationLevel + 1);
//                    }
//                }
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//    }
//
//
//    private void printIndentation(int indentationLevel) {
//        for (int i = 0; i < indentationLevel; i++) {
//            System.out.print("│   ");
//        }
//    }


