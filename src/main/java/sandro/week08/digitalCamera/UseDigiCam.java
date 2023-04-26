package sandro.week08.digitalCamera;

import java.util.Scanner;

public class UseDigiCam {
    public static void main(String[] args) {
//        System.out.println("how many pictures do you have already taken?....\nplease dont write any Bullshit in like Charaters etc.\nThank you very much!");
//        Scanner sc = new Scanner(System.in);
//        int pics = sc.nextInt();
        int pics = 30;
        int usedMB = pics *15;

        MemoryCard card1 = new MemoryCard("Kingston 1GB", 1000,pics, usedMB);
        MemoryCard card2 = new MemoryCard("Kingston 512MB", 512, pics, usedMB);

        Lens lens1 = new Lens("Noob Lens",15,135);
        Lens lens2 = new Lens("Pro Lens", 0,280);

        DigiCam sony = new DigiCam("Sony", "Alpha 7 II",35, 24, 30);
        DigiCam clony = new DigiCam("Clony", "Alfa si 3",35, 14, 10);


        System.out.println(sony);
        sony.removeMemoryCard();
        System.out.println("-----------------");

        System.out.println(sony);
        sony.takePhoto();
        sony.insertMemory(card1);
        System.out.println(sony);
        sony.takePhoto();
        sony.mountLens(lens1);
        System.out.println(sony);
        sony.takePhoto();
        System.out.println(sony);
        for (int i = 0; i < 6; i++) {
            sony.takePhoto();
        }
        System.out.println(sony);
        sony.removeMemoryCard();
        System.out.println(sony);
        sony.insertMemory(card2);
        System.out.println(sony);
        for (int i = 0; i <7; i++) {
            sony.takePhoto();
        }
        System.out.println(sony);
        sony.deleteMem();
        System.out.println(sony);
        sony.dismountLens();
        System.out.println(sony);
        sony.mountLens(lens2);
        System.out.println(sony);
        for (int i = 0; i <5; i++) {
            sony.takePhoto();
        }
        System.out.println(sony);


    }
}
