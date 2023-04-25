package eric.week08.photoClass;

public class DezimalValues {
    public static void main(String[] args) {
        int senzorSize = 2470;
        int fileSize = (int)(senzorSize * 0.3);

        System.out.printf(
                "Take photo with a %.2f MP camera and save %.2f MB Daten",
                senzorSize/100.0,
                fileSize/100.0
        );


        for (int i = 0; i < 10000; i += 10) {
            System.out.printf("%.2f\n", i/100.0);
        }
/*
        for (double i = 0; i < 100; i += 0.1) {
            System.out.println(i);
        }
 */
    }
}
