package hassan.week01;

public class Zuhause {

    public static void main(String[] args) {
        System.out.println("=== Zuhause ===");
        dreieck("A",3);

    }
    public static void dreieck(String text, int count) {
        for (int i = 1; i <= count; i++) {

            // Schleife für die Spalten
            for (int j = 1; j <= count; j++) {

                // Wenn es die erste oder letzte Zeile ist, oder die erste oder letzte Spalte,
                // schreiben Sie ein text aus, um das Viereck zu bilden.
                if (i == 1 || i == count || j == 1 || j == count) {
                    System.out.print(text);
                } else {
                    System.out.print(" ");
                }
            }

            // Nach jeder Zeile einen Zeilenumbruch einfügen.
            System.out.println();
        }
    }


}


