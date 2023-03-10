package joachim.Week01;

public class Mathmatik {
    public static void main(String[] args) {

        printSummenrechnung(20, 50);
        printFraktionalrechnung(20);
        printDezimalZahlen(2);
    }


    public static void printSummenrechnung(int startValue, int endValue) {
        System.out.println("Aufgabe: Summenrechnung");
        int summe = 0;
        for (int i = startValue; i <= endValue; i++) {
            summe += i;
        }
        System.out.println("Summe: " + summe);

    }

    public static void printFraktionalrechnung(int wert) {
        System.out.println("Aufgabe: Fraktional");
        long fraktion = 1;
        for (int i = 1; i <= wert; i++) {
            fraktion *= i;
            System.out.printf("%2d! = %20d\n", i, fraktion);


        }
        System.out.println();
    }

    public static void printDezimalZahlen(double wert) {
        double dezimal = 0.1;
        for (double i = 0; i <= wert; i += dezimal) {
            System.out.printf("Summe: %8.3f\n", i);
        }
        System.out.println("hier wird die 2 nicht angezeigt da die Nachkommastelle über 2 ist. \ndaran kann Ich nicht viel ändern auser den Grenzbereich zu erweiter. z.B. wert + 0.1");
    }
}




