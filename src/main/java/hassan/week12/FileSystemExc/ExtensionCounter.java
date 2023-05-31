package hassan.week12.FileSystemExc;

import lukas.week03.day4.Colors;

import java.io.File;

public class ExtensionCounter extends FileReceiver {
    private String targetExtension;
    private int count;

    public ExtensionCounter(String targetExtension) {
        this.targetExtension = targetExtension;
        this.count = 0;
    }

    @Override
    public void onFileReceived(int depth, File file) {
        if (file.isFile()) {
            if (targetExtension == null || file.getName().endsWith(targetExtension)) {
                count++;
            }
        }
    }

    public void printResults() {
        System.out.println("            == 2 ==                   ");
        System.out.println(Colors.COLORS[2] + "  Ergebnisse der Dateiendungszählung    " + Colors.RESET);
        if (targetExtension != null) {
            System.out.println("    Dateien mit der Erweiterung '" + targetExtension + "': " + count);
        } else {
            System.out.println("Gesamtanzahl der Dateien: " + count);
        }
        System.out.println();
    }
}
