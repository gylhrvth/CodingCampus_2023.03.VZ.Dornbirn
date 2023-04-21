package mariechristine.week7;

public class StreamsTable {
    public static void main(String[] args) {

        printTable();
    }

    public static String printTable() {
        String[] firstName = {"Alfonso", "Beatrix-Eleonor", "Cecil", "Daniel", "Elmar"};
        String[] lastName = {"Klein", "Kinderdorfer", "Al Elmenar", "Schmidt", "Simma"};
        int[] age = {40, 78, 5, 18, 81};
        String[] place = {"Wien", "Schwarzach", "Wiener Neudorf", "Sankt Pölten", "Sankt Pölten"};
        float[] distanceFromCapital = {0f, 654.4f, 12.457634366f, 120.0f, 119.9999f};


        String output = "";

        output += String.format("| %-20s ", "First Name");
        output += String.format("| %-20s ", "Last Name");
        output += String.format("| %-20s ", "Place");
        output += String.format("| %20s ", "Age");
        output += String.format("| %20s ", "Distance Capital");
        output += String.format("| ");
        output += System.lineSeparator();



        for (int j = 0; j < firstName.length; j++) {
            output += String.format("| %-20s ", firstName[j]);
            output += String.format("| %-20s ", lastName[j]);
            output += String.format("| %-20s ", place[j]);
            output += String.format("| %20d ", age[j]);
            output += String.format("| %20.2f ", distanceFromCapital[j]);
            output += String.format("| ");
            output += System.lineSeparator();

        }
        System.out.println(output);

        return output;
    }

}
