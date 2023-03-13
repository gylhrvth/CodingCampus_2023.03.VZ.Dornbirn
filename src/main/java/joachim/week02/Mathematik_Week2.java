package joachim.week02;

import org.w3c.dom.ls.LSOutput;

public class Mathematik_Week2 {
    public static void main(String[] args) {
        printTeilenundHerrschen(20);
        printPi(0, 1);
    }

    public static void printTeilenundHerrschen(int endValue) {
        for (int i = 0; i <= endValue; i++) {
            System.out.println("x = " + i);
            System.out.println("x / 5 = " + i / 5);
            System.out.println("x / 5.0 = " + i / 5.0);
            System.out.println();
        }
        System.out.println();
    }

    public static void printPi(double pie, double pie2) {
        pie = 0;
        for (double i = 1; i <= 1000000000; i = i + 4) {
            pie += 4 / i;
        }
        pie2 = 0;
        for (double i = 3; i <= 1000000000; i = i + 4) {
            pie2 += 4 / i;
        }
        double pie3 = pie - pie2;
        System.out.println(pie3);
    }
}
