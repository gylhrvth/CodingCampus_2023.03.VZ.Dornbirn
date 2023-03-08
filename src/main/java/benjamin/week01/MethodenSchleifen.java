package benjamin.week01;

public class MethodenSchleifen {
    public static void main(String[] args) {
        printChars("X ", 10);
        printSquare("A ", 10);
        printRect("B ", 10, 3);
        printTriangle1("C ", 4);
        printTriangle2("D ", 5);
        printTriangle3("E ", 5);
        printTriangle4("F ", 5);
        printEmptySquare("G ", 3);
        printSlash("H ", 5, true);
        printSlash("H ", 3, false);
    }

    public static void printChars(String text, int count) {
        System.out.println("Characters");
        for (int i = 0; i < count; i++) {
            System.out.print(text);
        }
        System.out.println();
    }

    public static void printSquare(String text, int count) {
        System.out.println("Square");
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; ++j) {
                System.out.print(text);
            }
            System.out.println();
        }
    }

    public static void printRect(String text, int count, int newCount) {
        System.out.println("Rectangle");
        for (int i = 0; i < newCount; i++) {
            for (int j = 0; j < count; j++) {
                System.out.print(text);
            }
            System.out.println();
        }
    }

    public static void printTriangle1(String text, int count) {
        System.out.println("TriangleBottomLeft");
        for (int i = 0; i < count; i++) {
            for (int j = count; j <= count + i; j++) {
                System.out.print(text);
            }
            System.out.println();
        }

    }

    public static void printTriangle2(String text, int count) {
        System.out.println("TriangleTopLeft");
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count - i; j++) {
                System.out.print(text);
            }
            System.out.println();

        }
    }

    public static void printTriangle3(String text, int count) {
        System.out.println("TriangleTopRight");
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
    }

    public static void printTriangle4(String text, int count) {
        System.out.println("TriangleBottomRight");
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

    }

    public static void printEmptySquare(String text, int count) {
        System.out.println("EmptySquare");
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                if (i == 0 || j == count - 1) {
                    System.out.print("A ");
                } else if (j == 0 || i == count - 1) {
                    System.out.print("B ");
                } else {
                    System.out.print(". ");
                }
            }

            System.out.println();

        }
    }


    public static void printSlashRightDown(String text, int count) {
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                if (i == j) {
                    System.out.print(text);
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }

    public static void printSlashRightUp(String text, int count) {
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                if (i + j == count - 1) {
                    System.out.print(text);
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }


    public static void printSlash(String text, int count, boolean direction) {
        System.out.println("Slash");
        if (direction) {
            printSlashRightDown(text, count);
        } else {
            printSlashRightUp(text, count);
        }
    }

    public static void printTriangle(String text, int count){
        System.out.println("Triangle");
    }

}


