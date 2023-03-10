package gyula.week01;

public class Operatoren {
    public static void main(String[] args) {
        // Datentypen primitiv
        byte byte1 = 1; // 8 bit -128 -- +127
        short short1 = 1; // 16 bit -32... -- +32...
        int int1 = 1; // 32 bit
        long long1 = 1; // 64 bit

        System.out.println("Byte geht von " +Byte.MIN_VALUE+ " bis " + Byte.MAX_VALUE);
        System.out.println("Short geht von " + Short.MAX_VALUE+ " bis " + Short.MAX_VALUE);
        System.out.println("Integer geht von " + Integer.MIN_VALUE + " bis " + Integer.MAX_VALUE);
        System.out.println("Long geht von " + Long.MIN_VALUE + " bis " + Long.MAX_VALUE);

        long1 = 15L; // Long Konstant 15
        // short1 = 15L; // So geht es nicht

        char char1 = 'A';
        for (char c = 'A'; c <= 'Z' ; c++) {
            System.out.print(c);
        }
        System.out.println();

        float float1 = 0.5f;
        double double1 = 0.45;

        boolean bool1 = true;

        // Assignment
        int1 = 6;

        // Numerische Operatoren (Binär)
        // + - * / %
        int1 = byte1 + 6;
        int1 = 6 - short1;
        int1 = 2 * byte1;
        int1 = 100 / 5;
        int1 = 100 % 7;

        // Operator präzedent
        int1 = 1 + 2 + 3 + 4 + 5 + 6;
        int1 = 1 + 2 + 3 * 4 + 5 + 6;
        int1 = (1 + 2 + 3) * (4 + 5 + 6);

        // Abkürzung Assigment + Operator
        int1 = int1 + 2;
        int1 += 2;
        int1 -= 2;
        int1 *= 5;
        int1 /= 4;

        // Numerische Operatoren (Uni)
        ++int1; // int1 = int1 + 1;
        --int1; // int1 = int1 - 1;
        int1++;
        int1--;

        // Vergleichsoperatoren
        bool1 = true;
        bool1 = false;

        bool1 = (int1 == 3); // Prüft, ob int1 ist gleich 3
        if (int1 == 3){
            System.out.println("genau 3");
        }

        bool1 = (int1 != 3); // Prüft, ob es UNGLEICH ist
        bool1 = (int1 < 3);
        bool1 = (int1 > 3);
        bool1 = (int1 <= 3);
        bool1 = (int1 >= 3);

        // Logische Operatoren
        // ! negation
        // && und
        // || oder

        System.out.println("!TRUE: " + !true);
        System.out.println("!FALSE: " + !false);

        System.out.println("TRUE && TRUE: " + (true && true));
        System.out.println("TRUE && FALSE: " + (true && false));
        System.out.println("FALSE && TRUE: " + (false && true));
        System.out.println("FALSE && FALSE: " + (false && false));

        System.out.println("TRUE || TRUE: " + (true || true));
        System.out.println("TRUE ||  FALSE: " + (true || false));
        System.out.println("FALSE || TRUE: " + (false || true));
        System.out.println("FALSE || FALSE: " + (false ||  false));


        System.out.println("======================");

        System.out.println(2);
        System.out.println(20456);

        System.out.printf("%5d\n", 2);
        System.out.printf("%5d\n", 20456);

        System.out.printf("%2d : %5d\n", 2, 33341);

        System.out.printf("%8.3f", 80.3);

        System.out.println("======================");
        System.out.println(10000 + 10000);
        System.out.println(2.8 + 0.17);

    }
}
