package joachim.week11.folder;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Objects;

public class FileSystemMain {
    public static void main(String[] args) {

        File path = new File("src/main/java/joachim2");

        try {
            fileSystem(path, 0);
        } catch (FileNotFoundException fnfe){
            System.out.println("Bla bla");
        }
    }

    public static void fileSystem(File path, int count) throws FileNotFoundException {
        if (!path.exists()){
            throw new FileNotFoundException(path.getAbsolutePath());
        }

        try {
            System.out.println("|  ".repeat(count) + "└── " + path.getName());
            if (path.isDirectory()) {
                for (File file : Objects.requireNonNull(path.listFiles())) {
                    fileSystem(file, count + 1);
                }
            }
        }catch (FileNotFoundException fnfe){
            System.out.println("there is no File like this");
        }
    }
}