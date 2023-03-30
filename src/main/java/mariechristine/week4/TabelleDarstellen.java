package mariechristine.week4;

import java.util.Arrays;

public class TabelleDarstellen {

    public static void main(String[] args) {

        int[][] chart = new int[7][7];
        printChart(chart);

        String[] firstName = {"Alfonso", "Beatrix-Eleonor", "Cecil", "Daniel", "Elmar"};
        String[] lastName = {"Klein", "Kinderdorfer", "Al Elmenar", "Schmidt", "Simma"};
        String[][] names = {{"Alfonso", "Beatrix-Eleonor", "Cecil", "Daniel", "Elmar"},
                            {"Klein", "Kinderdorfer", "Al Elmenar", "Schmidt", "Simma"}};
        System.out.println(names);

/*        for (int i = 0; i < firstName.length; i++) {

            {
                System.out.println(Arrays.toString(firstName));

            }
            
*/        }


    public static void printChart(int[][] chart) {
        for (int col = 0; col < chart.length; col++) {
            if (col > 0) {
                System.out.println("  |             |               |               |               |               |");
                System.out.println("__|_____________|_______________|_______________|_______________|_______________|");
            }
            }
        }
    }
