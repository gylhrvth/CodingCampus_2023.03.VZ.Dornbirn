package sandro.week01;

import org.w3c.dom.ls.LSOutput;

public class Funktionen {
    public static void main(String[] args) {
//        printchars("A ", 10);
//        printsquare("B ", 10);
//        printrect("C ", 10, 3);
//        printTriangleBottomLeft("D ", 5);
//        printTriangleTopLeft("E ", 5);
//        printTriangleTopRight("F ", 5);
//        printTriangleBottomRight("G ", 5);
//        printEmptySpquare1("H ", 10);
//        printEmptySpquare2("I ", 3);
//        printSlash1("J ", 3, true);
//        printSlash2("K", 4, false);
//        printTriangle1("L ", 3);
//        printTriangle2("M ", 5);
//        printRhombus("N ", 7);
//        printRhombus2("N ", 8);
//        printX("O ", 5);
        printChristmastree(30);
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

    public static void printEmptySpquare1(String text, int count) {
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                if (i == 0) {
                    System.out.print("A ");
                } else if (j == 0) {
                    System.out.print("B ");
                } else if (i == count - 1) {
                    System.out.print("C ");
                } else if (j == count - 1) {
                    System.out.print("D ");
                } else if (i == 1) {
                    System.out.print("+ ");
                } else if (j == 1) {
                    System.out.print("* ");
                } else if (i == count - 1 - 1) {
                    System.out.print("/ ");
                } else if (j == count - 1 - 1) {
                    System.out.print("% ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();                                                           //Zeilenumbruch
    }

    public static void printEmptySpquare2(String text, int count) {
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                if (i == 0) {
                    System.out.print("A ");
                } else if (j == 0) {
                    System.out.print("B ");
                } else if (i == count - 1) {
                    System.out.print("C ");
                } else if (j == count - 1) {
                    System.out.print("D ");
                } else if (i == 1) {
                    System.out.print("+ ");
                } else if (j == 1) {
                    System.out.print("* ");
                } else if (i == count - 1 - 1) {
                    System.out.print("/ ");
                } else if (j == count - 1 - 1) {
                    System.out.print("% ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();                                                           //Zeilenumbruch
    }

    public static void printSlash1(String text, int count, boolean backslash) {
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
        } else {
            for (int i = 0; i < count; i++) {
                for (int j = 0; j < count; j++) {
                    if (i + j == count - 1) {
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

    public static void SlashRightTop(String text, int count) {
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
        System.out.println();                                                           //Zeilenumbruch
    }

    public static void SlashLeftTop(String text, int count) {
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                if (i + j == count - 1) {
                    System.out.println(text);
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();                                                           //Zeilenumbruch
    }


    public static void printSlash2(String text, int count, boolean backslash) {
        if (backslash) {
            SlashRightTop(text, count);
        } else {
            SlashLeftTop(text, count);
        }
        System.out.println();                                                           //Zeilenumbruch
    }

    public static void printTriangle1(String text, int count) {
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < 2 * count - 1; j++) {
                if ((i + j == count - 1) || (j == count + i - 1) || (i == count - 1)) {
                    System.out.print(text);
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();                                                           //Zeilenumbruch
    }

    public static void printTriangle2(String text, int count) {
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < 2 * count - 1; j++) {
                if ((i + j == count - 1) || (j == count + i - 1) || (i == count - 1)) {
                    System.out.print(text);
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();                                                           //Zeilenumbruch
    }

    public static void printRhombus(String text, int count) {
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                if ((i + j == count - 4) || (i == j)) {
                    System.out.print(text);
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void printRhombus2(String text, int count) {
        count = count / 2 + count % 2;
        for (int i = 0; i < 2 * count - 1; i++) {
            for (int j = 0; j < 2 * count - 1; j++) {
                if (i + j == count - 1) {
                    System.out.print(text);
                } else if (j == count + i - 1) {
                    System.out.print(text);
                } else if (j == i - count + 1) {
                    System.out.print("T ");
                } else if (i + j == 3 * (count - 1)) {
                    System.out.print("o ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
        System.out.println();                                                           //Zeilenumbruch
    }

    public static void printX(String text, int count) {
        //    count = count + count % 2;
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                if ((i == j) || (i + j == count - 1)) {
                    System.out.print(text);
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }

    public static void printChristmastree(int height) {
        int treeX = 1;
        int treeSpaces = height - 1;
        for (int i = 0; i < height; i++) {

            printText(treeSpaces, ".");
            printTextLn(treeX, "X");


            treeX = treeX + 2;
            treeSpaces = treeSpaces - 1;

        }
        printchars("O ", height);

        int trunkX = height / 2;
        int treewidth = height * 2 - 1;
        int trunkheight = height / 3 - 1 ;
        int trunkSpaces = treewidth / 2 - trunkX / 2;

        for (int i = 0; i < trunkheight; i++) {

            printText(trunkSpaces, ".");
            printTextLn(trunkX, "+");

        }


    }

    public static void printText(int count, String text) {
        for (int i = 0; i < count; i++) {
            System.out.print(text);
        }
    }

    public static void printTextLn(int count, String text) {
        printText(count, text);
        System.out.println();
    }

}
