package sandro.week08.digitalCamera;

import java.io.File;

public class SortDigiCams {
    public static void main(String[] args) {

        DigiCam Sony = new DigiCam("Sony", "Alpha 7 II", 35, 24, 30);
        DigiCam Sony2 = new DigiCam("Sony", "DSC-WX350", 35, 30, 30);
        DigiCam Sony3 = new DigiCam("Sony", "RX104", 35, 36, 30);
        DigiCam Sony4 = new DigiCam("Sony", "ZV-1F", 35, 24, 30);
        DigiCam Kodak = new DigiCam("Kodak", "Pixpro FZ-45", 35, 16, 10);
        DigiCam Kodak2 = new DigiCam("Kodak", "Pixpro FZ-55", 35, 24, 20);
        DigiCam Kodak3 = new DigiCam("Kodak", "Astro-Zoom", 35, 40, 30);
        DigiCam Canon = new DigiCam("Canon", "Ixus 185", 35, 16, 10);
        DigiCam Canon2 = new DigiCam("Canon", "EOS 2000D", 35, 16, 10);
        DigiCam Canon3 = new DigiCam("Canon", "PowerShot", 35, 16, 10);
        DigiCam Nikon = new DigiCam("Nikon", "Z30 Body", 35, 36, 20);
        DigiCam Nikon2 = new DigiCam("Nikon", "CoolPix P1000", 35, 36, 20);
        DigiCam Nikon3 = new DigiCam("Nikon", "CoolPix S3300", 35, 36, 20);

        DigiCam[] digiCams = new DigiCam[]{Sony, Sony2, Sony3, Sony4, Kodak, Kodak2, Kodak3, Canon, Canon2, Canon3, Nikon, Nikon2, Nikon3};



        sortDigiCamModel(digiCams);
        printDigiCams(digiCams);
        System.out.println("---------------------------");
        sortDigiCamManufactor(digiCams);
        printDigiCams(digiCams);


    }

    public static void printDigiCams(DigiCam[] digiCams) {
        for (DigiCam test : digiCams) {
            System.out.println(test);

        }
    }
public static void sortDigiCamManufactor (DigiCam[] arr){
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr.length - i - 1; j++) {
            if (arr[j].getManufacturer().compareTo(arr[j + 1].getManufacturer()) > 0) {
                DigiCam temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
}
    public static void sortDigiCamModel(DigiCam[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].getModel().compareTo(arr[j + 1].getModel()) > 0) {
                    DigiCam temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
