package eric.Week01;

public class PrintFunktionen {
    public static void main(String[] args) {
        printChars("x", 10);
        printSquare("x", 10);
        printRect("x", 10, 3);
        printTriangleBottomLeft("x", 4);
        printTriangleTopLeft("x", 5);
        printTriangleTopRight("x", 5);
        printTriangleBottomRight("x", 5);
        printEmptySquare("x", 10);
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
    }

    //X wird 10 in mal in der Selben Reihe und 3 Zeilen nach unten angezeigt
    public static void printRect(String text, int count, int row){
        for (int i = 1; i <= row; i++) {
            for (int j = 0; j < count; j++) {
                System.out.print(text);
            }
            System.out.println();
        }
    }

    //X wird in einem dreieck Geprinted von links unten
    /*
        x
        xx
        xxx
        xxxx
     */
    public static void printTriangleBottomLeft(String text, int row){
        for (int i = 0; i < row; i++) {
            System.out.println();
            for (int j = 0; j <= i; j++) {
                System.out.print(text);

            }
        }
    }

    //X wird in einem dreieck von rechts oben Geprinted
    /*
        xxxxx
        xxxx
        xxx
        xx
        x
     */
    public static void printTriangleTopLeft(String text, int row){
        for (int i = 0; i < row; i++) {
            System.out.println();
            for (int j = row; j > i; j--) {
                System.out.print(text);
            }
        }
    }

    //X wird mit einem IF Statement in einem Dreieck von Rechts oben Geprinted
    /*
        xxxxx
         xxxx
          xxx
           xx
            x
     */
    public static void printTriangleTopRight(String text, int row){
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                if (j >= i){
                    System.out.print(text);
                } else{
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
                System.out.print(" ");
            }
                for (int f = 0; f < i; f++) {
                    System.out.print(text);
                }
                System.out.println();
            }
        }



    /*public static void printEmptySquare(String text, int row) {
        for (int i = 0; i < row; i++) {
            System.out.print(text);
        }

        System.out.println();

        for (int i = 0; i < row -2; i++) {
            System.out.print(text + "        " + text);
            for (int j = 0; j <= row -2; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

        for (int i = 0; i < row; i++) {
            System.out.print(text);
        }
        System.out.println();
    }*/

    public static void printEmptySquare(String text, int row) {
        for (int i = 0; i < row; i++) {
            System.out.print(text);
        }
        System.out.println();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {

                    if (i >= j - 2) {
                        System.out.print("y");
                    } else if (j >= i) {
                        System.out.print(".");
                    } else if (i == j - 2) {
                        System.out.print(text);
                    } else if (j == i) {
                        System.out.print("c");
                    }



            }
        }

            System.out.println();
            for (int i = 0; i < row; i++) {
                System.out.print(text);
            }
            System.out.println();
        }

}




    /*public static void (String text, int row) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= row - i; j++) {
                if (i <= j) {
                    System.out.print(text);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }*/
