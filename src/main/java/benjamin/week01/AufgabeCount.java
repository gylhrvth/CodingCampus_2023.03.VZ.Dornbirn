package benjamin.week01;

public class AufgabeCount {

    public static void main(String[] args) {
        int maxValue = meinMax(5, -5);

        aufgabe1(0, maxValue);         //count with for and with
        aufgabe2(0, maxValue);         //count to 10 without 10
        countwithtrick(0, maxValue);
        rewind(maxValue, -10);
    }
    public static int meinMax(int a, int b) {
        int result = b;
        if (a > b) {
            result = a;
        }

        return result;
    }

public static void aufgabe1(int start, int maxValue){
    System.out.println("Aufgabe 1");

    System.out.println("Count with for");
    for (int i = start; i <= maxValue; i = i + 1) {
        System.out.println(i);
    }
    System.out.println("Count with while");
    int k = 0;
    while (k <= 10){
        System.out.println(k);
        k = k + 1;
    }

}
public static void aufgabe2(int start, int maxValue){
    System.out.println("Aufgabe 2");
    for (int i = start; i < maxValue; i = i + 1) {
        System.out.println(i);
    }
}
public static void countwithtrick(int start, int maxValue){
    System.out.println("Aufgabe Zaehlen mit Trick");


    for (int i = start; i <= maxValue; i = i + 1) {

        if (i % 2 == 0)
            System.out.println(i);
    }
    System.out.println();
    for (int i = 0; i <= 10; i = i + 2){
        System.out.println(i);

    }

}
public static void rewind(int start, int end) {
    System.out.println("Aufgabe Rewind");
    for (int i = start; i >= end; i = i - 1) {
        System.out.println(i);
    }
}

}
