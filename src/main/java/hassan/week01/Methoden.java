package hassan.week01;

public class Methoden {
    public static void main(String[] args) {
        printChars("x ", 10);
        printSquare("x ", 10);
        PrintRectangle("x ", 10, 3);
        printTriangle("x ", 4);
        PrintTriangle2("x ", 5);
        PrintTriangle3("x ", 5);
        PrintTriangle4("x ", 5);
        PrintEmptysquare("x", 10);
        Printemptysquare2("A", 3);
        printslash("x", 3, true);
        printslash2("y", 4, false);
        printtriangle5("x", 7);
        baum(20, 5, 3, (20 - 1) / 2, 1, "*");


        for(int i = 10; i < 20; i++) {
            baum(i);
        }
    }

    public static void printChars(String text, int count) {
        System.out.println("PrintChars");
        for (int i = 0; i < count; i++) {
            System.out.print(text);
        }
        System.out.println();

    }

    public static void printSquare(String text, int count) {
        System.out.println();
        System.out.println();
        System.out.println("PrintSquare");
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                System.out.print(text);
            }

            System.out.println();
        }
    }

    public static void PrintRectangle(String text, int breite, int laenge) {
        System.out.println();
        System.out.println();
        System.out.println("PrintRectangle");
        for (int i = 0; i < laenge; i++) {
            for (int j = 0; j < breite; j++) {
                System.out.print(text);
            }
            System.out.println();
        }
    }

    public static void printTriangle(String text, int count) {
        System.out.println();
        System.out.println();
        System.out.println("PrintTriangle");
        for (int i = 0; i <= count; i++) {
            System.out.println();
            for (int j = 0; j < i; j++) {
                System.out.print(text);
            }
        }
    }

    public static void PrintTriangle2(String text, int count) {
        System.out.println();
        System.out.println("PrintTriangle2");
        for (int i = 0; i < count; i++) {
            System.out.println();
            for (int j = count; j > i; j--) {
                System.out.print(text);
            }
        }
    }

    public static void PrintTriangle3(String text, int count) {
        System.out.println();
        System.out.println();
        System.out.println("PrintTriangle3");
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                if (j >= i) {
                    System.out.print(text);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void PrintTriangle4(String text, int count) {
        System.out.println();
        System.out.println();
        System.out.println("PrintTriangle!!!!");
        for (int i = 1; i <= count; i++) {
            for (int j = 0; j < count - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print(text);
            }
            System.out.println();
        }

    }

    public static void PrintEmptysquare(String text, int count) {
        System.out.println();
        System.out.println();
        System.out.println("PrintEmptySquare");
        System.out.println("PrintSquare");
        for (int i = 0; i < count; i++) {
            System.out.print(text);
        }
        System.out.println();
        for (int j = 0; j < count - 2; j++) {

            System.out.println(text + "        " + text);
        }
        for (int i = 0; i < count; i++) {
            System.out.print(text);
        }
    }

    public static void Printemptysquare2(String text, int count) {
        System.out.println();
        System.out.println();
        System.out.println("PrintEmptysquare2");
        for (int i = 1; i <= count; i++) {
            for (int j = 1; j <= count; j++) {
                if (i == 1 || i == count || j == 1 || j == count) {
                    System.out.print(text);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void printslash(String text, int count, boolean direction) {
        System.out.println();
        System.out.println();
        System.out.println("printslash");
        for (int i = 1; i <= count; i++) {
            for (int j = 1; j <= count; j++) {
                if ((direction && (i == j) || (!direction && (i + j == count - 1)))) {
                    System.out.print(text);
                } else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void printslash2(String text, int count, boolean direction) {
        System.out.println();
        System.out.println();
        System.out.println("printslash");
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                if ((direction && (i == j) || (!direction && (i + j == count - 1)))) {
                    System.out.print(text);
                } else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void printtriangle5(String text, int count) {
        System.out.println();
        System.out.println();
        System.out.println("printTriangle5");
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < 2 * count - 1; j++) {
                if ((i + j == count - 1) || (j == count + i - 1) || (i == count - 1)) {
                    System.out.print(text);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }

    public static void baum(int breite) {
        baum(breite, breite / 4, breite/4,(breite - 1) / 2,1,"*");
    }
    public static void baum(int breite, int stammb, int stammhoe, int leer, int stern, String text) {
        System.out.println("baum");
        System.out.println();
        System.out.println();
        for (int zeile = 1; zeile <= (breite + 1) / 2; zeile++) {
            for (int leerspalte = 1; leerspalte <= leer; leerspalte++) { //abstaende
                System.out.print(" ");
            }
            for (int sternch = 1; sternch <= stern; sternch++) { //text
                System.out.print(text);
            }
            leer--; // abstaende weniger machen
            stern = stern + 2; // sterne hinzufuegen
            System.out.println();
        }
        for (int stammzeile = 1; stammzeile <= stammhoe; stammzeile++) { //abstaende stamm
            for (int leerspalte = 1; leerspalte <= (breite - stammb) / 2; leerspalte++) {
                System.out.print(" ");
            }
            for (int t = 1; t <= stammb; t++) {
                System.out.print("T");
            }
            System.out.println();
        }

    }
}



