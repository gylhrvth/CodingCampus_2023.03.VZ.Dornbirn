package gyula.week02;

public class TryCatchExample {
    public static void main(String[] args) {
        System.out.println("A");
        System.out.println("B");
        System.out.println("C");
        int x = -1;
        try {
            x = Integer.valueOf("G65");
            System.out.println("D");
            System.out.println("E");
        } catch (NumberFormatException nfe){
            System.out.println("nicht gewonnen");
        }
        System.out.println("x: " + x);
        System.out.println("F");
        System.out.println("G");
        System.out.println("H");
    }
}
