package benjamin.week01;

public class MethodenSchleifen {
    public static void main(String[] args) {
        printChars("X ", 10);
        printSquare("X ",10);
    }

    public static void printChars(String text, int count) {
        System.out.println("Print Characters");
        for (int i = 0; i < count; i++) {
                System.out.print(text);
            }
            System.out.println();
        }

    public static void printSquare(String text, int count){
        System.out.println("Print Square");
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; ++j){
                System.out.print(text);
            }
            System.out.println();
        }
    }


}
