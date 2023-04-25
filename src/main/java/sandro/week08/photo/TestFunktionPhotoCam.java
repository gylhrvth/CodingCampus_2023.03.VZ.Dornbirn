package sandro.week08.photo;

import java.util.Random;

public class TestFunktionPhotoCam {
   static Random rand = new Random();
    public static void main(String[] args) {

        MemoryCard card1 = new MemoryCard("Kingston 1GB", 1000, 100);
        MemoryCard card2 = new MemoryCard("Kingston 512MB", 512, 500);

        PhotoCamErweiterung nicon2 = new PhotoCamErweiterung("nikon","Coolpix P1000",48,0.3);
        nicon2.insertMemoryCard(card2);
        nicon2.insertMemoryCard(card1);
        nicon2.setObjektive(50);
        nicon2.setPicsCounter(rand.nextInt(1,150));
        System.out.println(nicon2);
        System.out.println();

        nicon2.takePhoto();
        System.out.println(nicon2);






//        System.out.println();
//        System.out.println();
//        PhotoCam sonytest = new PhotoCam("Sony", "Alpha 7 II", 24, 10);
//        sonytest.setBrennweite(10);
//        System.out.println(sonytest);
//        System.out.println("--------------------------------------------");
//        PhotoCam sony = new PhotoCam("Sony", "Alpha 7 II", 24, 10);
//        sony.setBrennweite(75);
//        System.out.println(sony);
//        System.out.println("--------------------------------------------");
//        PhotoCam clony = new PhotoCam("Clony","Beta rip",10,20);
//        clony.setBrennweite(50);
//        System.out.println(clony);
//        System.out.println("--------------------------------------------");



    }
}
