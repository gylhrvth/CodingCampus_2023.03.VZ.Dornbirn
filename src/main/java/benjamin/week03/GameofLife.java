package benjamin.week03;

public class GameofLife {
    public static void main(String[] args) {
        System.out.println("<<<<<GameOfLife>>>>>>");

//        printField(GLEITER);

        for (int i = 0; i < 20; i++) {
            System.out.println(i);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            //noop
        }
        clearScreen();
        }

    }

    // ich brauche eine Current Gen??
    // ich brauche eine Next Gen methode
    //ich brauche  eine countaliveNeighbours methode
    // print Board

    public static void printField(int[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.println(field[i][j]);

            }
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

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

//        1  cd ~/IdeaProjects/CodingCampus_2023.03.VZ.Dornbirn/build/classes/java/main
//    2  java benjamin.week03.GameofLife
//    3  java benjamin.week03.GameofLife
//    4  history

}
