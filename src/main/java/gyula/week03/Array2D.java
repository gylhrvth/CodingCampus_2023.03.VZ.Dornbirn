package gyula.week03;

import java.util.Arrays;

public class Array2D {
    public static void main(String[] args) {
        int[][] values = createValues100(7);
        print2DArray(values);

        int[][] matrix = new int[20][7];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = 17;
            }
        }
        print2DArray(matrix);

        int[][][][][] aaah = new int[6][5][4][3][2];
    }

    public static int[][] createValues100(int size){
        int[][] values = new int[size][];
        for (int i = 0; i < values.length; i++) {
            values[i] = new int[1 + i];
            for (int j = 0; j < values[i].length; j++) {
                values[i][j] = 100;
            }
        }
        return values;
    }

    public static void print2DArray(int[][] values){
        for (int i = 0; i < values.length; i++) {
            System.out.println(Arrays.toString(values[i]));
        }
    }
}
