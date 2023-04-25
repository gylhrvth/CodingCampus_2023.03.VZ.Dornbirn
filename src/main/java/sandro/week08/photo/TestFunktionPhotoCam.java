package sandro.week08.photo;

import sandro.week08.digitalCamera.DigiCam;

import java.util.Random;

public class TestFunktionPhotoCam {
   static Random rand = new Random();
    public static void main(String[] args) {




        MemoryCard card1 = new MemoryCard("Kingston 1GB", 1000,100, 990);
        MemoryCard card2 = new MemoryCard("Kingston 512MB", 512, 20, 250);

        Objective obj1 = new Objective("Premium", 135);
        Objective obj2 = new Objective("Standart", 35);

        PhotoCam2 nicon2 = new PhotoCam2("nikon","Coolpix P1000",48,30);




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
        nicon2.removeMemoryCard();

        System.out.println("---------------------------------------------------------------------------");
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("---------------------------------------------------------------------------");



        PhotoCam2 sony = new PhotoCam2("Sony", "Alpha 7 II", 24, 30);
        sony.insertMemoryCard(card1);
        sony.removeMemoryCard();
        sony.insertMemoryCard(card2);
        sony.mountObjective(obj2);
        System.out.println(sony);
        for (int i = 0; i < 20; i++) {
            sony.takePhoto();
        }
        System.out.println(sony);
        sony.removeMemoryCard();
        sony.insertMemoryCard(card1);
        sony.deleteMem();
        for (int i = 0; i < 120; i++) {
            sony.takePhoto();
        }
        System.out.println(sony);
        sony.deleteMem();
        System.out.println(sony);



//
//        int testVarialbe = 30;
//        System.out.printf("TestVariable: %.2f\n", testVarialbe*0.01);



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
