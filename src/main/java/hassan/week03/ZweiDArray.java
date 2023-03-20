package hassan.week03;

import java.util.Arrays;
import java.util.Random;
public class ZweiDArray {
    static Random rand = new Random();
    public static void main(String[] args) {
       int arrayspace = rand.nextInt();
       int[] [] zweid = creatzweiDArray(5,5);

        System.out.println(Arrays.toString(zweid));

    }


    public static int[][] creatzweiDArray(int rows, int cols) {

        int[][] array = new int[5][5];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int randomValue = rand.nextInt(101);
                array[i][j] = randomValue;
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        return array;
    }
}
