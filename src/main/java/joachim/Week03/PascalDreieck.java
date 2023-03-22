package joachim.Week03;

public class PascalDreieck {

    public static void main(String[] args) {
        long[][] pascal = pascalDreieck(20);
        printMatrix(pascal);
    }

    public static long[][] pascalDreieck(int size) {
        long[][] array = new long[size][size];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == 0 || j == 0) {
                    array[i][j] = 1;
                } else {
                    array[i][j] = array[i - 1][j] + array[i][j - 1];
                }
            }
        }
        return array;
    }

    public static void printMatrix(long[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf(" %12d", array[i][j]);
            }
            System.out.println();
        }
    }



}
