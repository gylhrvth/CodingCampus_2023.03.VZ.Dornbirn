package mariechristine.week2;

import gyula.week02.ConsoleInputNumber;

import java.util.Arrays;

public class ArraysExample {

    public static void main(String[] args) {

/*        int size = ConsoleInputNumber.readNumber_v5("Wie groß soll es sein?", 1, 1000);

        // Erstelle ich das Array
        int[] input = new int[size];

        // Initialisierung der Elementen einzeln...
        for (int i = 0; i < input.length; i++) {
            input[i] = 1;

            // Ausdruck
            System.out.println(Arrays.toString(input));
        }

        int[] arrayName;//Deklaration: diese Schreibweise wird verwendet, wenn klar ist, dass ein Platz für ein Array freigehalten werden muss
                        //Der Speicher wird allokiert (Reservierung von Hauptspeicher), die Variable hat noch keinen bestimmten Wert

        int arr = 0; //Initialisierung: Speicher muss allokiert sein und die Variable arr bekommt einen Wert

        //Ein Array kann in einem deklariert, instanziiert und initialisiert werden:
        int[] arrayName3 = new int[]{1, 2, 3, 4, 5};

        int[] arrayName2 = new int[2]; //Instanziierung: eine neue Instanz wird erzeugt; gilt nur für Objekte!
        //Erstes Element:
        arrayName2[0] = 8;
        //Zweites Element:
        arrayName2[1] = 3;
        System.out.println(arrayName2[0]);
        System.out.println(arrayName2[1]);

        System.out.println("Mit Schleife:");
        String[] arrayName4 = {"Hallo", "Haus", "Donald", "Ja"};
        for (int i = 0; i < arrayName4.length; i++) {
            System.out.println(arrayName4[i]); //Mit der Laufvariablen werden alle Elemente in der Konsole ausgegeben
        }

        //Ein Element kann in einem Array ersetzt werden:
        String[] myDesk = {"Pencil", "Paper", "Cup of Coffee", "Desk Lamp", "Laptop"};
        myDesk[2] = "Book";
        for (int i = 0; i < myDesk.length; i++) {
            System.out.println(myDesk[i]);
        }

        String[] myInstruments = {"Violine", "E-Guitar", "Piano", "Acoustic Guitar", "Percussion", "Flute"};
        myInstruments[3] = "Bass Guitar";
        for (int i = 0; i < myInstruments.length; i++) {
            System.out.println(myInstruments[i]);

        }

        int[][] array2D1;
        System.out.println("2D-Array mit for-Schleife:");
        int[][] array2D = new int[7][8];
        for (int i = 0; i < array2D.length; i++) { //length gibt hier die Anzahl der Zeilen zurück
            System.out.print("row " + i + " : ");
            for (int j = 0; j < array2D[i].length; j++) { //length gibt hier die Anzahl der Spalten zurück, die der aktuellen Zeile entsprechen
                System.out.print("col " + j + "  ");
            }
            System.out.println();

        }

        System.out.println("2D-Array jedes Element ausgegeben:");
        //array2D3[4][4] ist 4x4 groß, sprich 4 Zeilen * 4 Spalten, es passen also 16 Elemente hinein
        int[][] array2D3 = {{5, 4, 3, 8}, {1, 4, 8, 19}, {17, 1, 43, 6}, {77, 5, 9, 0}};
        for (int i = 0; i < array2D3.length; i++) {
            for (int j = 0; j < array2D3[i].length; j++) {
                System.out.print(array2D3[i][j] + "\t"); // \t = Tabulator
            }
            System.out.println();

        }

        System.out.println("String Array:");
        String[][] array2D2 = {{"Hallo", "Lolli"}, {"Haus", "Donald", "Ja"}}; //die Matrix von array2D2 ist [2][3] groß; 2 Zeilen + 3 Spalten
        System.out.println(array2D2[1].length); //Gibt die Anzahl der Elemente (hier: 3) in der Konsole aus, nicht den String ansich

        for (String[] fEachArray : array2D2) {
            System.out.println(Arrays.toString(fEachArray) + "\t");

        }
*/
        int[] arrayEins = new int[5];
        arrayEins[1] = 2;
        arrayEins[3] = 18;
        arrayEins[0] = 22;
        arrayEins[2] = 21;
        arrayEins[4] = 7;

        if (arrayEins[2] % arrayEins[4] != 0) {
            System.out.println("Nicht teilbar.");
        } else {
            System.out.println("Voll teilbar!");
        }

        while (arrayEins[2] % arrayEins[4] == 0) {
            System.out.println("Teilbar"); break;}

        if (arrayEins[2] % arrayEins[4] == 0) {
            System.out.println("Das 5. Element ist durch das 2. Element teilbar.");
        } else {
            System.out.println("Nicht teilbar.");
        }

        System.out.println("Einfache Inkrementierung, aber sehr umständlich:");
        int i = 0;
        System.out.println(arrayEins[i]);
        i++;
        System.out.println(arrayEins[i]);
        i++;
        System.out.println(arrayEins[i]);

        System.out.println("Mit for-schleife:");
        for (int s = 0; s < arrayEins.length; s++) {
            System.out.print(arrayEins[s] + "\t");
        }
        System.out.println();
        System.out.println("Mit while-Schleife:");
        int k = 0;
        while (k <= 4) {
            System.out.println(arrayEins[k]);
            k++;
        }

        arrayEins[0] = 127;
        System.out.println("Array ersetzen: " + arrayEins[0]);

        System.out.println("Array[2]*Array[3] ergibt: " + arrayEins[2] * arrayEins[1]);

        int produkt = arrayEins[2] * arrayEins[1];
        System.out.println("Ausgabe mit lokaler Variablen: " + produkt);

        System.out.println("Array Division: " + (double)arrayEins[1] / arrayEins[4]);
    }
}


