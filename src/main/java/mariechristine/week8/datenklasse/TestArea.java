package mariechristine.week8.datenklasse;

import mariechristine.week2.ExercisesArraysNew;
import mariechristine.week8.camera.CameraExtended;
import mariechristine.week8.camera.MemoryCard;
import mariechristine.week8.camera.ObjectiveLens;

import java.util.Arrays;

public class TestArea {
    public static void main(String[] args) {

        int[] testData = ExercisesArraysNew.arrayCrazyRange(10); // new int[]{4, 2, 7, 15, -2, 8, 2};
        MinMaxAvg result = MinMaxAvg.calculate(testData);

        System.out.println(Arrays.toString(testData));
        System.out.println(result);
        System.out.println("------------------------------------------------------------");
//        System.out.println("Difference between MAX and MIN values: " + (result.getMax() - result.getMin()));
//        System.out.println("------------------------------------------------------------");
//
//        HumanProperties oldMan = new HumanProperties("Peter Brown", 67, 178, 75.5);
//        System.out.println(oldMan);
//        System.out.println("------------------------------------------------------------");
//
//        Camera cam = new Camera(300, 8000, "SE100","Zeiss", 5);
//        cam.setFocusMax(400);
//        System.out.println(cam);
//        for (int i = 0; i < 5; i++) {
//            cam.takePhoto();
//        }
//        System.out.println("------------------------------------------------------------");


        CameraExtended nikon = new CameraExtended("Nikon", "D5700", 80, 400);
        System.out.println(nikon);
        nikon.takePhoto();

        CameraExtended canon = new CameraExtended("Canon", "CY-280", 26, 400);
        System.out.println(canon);
        canon.takePhoto();

        MemoryCard kingston1GB = new MemoryCard("Kingston 1GB", 1000, 995);
        canon.insertMemoryCard(kingston1GB);

        ObjectiveLens leica = new ObjectiveLens("Leica", "DJ750", 300, 8000);
        canon.attachObjectiveLens(leica);
        System.out.println(canon);


        for (int i = 0; i < 5; i++) {
            canon.takePhoto();
        }
        System.out.println(canon);


        System.out.println("------------------------------------------------------------");
        canon.takePhoto();


    }
}
