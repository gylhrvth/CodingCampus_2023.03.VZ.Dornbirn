package sandro.week01;

public class Loop {
    public static void main(String[] args) {
        int maxValue = meinMax(10, -5);

        loopinclusiv(0, maxValue);
        loopexclusiv(0, maxValue);
        loopmodular(0, maxValue);
        looprewind(maxValue, -10);
    }
    public static int meinMax(int a, int b){
        int result = b;
        if (a > b){
            result = a;
        }

        return result;
    }
    public static void loopinclusiv(int start, int end){
        System.out.println("Loop Inclusiv 10");                         // Schleife
        for (int i = start; i <= end; i = i + 1) {
            System.out.println(i);
        }

        System.out.println();

        System.out.println("Loop Inclusiv 10 with while Function");     // Schleife (while)
        int k = start;
        while (k <= end) {
            System.out.println(k);
            k = k + 1;
        }

        System.out.println();}

    public static void loopexclusiv(int start, int end){
        System.out.println("Loop Exclusiv 10");                           // Schleife (exclude 10)
        for (int i = start; i < end; i = i + 1) {
            System.out.println(i);
        }

        System.out.println();}

    public static void loopmodular(int start, int end){
        System.out.println("Loop with Modular Operation");                // Schleife (nur gerade)
        for (int i = start; i <= end; i = i + 1) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }


        System.out.println();}

    public static void looprewind(int start, int end){                  // Schleife (Rückwerts)
        System.out.println("Loop Rewind");
        for (int i = start; i >= end; i = i - 1) {
            System.out.println(i);}
        }

        }

