package eric.Week03;

public class ConwayGameOfLife {
    public static void main(String[] args) {

    }
    public static int fieldValue(int[][] field, int col, int row) {
        if (row < 0) {
            row = field.length - 1;
        } else if (row >= field[0].length) {
            row = 0;


            if (col < 0) {
                col = field[0].length;
            } else if (col >= field[0].length) {
                col = 0;
            }
        }
        return field[row][col];
    }
    public static int neighboursOfLife(int[][] field, int col, int row) {

        int currentField = field[row][col];

        int livingNeighbours = 0;

        livingNeighbours += field[row][col - 1];
        livingNeighbours += field[row - 1][col];
        livingNeighbours += field[row][col + 1];
        livingNeighbours += field[row + 1][col];
        livingNeighbours += field[row - 1][col - 1];
        livingNeighbours += field[row + 1][col - 1];
        livingNeighbours += field[row - 1][col + 1];
        livingNeighbours += field[row + 1][col + 1];

        return livingNeighbours;
    }

    public static final int[][] GLEITER = {
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 1, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 1, 0, 0, 0, 0, 0, 0},
            {0, 1, 1, 1, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
    };


    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
