package gyula.week02;

public class CirclePythagoras {
    public static void main(String[] args) {
        int size = 100;
        for (int i = -1 * size; i <= size; i++) {
            for (int j = -1 * size; j <= size; j++) {
                // a^2 + b^2 <= c^2 Pythagoras
                if ((i * i) + (j * j) <= (size * size)) {
                    System.out.print("* ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }
}
