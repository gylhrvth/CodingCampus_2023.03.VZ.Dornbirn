package mariechristine.week3;

import java.util.Arrays;
import java.util.Random;

public class BonusaufgabenArrays {
    static Random random = new Random();

    public static void main(String[] args) {
        int[][] array = new int[2][2];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(100);
            }
        }
        System.out.println("Arrays: " + Arrays.deepToString(array));
    }


}
