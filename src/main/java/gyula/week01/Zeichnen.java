package gyula.week01;

public class Zeichnen {
    public static void main(String[] args) {
        printSquare("A ", 5);
    }

    public static void printSquare(String text, int size){
        for (int i = 0; i < size; i++) { // Zeilen
            for (int j = 0; j < size; j++) { // Spalten
                System.out.print(text);
            }
            System.out.println();
        }
    }
}
