package joachim.Week01;

public class Strukturiertes_Prog {
    public static void main(String[] args) {
   //     printChars("x", 10);
//        printSquare("x ", 5);
//        printRectangle("x ", 5, 3);
//        printTriangle("x ", 5);
//        printTriangle2("x ", 6);
//        printTriangle3("x ", 8);
//        printTriangle4("x ", 8);
//        printSquare2("x ", 8);
//        printSlash("x ", 3, true);
//        printSlash("y ", 7, false);
//        printtriangleCenter("x ", 8);
//        printRhombus("x ", 8);
//        printBigX("x ", 6);
        Kreis(20);

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
            for (int j = 1; j <= countSquare; j = j + 1) {
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

    public static void printSlash(String text, int laenge, boolean richtung) {
        System.out.println("Aufgabe: Slash");
        for (int i = 0; i < laenge; i++) {
            for (int j = 0; j < laenge; j++) {
                if (richtung) {
                    if (i == j) {
                        System.out.print(text);
                    } else {
                        System.out.print(". ");
                    }
                } else {
                    if (i + j == laenge - 1) {
                        System.out.print(text);
                    } else {
                        System.out.print(". ");
                    }
                }

            }
            System.out.println();

        }
    }

    public static void printtriangleCenter(String text, int groesse) {
        System.out.println("Aufgabe: triangleCenter");
        for (int i = 0; i < groesse; i++) {
            for (int j = 0; j < 2 * groesse - 1; j++) {
                if ((i + j == groesse - 1) || (j == groesse + i - 1) || (i == groesse - 1)) { // (links) || (rechts) || (unten)
                    System.out.print(text);
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }

    public static void printRhombus(String text, int groesse) {
        int upperHeight = groesse / 2;

        int lowerHeight = groesse - upperHeight;


        for (int i = 0; i < upperHeight; i++) {
            for (int j = 0; j < upperHeight * 2; j++) {
                if (i + upperHeight == j) {
                    System.out.print(text);
                } else if (i + j == upperHeight - 1) {
                    System.out.print("v ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
        for (int i = 0; i < lowerHeight; i++) {
            for (int j = 0; j < lowerHeight * 2; j++) {
                if (i == j) {
                    System.out.print("Y ");
                } else if (i + j == lowerHeight * 2 -1) {
                    System.out.print("u ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();


        }

    }

    public static void printBigX(String text, int groesse) {
        System.out.println();
        for (int i = 0; i < groesse; i++) {
            for (int j = 0; j < groesse; j++) {
                if ((i == j) || (j + i == groesse - 1)) { // (links) || (rechts) | (i + j == groesse - 1)
                    System.out.print(text);
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }

    public static void Kreis(int Radius){
        for (int i = -1 * Radius; i <= Radius ; i++) {
            for (int j = -1 * Radius; j <= Radius; j++) {
                if ((i * i) + (j * j) <= (Radius * Radius)){
                    System.out.print("x ");
                }else{
                    System.out.print(". ");
                }

            }
            System.out.println();
        }

    }

}










