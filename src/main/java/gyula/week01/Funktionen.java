package gyula.week01;

public class Funktionen {
    public static void main(String[] args) {
        int value = 3;
        counting(value, "Hello World!");
        counting(value, "Dadadadada");
        System.out.println("Value: " + value);
    }

    /*
    Diese Funktion:
        - hat zwei Parameter
        - schreibt etwas auf die Konsoles
     */
    public static void counting(int countOfRepeat, String satz){
        countOfRepeat = 2 * countOfRepeat;

        // Hier mach ich dies und das
        for (int i = 0; i < countOfRepeat; i++) {
            System.out.print(satz);
        }
    }
}
