package hassan.week12.FileSystemExc;

import lukas.week03.day4.Colors;

import java.io.File;

public class SizeReceiver extends FileReceiver{
    private int totalsize;

    @Override
    public void onFileReceived(int depth, File file) {
        if (file.isFile()){
            totalsize += file.length();
        }

    }
    public void printResults() {
        System.out.println("            == 1 ==              ");
        System.out.println(Colors.COLORS[1] +"    Ergebnisse der Dateigröße    " + Colors.RESET);
        System.out.println("    Gesamtgröße: " + totalsize + " Bytes");
        System.out.println();
    }

}
