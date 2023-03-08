package gyula.week01;

public class Pyramide {
    public static void main(String[] args) {
        //printTriangleSandro("S ", 8);
        printTriangleHassan("H ", 5);
    }

    public static void printTriangleSandro(String text, int count) {
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < 2 * count - 1; j++) {
                if ((i + j == count - 1) || (j == count + i -1) || (i == count -1)) {
                    System.out.print(text);
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();                                                           //Zeilenumbruch
    }

    public static void printTriangleHassan(String text, int count){
        System.out.println();
        System.out.println();
        System.out.println("PrintTriangle4");
        for (int i = 0; i < count ; i++) {
            for (int j = 0; j < count - i; j++) {
                System.out.print("  ");
            }
            System.out.print(text); // Linke Seite
            for (int k = 0; k < 2 * i - 1; k++) { // Mitte der Pyramide
                if (i == count - 1){
                    System.out.print(text);
                } else {
                    System.out.print(". ");
                }
            }
            if (i > 0) { // Rechte Seite
                System.out.print(text);
            }
            System.out.println();
        }

    }
}
