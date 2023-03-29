package mariechristine.week4;

public class TabelleDarstellen {

    public static void main(String[] args) {

        int[][] chart = new int[7][7];
        printChart(chart);
    }

    public static void printChart(int[][] chart) {
        for (int col = 0; col < chart.length; col++) {
            if (col > 0) {
                System.out.println("  |             |               |               |               |               |");
                System.out.println("__|_____________|_______________|_______________|_______________|_______________|");
            }
            }
        }
    }
