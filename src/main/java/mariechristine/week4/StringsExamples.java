package mariechristine.week4;

public class StringsExamples {

    public static void main(String[] args) {

        String greeting = "Hello, my friends!";
        String cars = "MCB and Audi";
        System.out.println(greeting + "\n" + cars);

        System.out.println(cars.compareTo("Hello, my friends!"));
        System.out.println(greeting.compareTo("MCB and Audi"));

        char[] array = cars.toCharArray(); //gibt den String als Array aus (in der Konsole  untereinander)
        for (char c : array) {
            System.out.println(c);
        }


        System.out.println("\n==================================================================\n");
        System.out.println("Substring Ausgabe: " + cars.substring(5));
        System.out.println("\n==================================================================\n");

        System.out.println("Buffer, getChars:");
        char[] buffer = new char[10];
        cars.getChars(5, cars.length(), buffer, 0);
        for (char c : buffer) {
            System.out.println(c);

        }

        System.out.println("\n============================================================\n");

        String name = "Florentine";
        System.out.println("Der Name Florentine enthält " + name.length() + " Buchstaben.");
        String prefix = "end";
        String suffix = "ine";
        System.out.println(name.startsWith(prefix));
        System.out.println(name.endsWith(suffix));
        System.out.println(name.concat("s"));
        System.out.println("\n===========================================================\n");

        }

}
