package ayguen.week08.photocam;

import java.util.Arrays;

public class TestMainPhotoCamera {

    public static void main(String[] args) {
        TestPhotoCamera nikon = new TestPhotoCamera("Nikon", "D7500", 50);
        TestMemoryCard kingston = new TestMemoryCard("Kingston", 250, 0);


        System.out.println(nikon);
        System.out.println("--");
        System.out.println(kingston);
        System.out.println("--");
        nikon.insertMemoryCard(kingston);

        boolean takePic = true;
        while (takePic) {
            takePic = nikon.takePhoto();
        }
        System.out.println(nikon);


        TestPhotoCamera[] allCameras = new TestPhotoCamera[]{
                new TestPhotoCamera("Nikon", "D100", 10),
                new TestPhotoCamera("Canon", "B50", 10),
                new TestPhotoCamera("Nikon", "Z605", 10),
                new TestPhotoCamera("Samsung", "D123", 10),
                new TestPhotoCamera("Sony", "DDDD", 10),
                new TestPhotoCamera("Nikon", "Balada", 10),
                new TestPhotoCamera("Nikon", "Zeppelin", 10),
                new TestPhotoCamera("Nikon", "Aleen", 10),
                new TestPhotoCamera("Nikon", "Antonius", 10),
                new TestPhotoCamera("Nikon", "D999", 10)
        };
        sort(allCameras);
        System.out.println(Arrays.toString(allCameras));
    }

    public static void sort(TestPhotoCamera[] cameras) {
        for (int i = 0; i < cameras.length; i++) {
            for (int j = 0; j < cameras.length - i - 1; j++) {
                String markeJ = cameras[j].getMarke();
                String markeJplusOne = cameras[j + 1].getMarke();
                if (markeJ.compareTo(markeJplusOne) > 0){
                    TestPhotoCamera temp = cameras[j];
                    cameras[j] = cameras[j + 1];
                    cameras[j + 1] = temp;
                }
            }
        }

    }
}