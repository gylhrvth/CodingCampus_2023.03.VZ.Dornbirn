package benjamin.week01;

public class MethodenSchleifen {
    public static void main(String[] args) {
        printChars("X ", 10);
        printSquare("A ",10);
        printRect("B ",10,3);
        printTriangle1("C ",4);
        printTriangle2("D ", 5);
        printTriangle3("E",5);
    }

    public static void printChars(String text, int count) {
        System.out.println("Characters");
        for (int i = 0; i < count; i++) {
                System.out.print(text);
            }
            System.out.println();
        }

    public static void printSquare(String text, int count){
        System.out.println("Square");
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; ++j){
                System.out.print(text);
            }
            System.out.println();
        }
    }

    public static void printRect(String text, int count, int newCount){
        System.out.println("Rectangle");
        for (int i = 0; i < newCount ; i++) {
            for (int j = 0; j < count ; j++){
                    System.out.print(text);
                }
                System.out.println();
            }
        }

    public static void printTriangle1(String text, int zeilen){
        System.out.println("TriangleBottomLeft");
        for( int i = 0; i < zeilen; i++){
            for(int j = zeilen; j <= zeilen +i; j++){
                System.out.print(text);
            }
            System.out.println();
        }

    }
    public static void printTriangle2(String text, int zeilen){
        System.out.println("TriangleTopLeft");
        for (int i = 0; i < zeilen ; i++) {
            for (int j = 0; j < zeilen -i ; j++) {
                System.out.print(text);
            }
            System.out.println();

        }
    }

    public static void printTriangle3(String text, int zeilen){
        System.out.println("TriangleTopRight");
        for (int i = 0; i < zeilen; i++) {
            for (int j = 0; j >= zeilen +i ; j++) {
                System.out.print(text);
            }
            System.out.println();

        }
    }

}
