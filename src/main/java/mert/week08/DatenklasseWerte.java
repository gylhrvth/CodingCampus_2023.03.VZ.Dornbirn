package mert.week08;

import java.util.Arrays;
import java.util.Random;

public class DatenklasseWerte {

    static Random rand = new Random();

    public static void main(String[] args) {
        int[] array = mert.Week02.ArrayRandom.crazyRange(10);
        Datenklasse result = Datenklasse.calculateMinMaxAvg(array);

        System.out.println(Arrays.toString(array));
        System.out.println(result);

    }

}
