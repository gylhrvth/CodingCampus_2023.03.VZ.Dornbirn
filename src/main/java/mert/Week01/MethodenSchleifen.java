package mert.Week01;

import org.w3c.dom.Text;

public class MethodenSchleifen {
    public static void main(String[] args) {
//        printChars("a ", 10);
//        printSquare("b", 10);
//        printrect("c", 3, 10);
//        printangle("d", 4);
//        printangletopleft("e", 5);
//        printangletopright("f", 5);
//        printanglebottomright("g", 5);
//        printemptysquare2("x", 10);
//        printemptysquare2("A", 3);
//        printslash("x", 3);
//        printslash2("y", 4);
        printtriangle("x", 5);


    }

    public static void printChars(String Text, int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(Text);
        }
        System.out.println();
        System.out.println();
    }

    public static void printSquare(String Text, int count) {
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                System.out.print(Text);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void printrect(String Text, int count, int count2) {
        for (int i = 0; i < count; i++) {           //Untereinander die Zeiler
            for (int j = 0; j < count2; j++) {      //Nebeneinander die Zeilen
                System.out.print(Text);

            }
            System.out.println();
        }
        System.out.println();
    }


    public static void printangle(String Text, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(Text);
            for (int j = 0; j < i; j++) {
                System.out.print(Text);
            }
        }
        System.out.print(Text);
        System.out.println();
        System.out.println();
    }

    public static void printangletopleft(String Text, int count) {
        for (int i = 0; i < count; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(Text);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void printangletopright(String Text, int count) {
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                if (j < i)
                    System.out.print(" ");
                else
                    System.out.print(Text);

            }
            System.out.println();
        }
        System.out.println();

    }


    public static void printanglebottomright(String text, int count) {
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
        System.out.println();
    }

    public static void printemptysquare(String text, int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(text);

        }
        System.out.println();

        for (int i = 0; i < count - 2; i++) {
            System.out.print(text);

            for (int j = 0; j < count - 2; j++) {
                System.out.print(".");

            }
            System.out.println(text);
        }
        for (int i = 0; i < count; i++) {
            System.out.print(text);

        }
        System.out.println();
        System.out.println();
    }

    public static void printemptysquare2(String text, int count) {
        // erste Zeile
        for (int i = 0; i < count; i++) {
            System.out.print(text);
        }
        System.out.println();

        // mitte
        for (int i = 0; i < count - 2; i++) {
            System.out.print(text);
            for (int j = 0; j < count - 2; j++) {
                System.out.print(".");
            }
            System.out.print(text);
            System.out.println();
        }

        //dritte Zeile
        for (int i = 0; i < count; i++) {
            System.out.print(text);
        }
        System.out.println();
        System.out.println();
    }

    public static void printslash(String text, int count) {
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                if (i == j) {
                    System.out.print(text);
                } else System.out.print(".");

            }

            System.out.println();

        }
    }


    public static void printslash2(String text, int count) {
        System.out.println();
        for (int i = 1; i <= count; i++) {
            for (int j = 0; j < count - i; j++) {
                System.out.print(".");

            }
            System.out.print(text);
            System.out.println();

        }
        System.out.println();
    }

    public static void printtriangle(String text, int count) {
        for (int i = 1; i <= count; i++) {
            for (int j = 0; j < count - i; j++) {
                System.out.print(" ");

            }
            System.out.print(text);
            // Leer
            for (int j = 0; j < 2 * i - 3; j++) {
                if (i == count){
                    System.out.print(text);
                } else {
                    System.out.print(" ");
                }
            }

            if (i > 1){
                System.out.print(text);
            }
            System.out.println();

        }
    }
}











































