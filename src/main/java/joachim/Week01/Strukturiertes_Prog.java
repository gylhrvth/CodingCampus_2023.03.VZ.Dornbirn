package joachim.Week01;

public class Strukturiertes_Prog {
    public static void main(String[] args) {
        System.out.println("Aufgabe: printChars");
        printChars("x", 10);

        System.out.println();
        System.out.println();

        System.out.println("Aufgabe: printSquare");
        printSquare("x", 5);

        System.out.println();
        System.out.println();

        System.out.println("Aufgabe: printRectangle");
        printRectangle("x", 5, 3);

    }

    public static void printChars(String text, int count) {
        for (int i = 1; i <= count; i++) {
            System.out.print(text);

        }

    }

    public static void printSquare(String text, int countSquare) {
        for (int i = 1; i <= countSquare; i++) {
            for (int j = 1; j <= countSquare; j++) {
                System.out.print(text);
            }
            System.out.println();

        }

    }

    public static void printRectangle(String text, int countRectangleX, int countRectangleY){
        for (int i = 1; i <= countRectangleY ; i++) {
            for (int j = 1; j < countRectangleX ; j++) {
                System.out.print(text);

            }
            System.out.println(text);
        }
    }




}


