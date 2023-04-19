package hassan.week07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Streams {
    public static void main(String[] args) {




        //PrintStreamWithFile
        //Pfad
        File f = new File("/Users/zein/IdeaProjects/CodingCampus_2023.03.VZ.Dornbirn/src/main/java/hassan/week07/Message");


        try {
            //Schreiber                                     //True = er überschreibt das Orginale Nichtttt!!!
                                                            //False = er überschreibt das Orginale.
            FileOutputStream fos = new FileOutputStream(f, false);

            //Printer
            PrintStream ps = new PrintStream(fos);

            //Input für unser textdatei
            ps.println("Hello World!");
            ps.println("Hallo");

            //Printer schließen
            ps.close();

            //Bestätigung
            System.out.println("File schreiben war erfolgreich");

            //Fehler exception falls datei nicht erreichbar ist bzw datei nicht exestiert
        } catch (FileNotFoundException fnfe) {

            //nachricht das es nicht funktioniert hat
            System.out.println(f.getAbsolutePath() + " ist nicht erreichbar.");
        }




    }


}
