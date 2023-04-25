package eric.week08.cameraClass;

public class CameraMain {
    public static void main(String[] args) {
        Camera myCamera = new Camera("MyMadeUpBrand","MyMadeUpModel 866-HD");
        MemoryCard myMemory = new MemoryCard("SSD-Manufactorer GmbH", 1000, 100, 10);
        Lens myLens = new Lens();
        myCamera.setLens(myLens);
        myCamera.setMc(myMemory);

//        for (int i = 0; i < 15; i++) {
//            myCamera.takePhoto();
//        }

        System.out.println(myCamera);
    }
}
