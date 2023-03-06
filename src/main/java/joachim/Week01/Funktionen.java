package joachim.Week01;

public class Funktionen {
    public static void main(String[] args) {

        int maxValue = meinMax(10, -5)

        int start = 0;
        int altend = -10;

        zahlenfor(start, maxValue);
        zahlenwhile(start, maxValue);
        zahlentrick(start, maxValue);
        zahlenrewind(maxValue, altend);

    }
    public static int meinMax(int a, int b){
        int result = b;
        if (a > b){
            result = a;
        }

        return result;}

    public static void zahlenfor(int start, int end) {

        System.out.println("Zaehlen for");
        for (int i = start; i <= end; i++) {
            System.out.println("i: " + i);
        }
    }


    public static void zahlenwhile(int start, int end) {
        System.out.println("Zaehlen while");
        int k = start;
        while (k <= end) {

            System.out.println("k: " + k);
            k += 1;
        }
    }


    public static void zahlentrick(int start, int end) {
        System.out.println("Zaehlen Trick");
        for (int i = start; i <= end; i += 1) {
            if (i % 2 < 1) {
                System.out.println(i);
            }
        }
    }


    public static void zahlenrewind(int altstart, int altend) {

        System.out.println("Zaehlen rewind");
        for (int j = altstart; j >= altend; j = j - 1) {
            System.out.println("j: " + j);
        }


    }

}
