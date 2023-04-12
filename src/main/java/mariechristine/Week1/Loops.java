package mariechristine.Week1;

public class Loops {
    public static void main(String[] args) {

        //Aufgabe: Zählen
        for (int i = 0; i <= 10; i = i + 1) {
            System.out.println("i: " + i);
        }

        int x = 0; //Wird eine Zählvariable bei einer while-Schleife verwendet, wird diese vor der Deklaration initialisiert
        while (x <= 10) {
            System.out.println("x: " + x);
            x = x + 1; //Bei einer while-Schleife steht die In-/Dekrementierung nach dem Schleifenkörper

        }

        //Aufgabe: Zählen 2

        for (int i = 0; i < 10; i = i + 1) {
            System.out.println("i: " + i);
        }

        //Aufgabe: Zählen mit Trick

        //Modulo Operator
        for (int m = 0; m <= 10; m++) {
            if (m % 2 == 0) { //Dieser Ausdruck lässt nur gerade Zahlen zu, da bsp. 2:2=1 Rest 0; 3:2=1 Rest 1 wird nicht ausgegeben
                System.out.println("m: " + m);
            }
        }

        //Modulo Operator ungerade
        for (int s = 0; s <= 10; s++) {
            if (s % 2 == 1) {
                System.out.println("s: " + s);
            }

        }

        //Modulo Operator jede 3. Zahl
        for (int j = 0; j <= 10; j++) {
            if (j % 3 == 1) {
                System.out.println("j: " + j);
            }

        }

        int k = 0;
        while (k <= 10) {
            System.out.println("k: " + k);
            k = k + 2; //Mit diesem Ausdruck wird 'k' immer um 2 erhöht; 0 = 0 + 2; 2 = 2 + 2; 4 = 4 + 2; 6 = 6 + 2; 8 = 8 + 2;
        }

        //Rewind
        int i = 10;
        while (i > -10) {
            System.out.println("i: " + i);
            i = i - 1;
        }

        for (int j = 10; j >= -10 ; j--) {
            System.out.println("j: " + j);

        }
    }
}

