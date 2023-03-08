package ayguen.week01;

public class Loops {

    public static void main(String[] args) {
        int maxValue = meinMax(10, -5);

        aufgabe1(0, maxValue);
        aufbage2(0, maxValue);
        aufgabe3(0, maxValue);
        aufgabe4(maxValue, -10);
    }

    public static int meinMax(int a, int b) {
        int result = b;
        if (a > b) {
            result = a;
        }

        return result;
    }

    public static void aufgabe1(int start, int end) {
        System.out.println("Aufgabe: Zählen");{
            for (int i = start; i <= end; i = i + 1)
                System.out.println("i = " + i);
        }

        int j = start;
        while (j <= end) {
            System.out.println("j = " + j);
            j = j + 1;
        }
    }

    public static void aufbage2(int start, int end) {
        System.out.println("Aufgabe: Zählen 2");
        for (int i = start; i < end; i = i + 1) {
            System.out.println("i = " + i);
        }

    }

    public static void aufgabe3(int start, int end) {
        System.out.println("Aufgabe: Zählen mit Trick");
        for (int i = start; i <= end; i = i + 1) {
            if (i % 2 == 0) {
                System.out.println("i = " + i);
            }
        }
        for (int i = start; i <= end; i = i + 2) {
            System.out.println("i = " + i);
        }
    }

    public static void aufgabe4(int start, int end) {
        System.out.println("Aufgabe: Rewind");
        for (int i = start; i >= end; i = i - 1) {
            System.out.println("i = " + i);
        }
    }
}