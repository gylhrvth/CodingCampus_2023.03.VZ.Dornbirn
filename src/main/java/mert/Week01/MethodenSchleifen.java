package mert.Week01;

import org.w3c.dom.Text;

public class MethodenSchleifen {
    public static void main(String[] args) {
        printChars("a ", 10);
        printSquare("b", 10);
        printrect("c", 3, 10);
        printangle("d", 4);
        printangletopleft("e", 5);
        printangletopright("f", 5);
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
            System.out.println(Text);
            for (int j = 0; j < count; j++) {
if (i == j)
    System.out.println(Text);
else
    System.out.print(".");
            }
            System.out.println();
        }

    }

}































