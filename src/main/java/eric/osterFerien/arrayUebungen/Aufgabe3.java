package eric.osterFerien.arrayUebungen;

import java.util.Arrays;

public class Aufgabe3 {
    public static void main(String[] args) {
        int count = 10;
        int[] arr = createArray(count);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] createArray(int count){
        int[] arr = new int[count + 1];
        for (int i = 0; i <= count; i++) {
            arr[i] = i;
        }
        return arr;
    }
}
