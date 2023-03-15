package ayguen.week01;

import com.sun.jdi.Value;
import org.w3c.dom.ls.LSOutput;

public class MethodenSchleifen {

    public static void main(String[] args) {

//        printChars("x", 10);
//        printSquare("A ", 10);
//        printRect("B ", 3, 10);
//        printTriangleBottomLeft("C ", 6);
//        printTriangleTopLeft("Z", 5);
//        printTriangleTopRight("P", 5);
//        printTriangleBottomRight("T", 5);
//        printEmptySquare("*", 10);
//        printWindow("A ", 3);
//        printSlash("T", 3);
        printBackslash("V", 4);
//        printTriangle("o", 10);
        printTriangle2("x ", 4);

    }


    public static void printChars(String text, int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(text);

        }
        System.out.println();
        System.out.println();

    }

    public static void printSquare(String text, int count) {
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                System.out.print(text);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void printRect(String text, int countRows, int countColumns) {
        for (int i = 0; i < countRows; i++) {         // Untereinander die Zeilen
            for (int j = 0; j < countColumns; j++) {     // Buchstaben nebeneinander
                System.out.print(text);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void printTriangleBottomLeft(String text, int count) {
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(text);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void printTriangleTopLeft(String text, int count) {
        for (int i = 0; i < count; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(text);

            }
            System.out.println();


        }
        System.out.println();
    }

    public static void printTriangleTopRight(String text, int count) {
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                if (j < i)
                    System.out.print(" ");
                else
                    System.out.print(text);

            }
            System.out.println();
        }
        System.out.println();

    }

    public static void printTriangleBottomRight(String text, int count) {
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                if (i + j >= count - 1) {
                    System.out.print(text);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();                                                           //Zeilenumbruch
    }

    public static void printEmptySquare(String text, int count) {
        //erste Zeile
        for (int i = 0; i < count; i++) {
            System.out.print(text);
        }
        System.out.println();

        // Mittlere Block
        for (int i = 0; i < count - 2; i++) {
            System.out.print(text);
            for (int j = 0; j < count - 2; j++) {
                System.out.print(".");
                ;
            }
            System.out.print(text);
            System.out.println();
        }
        //letzte zeile
        for (int i = 0; i < count; i++) {
            System.out.print(text);

        }
        System.out.println();
        System.out.println();


    }

    public static void printWindow(String text, int count) {
        //erste Zeile
        for (int i = 0; i < count; i++) {
            System.out.print(text);
        }
        System.out.println();


        //mittlere zeile
        for (int i = 0; i < count - 2; i++) {
            System.out.print(text);
            for (int j = 0; j < count - 2; j++) {
                System.out.print(". ");
            }
            System.out.print(text);
            System.out.println();
        }

        //letzte zeile
        if (count > 1) {
            for (int i = 0; i < count; i++) {
                System.out.print(text);

            }
            System.out.println();
        }
        System.out.println();
    }

    public static void printSlash(String text, int count) {

        // erste Zeile

        for (int i = 0; i < count - 2; i++) {
            System.out.print(text);

        }
        System.out.println();
        // mittlere Zeile

        for (int i = 0; i < count - 2; i++) {
            System.out.print(" ");
            System.out.print(text);
        }

        System.out.println();

        // letzte Zeile

        for (int i = 0; i < count - 1; i++) {
            System.out.print(" ");
        }
        for (int i = 0; i < count - 2; i++) {
            System.out.print(text);

        }
        System.out.println();
    }

    public static void printBackslash(String text, int count) {
        System.out.println();

        //erste Zeile

        for (int j = 1; j <= count; j++) {
            for (int i = 0; i < count - j; i++) {
                System.out.print(".");


            }
            System.out.print(text);
            System.out.println();


        }
    }

    public static void printTriangle(String text, int height) {
        System.out.println();


        //erste Zeile

        //Deckel
        for (int i = 0; i < height; i++) {
            int spacesdeckel = height - 1 - i;
            System.out.print(text);


        }
        System.out.println();

        //Mitte
        for (int i = 1; i < height - 1; i++) {
            int spaces = height - i - 1;

            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            System.out.print(text);

            for (int j = 0; j < i * 2; j++) {
                System.out.print(" ");
            }
            System.out.print(text);
            System.out.println();
        }

        //Boden
        for (int i = 0; i < height * 2; i++) {
            System.out.print(text);
        }

    }

    public static void printTriangle2(String text, int count) {
        System.out.println("Aufgabe: Triangle Center");

        //erste Zeile

        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count * 2 -1; j++) {

                if((i + count -1 == j) || (i == count - 1) || (j + i == count -1 )){ // Rechts Unten Links
                    System.out.print(text);
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }


    }


}
































































