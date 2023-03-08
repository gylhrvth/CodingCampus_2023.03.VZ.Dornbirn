package sandro.week01;

import org.w3c.dom.ls.LSOutput;

public class Funktionen {
    public static void main(String[] args) {
        printchars("A ", 10);
        printsquare("B ", 10);
        printrect("C ", 10, 3);
        printTriangleBottomLeft("D ", 4);
        printTriangleTopLeft("E ", 5);
        printTriangleTopRight("F ", 5);
        printTriangleBottomRight("G ", 5);
        printEmptySpquare1("H ", 10);
        printEmptySpquare2("I ", 3);
        printSlash1("J ", 3, true);
        printSlash2("text", 4, false);
    }

    public static void printchars(String text, int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(text);
        }
        System.out.println();                                                           //Zeilenumbruch
    }

    public static void printsquare(String text, int count) {
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                System.out.print(text);
            }
            System.out.println();

        }
        System.out.println();                                                           //Zeilenumbruch
    }

    public static void printrect(String text, int count, int zeile) {
        for (int i = 0; i < zeile; i++) {
            for (int j = 0; j < count; j++) {
                System.out.print(text);
            }
            System.out.println();
        }
        System.out.println();                                                           //Zeilenumbruch
    }

    public static void printTriangleBottomLeft(String text, int count) {
        for (int i = 0; i < count; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(text);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void printTriangleTopLeft(String text, int count) {
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count - i; j++) {
                System.out.print(text);
            }
            System.out.println();
        }
        System.out.println();                                                           //Zeilenumbruch
    }
    /*
    public static void printTriangleTopRight (String text, int count){
        for (int i = count; i >= 1; i--) {
            for (int j = 1; j <= count -i; j++) {
                System.out.print(" ".repeat(text.length()));
            }
            for (int j = 1; j<=i; j++ ) {
                System.out.print(text);
            }
            System.out.println();
        }
        System.out.println();                                                           //Zeilenumbruch
    }
     */


    public static void printTriangleTopRight(String text, int count) {
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                if (j < i) {
                    System.out.print("  ");
                } else {
                    System.out.print(text);
                }
            }
            System.out.println();
        }
        System.out.println();                                                           //Zeilenumbruch
    }

    public static void printTriangleBottomRight(String text, int count) {
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                if (i + j >= count - 1) {
                    System.out.print(text);
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();                                                           //Zeilenumbruch
    }
    public static void printEmptySpquare1 (String text, int count){
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                if (i == 0) {
                    System.out.print("A ");
                } else if (j == 0) {
                    System.out.print("B ");
                } else if (i == count -1) {
                    System.out.print("C ");
                } else if (j == count -1) {
                    System.out.print("D ");
                } else if (i == 1) {
                    System.out.print("+ ");
                } else if (j == 1) {
                    System.out.print("* ");
                } else if (i == count -1 - 1) {
                    System.out.print("/ ");
                } else if (j == count -1 - 1) {
                    System.out.print("% ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();                                                           //Zeilenumbruch
    }
    public static void printEmptySpquare2 (String text, int count){
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                if (i == 0) {
                    System.out.print("A ");
                } else if (j == 0) {
                    System.out.print("B ");
                } else if (i == count -1) {
                    System.out.print("C ");
                } else if (j == count -1) {
                    System.out.print("D ");
                } else if (i == 1) {
                    System.out.print("+ ");
                } else if (j == 1) {
                    System.out.print("* ");
                } else if (i == count -1 - 1) {
                    System.out.print("/ ");
                } else if (j == count -1 - 1) {
                    System.out.print("% ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();                                                           //Zeilenumbruch
    }
    public static void printSlash1 (String text, int count, boolean backslash){
        if (backslash == true) {
            for (int i = 0; i < count; i++) {
                for (int j = 0; j < count; j++) {
                    if (i == j) {
                        System.out.println(text);
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }
        else {
            for (int i = 0; i < count; i++) {
                for (int j = 0; j < count; j++) {
                    if (i + j == count -1) {
                        System.out.println(text);
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }
        System.out.println();                                                           //Zeilenumbruch
    }
    public static void SlashRightTop (String text, int count){
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                if (i == j) {
                    System.out.println(text);
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void SlashLeftTop (String text, int count){
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                if (i + j == count -1) {
                    System.out.println(text);
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }





    public static void printSlash2 (String text, int count, boolean backslash){
        if (backslash)
    }
}
