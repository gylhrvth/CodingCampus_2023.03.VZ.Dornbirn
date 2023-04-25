package sandro.week08.photo;

import java.util.Random;

public class TestFunktionPhotoCam {
   static Random rand = new Random();
    public static void main(String[] args) {

        MemoryCard card1 = new MemoryCard("Kingston 1GB", 1000, 100);
        MemoryCard card2 = new MemoryCard("Kingston 512MB", 512, 400);

        Objective obj1 = new Objective("Premium", 135);
        Objective obj2 = new Objective("Standart", 35);

        PhotoCam2 nicon2 = new PhotoCam2("nikon","Coolpix P1000",48,0.3);
        System.out.println("...insert card 2");
        nicon2.insertMemoryCard(card2);
        System.out.println("...insert card 1");
        nicon2.insertMemoryCard(card1);
        System.out.println(nicon2);
        nicon2.takePhoto();
        System.out.println("....mounting Objective");
        nicon2.mountObjective(obj1);
        nicon2.takePhoto();
        System.out.println(nicon2);
        System.out.println("...change Objective");
        nicon2.dismountObjective();
        nicon2.takePhoto();
        System.out.println("...mounting new Objective");
        nicon2.mountObjective(obj2);
        nicon2.takePhoto();
        System.out.println(nicon2);




        PhotoCam2 sony = new PhotoCam2("Sony", "Alpha 7 II", 24, 0.3);
        sony.insertMemoryCard(card2);







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
