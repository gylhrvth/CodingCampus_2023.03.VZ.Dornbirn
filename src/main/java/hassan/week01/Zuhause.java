package hassan.week01;

public class Zuhause {

    public static void main(String[] args) {
        System.out.println("=== Zuhause ===");

        RR(10,"X" );
        printRhombus(5,"X");
        xbild("X",5);
        baum(20,5,5,(20 - 1)/2,1,"*");


    }
    public static void RR(int size, String Symbol) {   //Voller raute
        // Obere Teil
        for (int i = 1; i <= size; i++) {
            // abstand oben
            for (int j = size; j > i; j--) {
                System.out.print(".");
            }
            // Print the symbol for the left half
            for (int j = 1; j <= i; j++) {
                System.out.print(Symbol + ".");
            }
            // Move to the next line
            System.out.println();
        }
        // Print the lower half of the rhombus
        for (int i = size - 1; i >= 1; i--) {
            // Print spaces for the left half
            for (int j = size; j > i; j--) {
                System.out.print(".");
            }
            // Print the symbol for the left half
            for (int j = 1; j <= i; j++) {
                System.out.print(Symbol + ".");
            }
            // Move to the next line
            System.out.println();
        }
        System.out.println();
    }

    public static void printRhombus(int size, String symbol) { // leere mitte
        // oben
        for (int i = 1; i <= size; i++) {
            // Print spaces for the left half
            for (int j = size; j > i; j--) {
                System.out.print(" ");
            }
            // symbol links
            for (int j = 1; j <= i * 2 - 1; j++) {
                if (j == 1 || j == i * 2 - 1 ) {
                    System.out.print(symbol + " ");
                } else {
                    System.out.print(" ");
                }
            }
            // Move to the next line
            System.out.println();
        }
        // Print the lower half of the rhombus
        for (int i = size - 1; i >= 1; i--) {
            // Print spaces for the left half
            for (int j = size; j > i; j--) {
                System.out.print(" ");
            }
            // Print the symbol for the left half
            for (int j = 1; j <= i * 2 - 1; j++) {
                if (j == 1 || j == i * 2 - 1) {
                    System.out.print(symbol + " ");
                } else {
                    System.out.print(" ");
                }
            }
            // Move to the next line
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println();
    }

    public static void xbild(String text, int count) {
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                if (i == j || i + j == count - 1) {
                    System.out.print(text);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }




    public static void baum(int breite, int stammb, int stammhoe,int leer,int stern ,String text){
        for (int zeile = 1; zeile <=(breite+1)/2; zeile++) {
            for (int leerspalte = 1; leerspalte <= leer ; leerspalte++) {
                System.out.print(" ");
            }
            for (int sternch = 1; sternch <= stern ; sternch++) {
                System.out.print(text);
            }
            leer--;
            stern= stern +2;
            System.out.println();
        }
        for (int stammzeile = 1; stammzeile <=stammhoe ; stammzeile++) {
            for (int leerspalte = 1; leerspalte <=(breite - stammb)/2 ; leerspalte++) {
                System.out.print(" ");
            }
            for (int t = 1; t <=stammb ; t++) {
                System.out.print("T");
            }
            System.out.println();
        }
    }
}




