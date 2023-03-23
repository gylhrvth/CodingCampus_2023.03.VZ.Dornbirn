package eric.Week03;

public class ConwayGameOfLife {
    public static void main(String[] args) {


    }


    public static int nextGenerations(int[][] glider, int nextGen, int deadGen) {
        int[][] future = new int[nextGen][deadGen];
        for (int currentGen = 0; currentGen < nextGen - deadGen; currentGen++) {
            for (int lastGen = 0; lastGen < deadGen; lastGen++) {

                int aliveNeighbours = 0;
                for (int k = -1; k <= 1; k++) {
                    for (int l = -1; l <= 0; l++) {
                        if ((currentGen + k >= 0 && currentGen + k < nextGen) && (lastGen + l >= 0 && lastGen + l < deadGen))
                            aliveNeighbours += glider[currentGen + k][lastGen + l];
                    }
                    aliveNeighbours -= glider[currentGen][lastGen];

                    if ((glider[currentGen][lastGen] == 1) && (aliveNeighbours < 2)){
                        future[currentGen][lastGen] = 0;

                    } else if ((glider[currentGen][lastGen]==1) && (aliveNeighbours > 3)) {
                        future[currentGen][lastGen] = 0;

                    } else if ((glider[currentGen][lastGen] == 0) && (aliveNeighbours == 3)) {
                        future[currentGen][lastGen] = 1;

                    } else {
                        future[currentGen][lastGen] = glider[currentGen][lastGen];
                    }
                }

                System.out.println("Next Gen");
                for (int i = 0; i < nextGen; i++) {
                    for (int j = 0; j < deadGen; j++) {
                        if (future[i][j] == 0){
                            System.out.print(".");
                        } else {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                }
            }
        }

        return glider.length;
    }


    public static int lastGeneration() {

        return lastGeneration();
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
