package mariechristine;

public class ExercisesMethodsLoops1 {
    public static void main(String[] args) {

//        printChars("X ", 10);
//        printSquare("A ", 10);
//        printRect("B ", 3, 5);
        printTriangleBottomLeft("C ", 4);
        printTriangleTopLeft("D ", 5);
        printTriangleTopRight("E ", 5);
        printTriangleBottomRight("X ", 5);
//        printEmptySquare("F ", 10);
//        printEmptySquareA("A", 3);
//        printSlash("X ", 3);printSlashA("Y ", 4);
//        printTriangle("X ", 3);
//        printSlashDown("X ", 10, true);
//        printSlashDown("X ", 5, false);
    }

    public static void printChars(String text, int count) {
        //System.out.println("Aufgabe: Print Characters");
        for (int i = 0; i < count; ++i) {
            System.out.print(text);
        }

        System.out.println();
        System.out.println();
    }

    public static void printSquare(String text, int count) {
        System.out.println("Aufgabe: Print Square");
        for (int i = 0; i < count; ++i) {
            for (int j = 0; j < count; ++j) {
                System.out.print(text);
            }
            System.out.println();
        }
    }

    public static void printRect(String text, int countColumns, int countRows) {
        System.out.println("Aufgabe: Print Rectangle");
        for (int i = 0; i < countRows; ++i) { // Anzahl der Zeile wird gedruckt
            for (int k = 0; k < countColumns; ++k) { // Buchstaben in einer Zeile schreiben
                System.out.print(text);  // Schreiben eine Buchstabe
            }
            System.out.println(); // Zeilenumbruch am Ende der Zeile
        }
    }

    public static void printTriangleBottomLeft(String text, int count) {
        System.out.println("Aufgabe: Print Trinagle 1");
        for (int i = 0; i < count; ++i) { // Anzahl der Zeilen wird gedruckt
            for (int k = 0; k < i + 1; ++k) { // Buchstaben in einer Zeile werden geschrieben
                System.out.print(text);  // Schreibt ein Buchstabe
            }
            System.out.println(); // Zeilenumbruch am Ende der Zeile
        }
    }


    public static void printTriangleTopLeft(String text, int count) {
        System.out.println("Aufgabe: Print Triangle 2");
        for (int z = 0; z < count; ++z) { //Anzahl der Zeilen wird gedruckt
            for (int i = 0; i < count - z; ++i) { //Buchstaben in einer Zeile
                System.out.print(text);
            }
            System.out.println();
        }

    }


    public static void printCharsWOLineBreak(String text, int count) {
        for (int i = 0; i < count; ++i) {
            System.out.print(text);
        }
    }


    public static void printTriangleTopRight(String text, int count) {
        System.out.println("Aufgabe: Print Triangle 3");
        for (int z = 0; z < count; ++z) { //Anzahl der Zeilen wird gedruckt
            printCharsWOLineBreak("  ", z); // Beginnend bei Zeile 0 (Z1 kein Leerzeichen, Z2 1 Leerzeichen, etc
            printCharsWOLineBreak(text, count - z); //definiert wie viel Buchstaben in einer Zeile sind
            System.out.println();
        }
    }


    public static void printTriangleBottomRight(String text, int count) {
        System.out.println("Aufgabe: Print Trinagle 4");
        for (int i = 0; i < count; ++i) { // Anzahl der Zeilen wird gedruckt
            printCharsWOLineBreak(". ", count - i - 1);
            printCharsWOLineBreak(text, +i);
            {
                System.out.print(text);

            }


            System.out.println();
        }
    }


    public static void printEmptySquare(String text, int size) {
        System.out.println("Aufgabe: Print Empty Square");
        // Erste Zeile
        printCharsWOLineBreak(text, size);
        System.out.println();

        // Mitte
        for (int i = 0; i < size - 2; i++) {
            System.out.print(text);
            printCharsWOLineBreak(". ", size - 2);
            System.out.print(text);
            System.out.println();
        }

        // Letze Zeile
        printCharsWOLineBreak(text, size);
        System.out.println();
        System.out.println();

    }

    public static void printEmptySquareA(String text, int count) {
        System.out.println("Aufgabe: Print Empty SquareA");
        //Erste Zeile
        printCharsWOLineBreak(text, count);
        System.out.println();


        //Mitte
        for (int i = 0; i < count - 2; i++) {
            System.out.print(text);
            printCharsWOLineBreak(".", count - 2);
            System.out.println(text);
        }

        //Lezte Zeile
        printCharsWOLineBreak(text, count);
        System.out.println();
        System.out.println();

    }

    public static void printSlashDown(String text, int count, boolean backslash) {
        if (backslash == true) {
            printSlash(text, count);
        } else {
            printSlashA(text, count);
        }
    }

    public static void printSlash(String text, int count) {
        System.out.println("Aufgabe: Print Slash");
//        System.out.println(text);
//        boolean test = (count == 3);
//        System.out.println("  " + text);
//        System.out.println("    " + text);


        for (int i = 0; i < count; i++) {
            for (int k = 0; k < i + 1; k++) {
                System.out.print(text);
            }
            {
                System.out.println();
            }
        }
    }

    public static void printSlashA(String text, int count) {
        System.out.println("Aufgabe: Print SlashA");
        System.out.println("      " + text);
        System.out.println("    " + text);
        System.out.println("  " + text);
        System.out.println(text);
    }

    public static void printTriangle(String text, int count) {
        System.out.println("Aufgabe: Print Triangle");
        for (int i = 0; i < count; ++i) {
            for (int k = 0; k < i + 1; ++k) {
                System.out.print(text);
            }
            System.out.println();
        }

    }

    public static void printChristmasTree(String text, int count) {
        System.out.println("Aufgabe: Print Christmastree");
        for (int i = 0; i < count; ++i) {
            printCharsWOLineBreak(" ", count - i);
            printCharsWOLineBreak(text, i);

            System.out.println(text);
        }
    }
}


