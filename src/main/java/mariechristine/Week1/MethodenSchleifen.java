package mariechristine.Week1;

public class MethodenSchleifen {
    public static void main(String[] args) {
        printChars("X ", 10);
        printSquare("A ", 3);
        printRectangle("B ", 10, 3);
        printTriangleBottomLeft("C ", 4);
        printTriangleTopLeft("D ", 5);
        printTriangleTopRight("E ", 5);
        printTriangleBottomRight("F ", 5);
        printEmptySquare("G ", 10);
        printEmptySquare2("H ", 3);
        printSlashFalse("Y ", 4);
        printSlashRight("X ", 3);
        printSlashDiffDirection(false);

        printTriangle("X ", 5);
        printRhombus("X ", 7);
        printX("X ", 5);
        printXMasTree("X ", 9);
    }

    public static void printChars(String text, int size) {
        System.out.println("Print Characters:");
        for (int i = 0; i < size; i++) {
            System.out.print(text);
        }
        System.out.println();//Zeilenabstand, sonst wäre "Print Characters in der gleichen zeile wie die "X"-Reihe
        System.out.println();//Noch einen Zeilenabstand, damit in der Konsole eine leere Zeile entsteht zur besseren Übersicht
    }
    public static void printSquare(String text, int size) {
        System.out.println("Print Square:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(text);
            }
            System.out.println(); //die innere Schleife wird zuerst ausgegeben bis unwahr;
        }                         //dann springt sie raus auf das println, um den Zeilenumbruch zu machen
        System.out.println();    //sie springt dann auf die äußere Schleife und prüft mit dem neuen index wieder die innere Schleife usw.
    }
    public static void printRectangle(String text, int length, int width) {
        System.out.println("Print Rectangle:");
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print(text);
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void printTriangleBottomLeft(String text, int size) {
        System.out.println("Print Triangle 1:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < i + 1; j++) { //bsp. 2 < 2 + 1 / das Ergebnis 3 wird ausgegeben
                System.out.print(text);
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void printTriangleTopLeft(String text, int size) {
        System.out.println("Print Triangle 2:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i; j++) {
                System.out.print(text);
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void printCharsWithoutLineBreak(String text, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(text);
        }
    }
    public static void printTriangleTopRight(String text, int size) {
        System.out.println("Print Triangle 3:");
        for (int i = 0; i < size; i++) {
            printCharsWithoutLineBreak(". ", i);
            printCharsWithoutLineBreak(text, size - i);
            System.out.println();
        }
        System.out.println();
    }
    public static void printTriangleBottomRight(String text, int size) {
        System.out.println("Print Triangle 4: ");
        for (int i = 0; i < size; i++) {
            printCharsWithoutLineBreak(". ", size - i - 1);
            printCharsWithoutLineBreak(text, i + 1);
            System.out.println();
        }
        System.out.println();
    }
    public static void printEmptySquare(String text, int size) {
        System.out.println("Empty Square: ");
        //Erste Zeile
        printCharsWithoutLineBreak(text, size);
        System.out.println();
        //Mitte
        for (int i = 0; i < size - 2; i++) {
            System.out.print(text);
            printCharsWithoutLineBreak(". ", size - 2);
            System.out.println(text);
        }
        //Letzte Zeile
        printCharsWithoutLineBreak(text, size);
        System.out.println();
        System.out.println();
    }
    public static void printEmptySquare2(String text, int size) {
        printEmptySquare(text, size);
    }
    public static void printSlashFalse(String text, int size) {
        System.out.println("Print Slash False: ");
        for (int i = 0; i < size; i++) {
            printCharsWithoutLineBreak(" ", size - i);
            printCharsWithoutLineBreak(text, 1);
            System.out.println();
        }
    }
    public static void printSlashRight(String text, int size) {
        System.out.println("Print Slash Right");
        for (int i = 0; i < size; i++) {
            printCharsWithoutLineBreak(" ", i);
            printCharsWithoutLineBreak(text, 1);
            System.out.println();
        }
    }
    public static void printSlashDiffDirection(boolean direction) {
        boolean backslash = true;
        if (!backslash == direction) {
            printSlashFalse("W ", 4);
        } else {
            printSlashRight("S ", 3);
        }
    }
    public static void printTriangle(String text, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                System.out.print(". ");
            }
            System.out.print(text);
            for (int f = 0; f < 2 * i - 1; f++) {
                if (i == size - 1) {
                    System.out.print(text);
                } else {
                    System.out.print(". ");
                }

            }
            if (i > 0) {
                System.out.print(text);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void printRhombus(String text, int size) {
        size = size / 2 + size % 2;
        for (int i = 0; i < 2 * size - 1; i++) {
            for (int j = 0; j < 2 * size - 1; j++) {
                if (i + j == size - 1) {
                    System.out.print(text);
                } else if (j == size + i - 1) {
                    System.out.print(text);
                } else if (j == i - size + 1) {
                    System.out.print(text);
                } else if (i + j == 3 * (size - 1)) {
                    System.out.print(text);
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();

        }
    }

    public static void printX(String text, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
            }
        }
    }

    public static void printXMasTree(String text, int size) {
        System.out.println("Print X-Mas-Tree: ");
        for (int i = 0; i < size; i++) {
            printCharsWithoutLineBreak(". ", size - i);
            printCharsWithoutLineBreak(text, i);

            System.out.println(text);
        }
    }
}
