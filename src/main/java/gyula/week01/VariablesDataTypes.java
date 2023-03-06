package gyula.week01;

public class VariablesDataTypes {
    public static void main(String[] args) {
        System.out.println("Text Wert"); // String
        System.out.println("\\");
        System.out.println("\"");
        System.out.println('C');         // Character
        System.out.println(150);         // int
        System.out.println(9999999999999L); // long
        System.out.println(3.14f);       // float
        System.out.println(3.14);        // double (Double Präzision Float)
        System.out.println(true);
        System.out.println(false);

        int amount = 0;
        System.out.println("Amount: " + amount);
        amount = 1;
        System.out.println("Amount: " + amount);
        amount = 2 + 3;
        System.out.println("Amount: " + amount);
        amount = 4 * 2;
        System.out.println("Amount: " + amount);
        amount = 16 / 4;
        System.out.println("Amount: " + amount);
        System.out.println("5 / 2 = " + (5 / 2));
        System.out.println("5 % 2 = " + (5 % 2));

        double totalWeight = 5.0;
        System.out.println(totalWeight + " / 2.0 = " + (totalWeight / 2.0));

        boolean test = (totalWeight <= 10.0);
        System.out.println("test: " + test);
    }
}
