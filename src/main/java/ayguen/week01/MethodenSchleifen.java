package ayguen.week01;

import com.sun.jdi.Value;

public class MethodenSchleifen {

    public static void main(String[] args) {
        printChars("x", 10);
        printSquare("A ", 10);
        printRect("B ", 3, 10);
        printTriangleBottomLeft("C ", 6);
        printTriangleTopLeft("Z", 5);
        printTriangleTopRight("P", 5);
        printTriangleBottomRight("T", 5);
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
    public static void printTriangleBottomRight(String text, int count){
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
}





