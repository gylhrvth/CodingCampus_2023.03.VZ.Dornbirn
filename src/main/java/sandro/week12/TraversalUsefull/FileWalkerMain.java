package sandro.week12.TraversalUsefull;

import java.io.File;
import java.io.FileNotFoundException;

public class FileWalkerMain {
    public static void main(String[] args) {
        FileWalker fw = new FileWalker();
        fw.addFileReceiver(new PrintFileTree());
        CountByExtension cbeJava = new CountByExtension(".java");
        fw.addFileReceiver(cbeJava);

        CountByExtension cbeHtml = new CountByExtension(".html");
        fw.addFileReceiver(cbeHtml);

        CountByExtension cbeClass = new CountByExtension(".class");
        fw.addFileReceiver(cbeClass);

        SumOfFileSize sofs = new SumOfFileSize();
        fw.addFileReceiver(sofs);

        FindAllExtensions fae = new FindAllExtensions();
        fw.addFileReceiver(fae);

        DirectorySize ds = new DirectorySize();
        fw.addFileReceiver(ds);

        ListOfDirAndSize lodas = new ListOfDirAndSize();
        fw.addFileReceiver(lodas);

        try {
            fw.start(new File("C:"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("--------------------------------");
        System.out.println("Count .java files: " + cbeJava.getCount());
        cbeJava.resetCount();
        System.out.println("Reset count to: " + cbeJava.getCount());
        System.out.println("--------------------------------");
        System.out.println("Count .html files: " + cbeHtml.getCount());
        cbeHtml.resetCount();
        System.out.println("Reset count to: " + cbeHtml.getCount());
        System.out.println("--------------------------------");
        System.out.println("Count .class files: " + cbeClass.getCount());
        cbeClass.resetCount();
        System.out.println("Reset count to: " + cbeClass.getCount());
        System.out.println("--------------------------------");
        System.out.println("Sum of all Filesize: " + sofs.getSum());
        sofs.resetSum();
        System.out.println("Reset sum to: " + sofs.getSum());
        System.out.println("--------------------------------");
        System.out.println("HashMap with all Extensions");
        System.out.println(fae.getExtensions());
        System.out.println("-....-");
        // fae.printHashMap();
        // System.out.println("HashMap with Directorys and Size");
        // System.out.println(ds.getDir());
        // System.out.println("-....-");
        // System.out.println(lodas.getDirectorys());
        // lodas.printList();
    }
}
