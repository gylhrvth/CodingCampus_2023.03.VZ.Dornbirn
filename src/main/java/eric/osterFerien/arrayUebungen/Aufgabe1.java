package eric.osterFerien.arrayUebungen;

public class Aufgabe1 {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 23, 5, 12, 4, 4, 2, 5, 2, 10};

        int[] arr2 = new int[]{123, 19471, 1, 4, 15715, 15, 1, 5, 15, 1, -10, -100};

        int[] arr3 = new int[]{478199, 7812973, 12387123, 12, 3, 123, 12, 3, 1, 3, 1, 3, 1, 8, 9, 15, 1, 5, 1, 5, 1, 5, 15, 1, 5, 0};

        String result1 = arrFirstAndLastNum(arr);
        String result2 = arrFirstAndLastNum(arr2);
        String result3 = arrFirstAndLastNum(arr3);

        System.out.println("Ergebnis für Array 1 [" + result1 + "]");
        System.out.println("Ergebnis für Array 2 [" + result2 + "]");
        System.out.println("Ergebnis für Array 3 [" + result3 + "]");

    }

    public static String arrFirstAndLastNum(int[] arr){
        if (arr == null || arr.length == 0){
            return " ";
        }
        int firstNumber = arr[0];
        int lastNumber = arr[arr.length-1];

        return firstNumber + " " +lastNumber;
    }
}
