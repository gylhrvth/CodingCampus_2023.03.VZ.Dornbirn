package joachim.Week01;

public class Strukturiertes_Prog {
    public static void main(String[] args) {
        printChars("x", 10);


        printSquare("x", 5);


        printRectangle("x", 5, 3);


        printTriangle("x", 5);


        printTriangle2("x", 6);


        printTriangle3("x", 8);


        printTriangle4("x", 8);


        printSquare2("x", 8);

        printSlash()

    }

    public static void printChars(String text, int count) {
        System.out.println("Aufgabe: printChars");
        for (int i = 1; i <= count; i++) {
            System.out.print(text);

        }

    }

    public static void printSquare(String text, int countSquare) {
        System.out.println("Aufgabe: printSquare");
        for (int i = 1; i <= countSquare; i++) {
            for (int j = 1; j <= countSquare; j++) {
                System.out.print(text);
            }
            System.out.println(); //hier ist es wichtig das print nl ausserhalb der Funktion zu haben, ansoonsten wird diese mit dem Text und nicht danach wiederholt.

        }

    }

    public static void printRectangle(String text, int countRectangleX, int countRectangleY) {
        System.out.println("Aufgabe: printRectangle");
        for (int i = 1; i <= countRectangleY; i++) {
            for (int j = 1; j < countRectangleX; j++) { //Es werden zuerst die Reihen danach die Anzahl der X definiert.
                System.out.print(text);

            }
            System.out.println(text);
        }
    }

    public static void printTriangle(String text, int steigung) {
        System.out.println("Aufgabe: printTriangle");
        for (int i = 0; i < steigung; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(text);
            }
            System.out.println();
        }

    }

    public static void printTriangle2(String text, int steigung) {
        System.out.println("Aufgabe: printTriangle2");
        for (int i = steigung; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(text);
            }
            System.out.println();
        }

    }

    public static void printTriangle3(String text, int steigung) { //Gundsätzlich ein Viereck aber X werden mit einem Leerfeld getauscht
        System.out.println("Aufgabe: printTriangle3");
        for (int i = 1; i <= steigung; i++) {
            for (int j = 1; j <= steigung; j++) {
                if (i > j)
                    System.out.print(" ");
                else {
                    System.out.print(text);
                }
            }
            System.out.println();
        }
    }

    public static void printTriangle4(String text, int steigung) {
        System.out.println("Aufgabe: printTriangle4");
        for (int i = 0; i <= steigung; i++) {
            for (int j = 0; j <= steigung; j++) {
                if (i + j >= steigung)
                    System.out.print(text);
                else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }

    public static void printSquare2(String text, int groesse) {
        System.out.println("Aufgabe: printSquare2");
        for (int i = 0; i <= groesse; i++) {
            for (int j = 0; j <= groesse; j++) {
                if (i == 0 || j == groesse) {
                    System.out.print("A ");
                } else if (j == 0 || i == groesse) {
                    System.out.print("B ");
                } else {
                    System.out.print(". ");

                }

            }
            System.out.println();

        }
    }

    public static void printSlash(String text, int laenge, boolean richtiung){

    }
}








