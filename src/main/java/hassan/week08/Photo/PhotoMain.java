package hassan.week08.Photo;

import java.util.Scanner;

public class PhotoMain {
    public static void main(String[] args) {
//        PhotoAbarrat fotoapparat1 = new PhotoAbarrat(18,55,"EOS 700D","Canon",18);
//        PhotoAbarrat fotoapparat2 = new PhotoAbarrat(24, 120, "D750", "Nikon", 24);
//        PhotoAbarrat fotoapparat3 = new PhotoAbarrat(35, 135, "FE 55mm F1.8", "Sony", 24);
//
//        fotoapparat1.takePhoto();
//        System.out.println(fotoapparat1.toString());
//
//
//        fotoapparat2.takePhoto();
//        System.out.println(fotoapparat2.toString());
//
//
//        fotoapparat3.takePhoto();
//        System.out.println(fotoapparat3.toString());
//
//
//
//
//
//        System.out.println("------------------------------------------");
//        PhotoErweiterung erweiterung1 = new PhotoErweiterung("Sony","S2",20,0.3);
//        erweiterung1.setMemory(500);
//        erweiterung1.setObjektive("Premium Zoom");
//        erweiterung1.takePhoto();
//        System.out.println(erweiterung1);
//
//        Objektiv lensSony = new Objektiv("Sony 50mm 2.4", 50);
//        erweiterung1.setLens(lensSony);
//
//        System.out.println(erweiterung1);
//
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Wie viele Bilder haben sie bereits geschossen? : ");
//        int anzahl = scanner.nextInt();
//        PhotoErweiterung kamera = new PhotoErweiterung("Sony", "S5",16,0.3);
//        kamera.takePhoto();
//        System.out.println(kamera);
//        kamera.setAnzahlBilder(anzahl);
//        int verfuegbarerSpeicher = kamera.getVerfuegbarerSpeicherplatz();
//        System.out.println("Verfübarer Speicherplatz " + verfuegbarerSpeicher + " MB");
//
        MemoryCard card1 = new MemoryCard("KING 1GB",1000,100);
        MemoryCard card2 = new MemoryCard("KING 500MB",500,450);

        Objektiv lens1 = new Objektiv("Zoom", 135);
        Objektiv lens2 = new Objektiv("Standart",35);

        PhotoErweiterung sony = new PhotoErweiterung("Sony","S500",48,0.3);

        System.out.println("card1 reintun");
        sony.insertMemoryCard(card1);

        System.out.println();

        System.out.println("card 2 ?");
        sony.insertMemoryCard(card2);

        System.out.println();


        sony.mountObjective(lens2);
        sony.takePhoto();
        System.out.println(sony);





    }
}
