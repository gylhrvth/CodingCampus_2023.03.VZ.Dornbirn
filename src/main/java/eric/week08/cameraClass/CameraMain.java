package eric.week08.cameraClass;

import lukas.week03.day4.Colors;

public class CameraMain {
    public static void main(String[] args) {
        Camera myCamera = new Camera("MyMadeUpBrand","MyMadeUpModel 866-HD");
        MemoryCard myMemory = new MemoryCard("SSD-Manufactorer GmbH", 1000, 20, 10);
        Lens myLens = new Lens(12, 55);

        //use class lens and memory with camera
        myCamera.setLens(myLens);
        myCamera.setMc(myMemory);

//        for (int i = 0; i < 15; i++) {
//            myCamera.takePhoto();
//        }

        //set new Focal length
        myLens.setFocalLengthSet(24);
        System.out.println(myCamera);

        System.out.println(Colors.COLORS[3] + "---" + Colors.RESET);

        //remove lens
        myCamera.removeLens();
        System.out.println(myCamera);

        System.out.println(Colors.COLORS[3] + "---" + Colors.RESET);

        //add lens and remove memory
        myCamera.putLensOn(myLens);
        myCamera.removeMemoryCard();
        System.out.println(myCamera);

        System.out.println(Colors.COLORS[3] + "---" + Colors.RESET);

        //try take a picture
        myCamera.takePhoto();
        System.out.println(myCamera);

        System.out.println(Colors.COLORS[3] + "---" + Colors.RESET);

        //insert Memory card
        myCamera.insertMemoryCard(myMemory);
        myCamera.takePhoto();
        myMemory.showFreeMemory();
        System.out.println(myCamera);
        System.out.println(myMemory);

        //clear memory and ask for storage available
        myMemory.clearMemory();
        myMemory.showFreeMemory();
        System.out.println(myMemory);


        System.out.println(Colors.COLORS[3] + "---" + Colors.RESET);

        //take pictures
        for (int i = 0; i < 15; i++) {
            myCamera.takePhoto();
        }
        System.out.println(myCamera);


    }
}
