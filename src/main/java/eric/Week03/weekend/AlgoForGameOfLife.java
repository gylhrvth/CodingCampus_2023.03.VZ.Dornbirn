package eric.Week03.weekend;

public class AlgoForGameOfLife {
    public static void main(String[] args) {
    }

    public static int fieldValue(int[][] field, int row, int col) {
        if (row < 0) {
            row = field.length - 1;
        } else if (row >= field.length) {
            row = 0;
        }


        if (col < 0) {
            col = field[0].length - 1;
        } else if (col >= field[0].length) {
            col = 0;
        }
        return field[row][col];
    }

    public static int rule34(int[][] field, int row, int col) {
        int currentField = field[row][col];
        int neighboursAlive = 0;
        int checkField = 0;

        neighboursAlive += fieldValue(field, row, col - 1);
        neighboursAlive += fieldValue(field, row - 1, col);
        neighboursAlive += fieldValue(field, row, col + 1);
        neighboursAlive += fieldValue(field, row + 1, col);
        neighboursAlive += fieldValue(field, row - 1, col - 1);
        neighboursAlive += fieldValue(field, row + 1, col - 1);
        neighboursAlive += fieldValue(field, row - 1, col + 1);
        neighboursAlive += fieldValue(field, row + 1, col + 1);


        if (currentField == 0) {
            if (neighboursAlive == 3) {

                System.out.println("Eine Tote Zelle mit 3 Nachbarn wird in der Nächsten Generation wiederbelebt.");
            }
        } else {
            if (neighboursAlive == 2 || neighboursAlive == 4) {

                System.out.println("Eine Zelle mit 2 oder 3 Nachbarn lebt weiter");
            } else if (neighboursAlive == 5) {
                System.out.println("Eine Zelle mit 5 Nachbarn lebt die nächste Generation.");
            } else {

                System.out.println("Eine Zelle mit weniger als 2 Nachbarn stirbt in der nächste Gen.");
            }
        }

//        System.out.println("Zelle " + checkField + ", Lebendige Nachbarn: " + neighboursAlive + " -> " + checkField);
        return checkField;
    }
    public static void insertionSort(int[] arr){
        for (int i = 2; i < arr.length; i++) {
            int j = i;
            while(j > 0 && arr[j - 1] > arr[j]){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j = j - 1;
            }
        }
    }
}
