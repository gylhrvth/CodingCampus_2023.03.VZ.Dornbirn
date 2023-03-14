package gyula.week02;

import java.util.Random;

public class RandomExample {
    static Random rand = new Random();
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            int x = rand.nextInt(101);
            System.out.println(x);
        }
    }
}
