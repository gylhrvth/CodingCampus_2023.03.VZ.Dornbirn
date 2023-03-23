package sandro.week03;

import lukas.week03.day4.Colors;

public class ConwaysGameOfLife {
    public static void main(String[] args) {

//        System.out.println(Colors.COLORS[0]+"Hallo"+Colors.RESET+Colors.COLORS[1]+"Sandro"+Colors.RESET+Colors.BACKGROUND_COLORS[0]+" normaler text"+Colors.RESET+" wirklich normal");
//
//        if(Math.random() > 0) {
//            return;
//        }

        int[][] currentgen = SEGLER;
        System.out.println(".....");

        while (true) {
            int[][] newGen = new int[currentgen.length][currentgen[0].length];

            for (int row = 0; row < currentgen.length; row++) {
                for (int col = 0; col < currentgen[row].length; col++) {
                    int aliveNeighbours = countAliveNeighbours(currentgen, row, col);

                    int currentCell = currentgen[row][col];

                    if (currentCell == 0) {
                        if (aliveNeighbours == 3) {
                            newGen[row][col] = 1;
                        }
                    } else {
                        if (aliveNeighbours < 2) {
                            newGen[row][col] = 0;
                        } else if (aliveNeighbours == 2 || aliveNeighbours == 3) {
                            newGen[row][col] = 1;
                        }
                        if (aliveNeighbours > 3) {
                            newGen[row][col] = 0;
                        }
                    }
                }
            }
            currentgen = newGen;

            printField(currentgen);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                //noop
            }
            clearScreen();
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

//    public static int[][] makeacopy(int[][] arrayToCopy) {
//        int[][] result = new int[arrayToCopy.length][arrayToCopy.length];
//        for (int i = 0; i < result.length; i++) {
//            for (int j = 0; j < result[i].length; j++) {
//                result[i][j] = arrayToCopy[i][j];
//            }
//
//        }
//        return result;
//    }

    private static int countAliveNeighbours(int[][] field, int row, int col) {
        int aliveNeighbours = 0;
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                if (i == 0 && j == 0) {
                    continue;
                }
                int neighbourRow = row + i;
                int neighbourCol = col + j;

                if (neighbourRow < 0) {
                    neighbourRow = field.length - 1;
                } else if (neighbourRow >= field.length) {
                    neighbourRow = 0;
                }
                if (neighbourCol < 0) {
                    neighbourCol = field[0].length - 1;
                } else if (neighbourCol >= field[0].length) {
                    neighbourCol = 0;
                }

                aliveNeighbours += field[neighbourRow][neighbourCol];
            }
        }
        return aliveNeighbours;
    }

    public static void printField(int[][] arr) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                int field = arr[row][col];
                if (field == 0) {
                    System.out.print(Colors.COLORS[1] + field + " " + Colors.RESET);
                } else {
                    System.out.print(Colors.COLORS[2] + field + " " + Colors.RESET);
                }
            }
            System.out.println();
        }
    }


    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
//        1  cd ~/IdeaProjects/CodingCampus_2023.03.VZ.Dornbirn/build/classes/java/main
//    2  java benjamin.week03.GameofLife
//    3  java benjamin.week03.GameofLife
//    4  history

