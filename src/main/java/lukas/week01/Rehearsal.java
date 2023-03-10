package lukas.week01;

public class Rehearsal {
    public static void main(String[] args) {
        String greeting = "Hallo";

        String greeting2;
        greeting2 = "Hallo";


        System.out.print(greeting);
        System.out.println(greeting);

        int a = 10;
        System.out.println("Text1: " + a);
        a = a + 2;

        System.out.println("Text2: " + a);

        a += 2;

        System.out.println("Der Wert von a ist: " + a);

        int x = 201;

        x = x / 10;

        System.out.println("X: " + x);

        int mod1 = 23 % 5;
        System.out.println("Mod: " + mod1);

        int mod2 = 3 % 5;
        System.out.println("Mod2: " + mod2);

        char c = 'a' ;
        System.out.println(c);
        System.out.println((int) c);

        boolean b = true;

        for (int i = 0; i <= 10; i++) {
            System.out.println("I: " + i);
        }

        System.out.println("---");

        int i = 0;
        while (i <= 10) {
            System.out.println("I: " + i);
            i = i + 1;
        }
        System.out.println("---");
        add(10, 20);

        System.out.println(add(10, 20));

        int d = add(10, 20);
        d--;
        System.out.println(d);

        System.out.println("---");

        printTextLn(11,"-");
        printText(3, "+");
        System.out.print("Hallo");
        printTextLn(3, "+");
        printTextLn(11, "-");

        System.out.println("---");

        printXLn(100);
        printXLn(10);
        printXLn(0);
        printXLn(10);
        printXLn(11);
        printXLn(10);
        printX(10);

        System.out.println("Triangle");
        printTopBottomLeftTriangle(15);

        System.out.println("Pyramide");
        printPyramide(15);
        System.out.println("Tippi aka. Zelt");
        printTippi(5);

        System.out.println("Tipi generator von 1 bis 100");
        for (int j = 1; j <= 15; j++) {
            printTippi(j);
        }
    }

    public static int add(int a, int b) {
        int c = a + b;
        return c;
    }

    public static void printText(int count, String text) {
        for (int i = 0; i < count; i++) {
            System.out.print(text);
        }
    }

    public static void printTextLn(int count, String text) {
        printText(count, text);
        System.out.println();
    }

    public static void printX(int count) {
        printText(count, "x");
    }

    public static void printXLn(int count) {
        printTextLn(count, "x");
    }

    public static void printTopBottomLeftTriangle(int height) {
        for (int i = 0; i < height; i++) {
            printTextLn(i+1, "X");
        }
    }

    public static void printPyramide(int height) {
        int pyramidenX = 1;
        int spaces = height;
        for (int i = 0; i < height; i++) {
            printText(spaces, " ");
            printTextLn(pyramidenX, "X");

            pyramidenX = pyramidenX + 2;
            spaces = spaces -1;
        }
    }

    public static void printTippi(int height) {
        int pyramidenX = 1;
        int spaces = height;
        for (int i = 0; i < height; i++) {
            if(i == 0) {
                //Oberteil
                printText(spaces, " ");
                System.out.println("X");
            } else if(i == height -1 ) {
                //Unterteil
                System.out.print(" ");
                printTextLn(height * 2 -1, "X");
            } else {
                //Mittelteil ist richtig
                printText(spaces, " ");
                System.out.print("X");
                printText(pyramidenX - 2, " ");
                System.out.println("X");
            }

            pyramidenX = pyramidenX + 2;
            spaces = spaces -1;
        }
    }
}
