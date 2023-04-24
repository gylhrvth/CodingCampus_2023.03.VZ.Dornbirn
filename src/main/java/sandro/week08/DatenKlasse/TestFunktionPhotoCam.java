package sandro.week08.DatenKlasse;

public class TestFunktionPhotoCam {
    public static void main(String[] args) {

        PhotoCamErweiterung nicon = new PhotoCamErweiterung("nicon","ver.1",20,0.3);
        nicon.setMemory(200000);
        nicon.setObjektive("Premium");
        System.out.println(nicon);



        System.out.println();
        System.out.println();
        PhotoCam sonytest = new PhotoCam("Sony", "Alpha 7 II", 24, 10);
        sonytest.setBrennweite(10);
        System.out.println(sonytest);
        System.out.println("--------------------------------------------");
        PhotoCam sony = new PhotoCam("Sony", "Alpha 7 II", 24, 10);
        sony.setBrennweite(75);
        System.out.println(sony);
        System.out.println("--------------------------------------------");
        PhotoCam clony = new PhotoCam("Clony","Beta rip",10,20);
        clony.setBrennweite(50);
        System.out.println(clony);
        System.out.println("--------------------------------------------");



    }
}
