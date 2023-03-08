package hassan.week01;

import java.util.Arrays;

public class Methoden {
    public static void main(String[] args) {
//        printChars("x ", 10);
//        PrintSquare("x ",10);
//        PrintRectangle("x ", 10, 3);
//        PrintTriangle("x ", 4);
//        PrintTriangle2("x ",5);
//        PrintTriangle3("x ",5);
//        PrintTriangle4("x ",5);
//        PrintEmptysquare("x",10);
//        Printemptysquare2("A",3);
//        printslash("x",3,true);
//        printslash2("y",4,false);
        //       printtriangle5("x",7);
        printRhombus("x", 7);

    }

    public static void printChars(String text, int count) {
        System.out.println("PrintChars");
        for (int i = 0; i < count; i++) {
            System.out.print(text);
        }
        System.out.println();

    }

    public static void PrintSquare(String text, int count) {
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

    public static void PrintTriangle(String text, int count) {
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
        System.out.println("PrintTriangle4");
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
    }

    public static void printRhombus(String text, int count) {
        System.out.println();
        System.out.println();
        System.out.println("printrhombus");
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count + i ; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < count - i ; k++) {
                System.out.print(text);
            }
            System.out.println();
        }
        System.out.println();
    }
}


