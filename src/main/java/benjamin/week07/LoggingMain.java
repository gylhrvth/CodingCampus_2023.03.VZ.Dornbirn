package benjamin.week07;

public class LoggingMain {
    public static void main(String[] args) {
        long start1 = System.currentTimeMillis();

        double size = 0;

//        for (int i = 0; i < 1000000000; i++) {
//            String a = "Hallo"+"Hallo"+"Hallo";
//            size += a.length();
//        }
        for (int i = 0; i < 10000000; i++) {
            String a = String.format("%s%s%s", "Hallo","Hallo","Hallo");
            size += a.length();
        }

        System.out.println("Took: "+(System.currentTimeMillis() - start1)+"ms");


        if(Math.random() > 0) {
            return;
        }

        int count = 0;

        long start = System.currentTimeMillis();
        long measureUpTo = 10000;

        while (count < 1000000) {
            Logging3.log(3, "Guten Morgen!");
            Logging3.log(2, "Keine passende Aufgabe gefunden");
            Logging3.log(1, "");
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
