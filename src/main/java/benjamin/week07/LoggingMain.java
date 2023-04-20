package benjamin.week07;

public class LoggingMain {
    public static void main(String[] args) {

        int count = 0;

        long start = System.currentTimeMillis();
        long measureUpTo = 10000;

        while (count < 1000000) {
            Logging.log(3, "Guten Morgen!");
            Logging.log(2, "Keine passende Aufgabe gefunden");
            Logging.log(1, "");
            if (count == measureUpTo) {
                long duration = System.currentTimeMillis() - start;
                System.out.println(measureUpTo / (duration / 1000.0) + "w/s");
                start = System.currentTimeMillis();
                count = 0;
            }

            count++;

        }
    }
}
