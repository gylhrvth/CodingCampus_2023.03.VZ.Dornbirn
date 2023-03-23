package benjamin.week03;

public class GameofLife {
    public static void main(String[] args) {

        int[][] currentgen = SEGLER;
        printField(currentgen);

        while (true) {
            currentgen = nextGeneration(currentgen);
            printField(currentgen);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                //noob
            }
            clearScreen();
        }
    }

    public static int[][] nextGeneration(int[][] gen) {
        int[][] nextGen = new int[gen.length][gen.length];
        for (int i = 0; i < gen.length; i++) {
            for (int j = 0; j < gen[i].length; j++) {
                int aliveNeigh = aliveNeighbours(gen, i, j);
                if (gen[i][j] == 1 && (aliveNeigh == 2 || aliveNeigh == 3)) {
                    nextGen[i][j] = 1;
                } else if (gen[i][j] == 0 && aliveNeigh == 3) {
                    nextGen[i][j] = 1;
                }
            }
        }
        return nextGen;
    }

    public static int aliveNeighbours(int[][] gen, int row, int col) {
        int aliveNeigh = 0;
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                int neighrow = row + i;
                int neighcol = col + j;
                if (i == 0 && j == 0) {
                    continue;
                }
                if (neighrow < 0) {
                    neighrow = gen.length - 1;
                } else if (neighrow >= gen.length) {
                    neighrow = 0;
                }
                if (neighcol < 0) {
                    neighcol = gen[0].length - 1;
                } else if (neighcol >= gen[0].length) {
                    neighcol = 0;
                }
                aliveNeigh += gen[neighrow][neighcol];
            }
        }
        return aliveNeigh;
    }


    public static void printField(int[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.printf("%3d ", field[i][j]);
            }
            System.out.println();
        }
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
    public static final int[][] SEGLER = {
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
    };

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}

// cd ~/IdeaProjects/CodingCampus_2023.03.VZ.Dornbirn/build/classes/java/main
//java benjamin.week03.GameofLife
