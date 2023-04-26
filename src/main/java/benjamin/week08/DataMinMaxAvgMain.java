package benjamin.week08;

import benjamin.week02.ArraysExample;

import java.util.Arrays;
import java.util.Random;

public class DataMinMaxAvgMain {

    static Random rand = new Random();
    public static void main(String[] args) {

        int[] arr = new int[]{1,2,3,4,5,6};
        int[] randArr = ArraysExample.numberRandom(6);
        int[] crazyRandArr = ArraysExample.numberRandomMinus(6);

        DataMinMaxAvg stat = DataMinMaxAvg.calculate(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(stat);

        System.out.println("---------");

        DataMinMaxAvg statRand = DataMinMaxAvg.calculate(randArr);
        System.out.println(Arrays.toString(randArr));
        System.out.println(statRand);

        System.out.println("----------");

        DataMinMaxAvg statCrazy = DataMinMaxAvg.calculate(crazyRandArr);
        System.out.println(Arrays.toString(crazyRandArr));
        System.out.println(statCrazy);

    }


}
