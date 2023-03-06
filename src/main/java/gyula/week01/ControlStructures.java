package gyula.week01;

public class ControlStructures {
    public static void main(String[] args) {

        // Sequenz
        System.out.println("Hello 1");
        System.out.println("Hello 2");
        System.out.println("Hello 3");

        // If statement
        double weight = 5.0;
        if (weight < 10.0) {
            System.out.println("Klein");
        } else {
            System.out.println("Groß");
        }

        // Schleife
        for (int i = 0; i < 10; i = i + 1){
            System.out.println("i: " + i);
        }

        // Schleife (alternative)
        int k = 0;
        while (k < 10){
            System.out.println("k: " + k);
            k = k + 1;
        }
    }
}
