package eric.Week01;

public class Methoden {
    public static void main(String[] args) {
        printChars("x", 10);
        printSquare("x", 10);
        printRect("x", 10, 3);
        printTriangleBottomLeft("x", 4);
        printTriangleTopLeft("x", 5);
        printTriangleTopRight("x", 5);
        printTriangleBottomRight("x", 5);
        printEmptySquare("x", 10);
        printTinySquare("A", 3);
        printSlash("x", 3, true);
        printSlashUp("y", 4, false);
        printTriangle("x", 6);
        printRhombus("x", 7);
        printX("x", 7);
        printFullTriangle("*", 9);
        printChristmasTree(15);
        printCircle("0", 10);
    }

    //X wird 10 mal in einer Reihe angezeigt (print)

    public static void printChars(String text, int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(text);
        }
        System.out.println();
    }


    //X wird 10 mal von links nach rechts angezeigt
    public static void printSquare(String text, int count) {
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                System.out.print(text);
            }
            System.out.println();
        }
        System.out.println();
    }

    //X wird 10 in mal in der Selben Reihe und 3 Zeilen nach unten angezeigt
    public static void printRect(String text, int count, int row) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < count; j++) {
                System.out.print(text);
            }
            System.out.println();
        }
        System.out.println();
    }

    //X wird in einem dreieck Geprinted von links unten
    /*
        x
        xx
        xxx
        xxxx
     */
    public static void printTriangleBottomLeft(String text, int row) {
        for (int i = 0; i < row; i++) {
            System.out.print("");
            for (int j = 0; j <= i; j++) {
                System.out.print(text);

            }
            System.out.println();
        }
        System.out.println();
    }

    //X wird in einem dreieck von rechts oben Geprinted
    /*
        xxxxx
        xxxx
        xxx
        xx
        x
     */
    public static void printTriangleTopLeft(String text, int row) {
        for (int i = 0; i < row; i++) {
            System.out.println("");
            for (int j = row; j > i; j--) {
                System.out.print(text);
            }
        }
        System.out.println();
    }

    //X wird mit einem IF Statement in einem Dreieck von Rechts oben Geprinted
    /*
        xxxxx
         xxxx
          xxx
           xx
            x
     */
    public static void printTriangleTopRight(String text, int row) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                if (j >= i) {
                    System.out.print(text);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    //X wird als Dreieck von rechts unten Geprinted
    /*
        3 FOR Statements werden benutzt,
            -ForI sagt aus wieviele Zeilen es Tief sein soll
            -ForJ sagt aus wieviel Abstände pro Zeile Gezählt werden sollen
            -ForF sagt auf wieviele "X" pro Zeile Geprinted werden sollen
            Ergebniss:
                 x
                xx
               xxx
              xxxx
             xxxxx
     */
    public static void printTriangleBottomRight(String text, int row) {
        for (int i = 1; i <= row; i++) {
            for (int j = 0; j < row - i; j++) {
                System.out.print(" ".repeat(text.length()));
            }
            for (int k = 0; k < i; k++) {
                System.out.print(text);
            }
            System.out.println();
        }
    }

    public static void printEmptySquare(String text, int row) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {

                if (i == 0) {
                    System.out.print("A");
                } else if (j == 0) {
                    System.out.print("B");
                } else if (i == row - 1) {
                    System.out.print("C");
                } else if (j == row - 1) {
                    System.out.print("C");
                } else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void printTinySquare(String text, int row) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {

                if (i == 0) {
                    System.out.print(text);
                } else if (j == 0) {
                    System.out.print(text);
                } else if (i == row - 1) {
                    System.out.print(text);
                } else if (j == row - 1) {
                    System.out.print(text);
                } else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void printSlashRightDown(String text, int row) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                if (i == j) {
                    System.out.print("A");
                } else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }

    }

    public static void printSlashRightUp(String text, int row) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row - 1; j++) {
                if (i == j) {
                    System.out.print("B");
                } else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }

    public static void printSlash(String text, int row, boolean direction) {
        if (direction) {
            printSlashRightDown(text, row);
        } else {
            printSlashRightUp(text, row);
        }
        System.out.println();
    }

    public static void printSlashUp(String text, int row, boolean direction) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                if ((direction && (i == j) || (!direction && (i + j == row - 1)))) {
                    System.out.print("B");
                } else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void printTriangle(String text, int row) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row - i - 1; j++) {
                System.out.print(".");
            }
            System.out.print(text);
            for (int f = 0; f < 2 * i - 1; f++) {
                if (i == row - 1) {
                    System.out.print(text);
                } else {
                    System.out.print(".");
                }

            }
            if (i > 0) {
                System.out.print(text);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void printRhombus(String text, int row) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                if (i + j == row + 2) {
                    System.out.print("A");
                } else if (j - i == row - 4) {
                    System.out.print("B");
                } else if (i + j == row - 4) {
                    System.out.print("C");
                } else if (i - j == row - 4) {
                    System.out.print("D");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void printX(String text, int row) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                if (i == j || i + j == row - 1) {
                    System.out.print(text);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void printFullTriangle(String text, int row) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.print(text);
            for (int f = 0; f < 2 * i - 1; f++) {
                if (i == row - 1) {
                    System.out.print(text);
                } else {
                    System.out.print(text);
                }

            }
            if (i > 0) {
                System.out.print(text);
            }
            System.out.println();
        }

    }

    public static void christmasTreeBottom(String text, int row) {
        int trunkWidth = row / 3;

        for (int lines = 0; lines < 2; lines++) {
            for (int i = 1; i <= row - trunkWidth + 1; i++) {
                System.out.print(" ");
            }


            for (int i = 0; i < trunkWidth; i++) {
                System.out.print(text);
            }
            System.out.println();
        }
    }

    public static void printChristmasTree(int row) {
        System.out.println();
        printFullTriangle("*", row);
        printChars("O ", row);
        christmasTreeBottom("+", row);
    }


    public static void printCircle(String text, int dia) {
        System.out.println();
        System.out.println();

        for (int i = 0; i < dia; i++) {
            for (int j = 0; j < dia; j++) {
                System.out.print(text);
            }
            System.out.println();
        }
        System.out.println();
    }
}


