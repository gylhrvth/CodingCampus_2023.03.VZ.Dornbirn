package eric.osterFerien;

public class Methoden {
    public static void main(String[] args) {
        printAufgabe1("X", 10);
        System.out.println("---");
        printAufgabe2("~", 3);
        System.out.println("---");
        printAufgabe3("*", 3);
    }



    public static void printAufgabe1(String text, int count){
        for (int i = 0; i < count; i++) {
            System.out.print(text + " ");
        }
        System.out.println();
    }
    public static void printAufgabe2(String text, int count){
        for (int i = 0; i < count; i++) {
            System.out.println(text);
            System.out.println();
        }
        System.out.println();
    }
    public static void printAufgabe3(String text, int count){
        printAufgabe1(text, count);
        printAufgabe2(text, count);
    }
}
