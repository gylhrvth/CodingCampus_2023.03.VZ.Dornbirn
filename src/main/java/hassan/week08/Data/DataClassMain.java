package hassan.week08.Data;


import java.util.Arrays;

public class DataClassMain {

    public static void main(String[] args) {
        int[] getNum = new int[]{1, 3, 123, 346, 3, 7, 6, 0, 8, 5, 66, 242, 88, 87, 6, 43, 2,};

        System.out.println(Arrays.toString(getNum));
        DataClassResult getResult = DataClassResult.calculateMinMaxAvg(getNum); // new DataClassResult(getNum);
        System.out.println(getResult);


    }

}
