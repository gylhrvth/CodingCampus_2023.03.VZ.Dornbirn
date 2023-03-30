package lukas.week04.day4;

public class Rehearsal {
    public static void main(String[] args) {
        String text = "Rambina";

        System.out.println(text.length());

        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());

        System.out.println(text.replace('i', 'o'));

        String newText = text.replace('i', 'o');

        System.out.println(text);
        System.out.println(newText);

        String concatenatedString = text + newText;
        System.out.println(concatenatedString);

        char[] arr = text.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("---");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
        System.out.println("---");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[arr.length - 1 - i]);
        }
        System.out.println("---");

        String a = "Hallo";
        a = a + " wie gehts?";
        a = a + ", Sehr gut";
        System.out.println(a);

        String reversed = "";
        for (int i = 0; i < arr.length; i++) {
            reversed = reversed + arr[arr.length - i - 1];
        }
        System.out.println(reversed);

        System.out.println("---");
        reversed = "";
        for (int i = 0; i < arr.length; i++) {
            reversed = arr[i] + reversed;
        }
        System.out.println(reversed);

        System.out.println("---");
        char[] arr2 = text.toCharArray();
        for (int i = 1; i < arr2.length; i = i + 2) {
            System.out.println(arr2[i]);
        }
        System.out.println("---");

        for (int i = 0; i < arr2.length; i++) {
            if (i % 2 == 1) {
                System.out.println(arr2[i]);
            }
        }
        System.out.println("---");
        System.out.println("Ergebnis: " + indexOf("Alfons", 'l'));
        System.out.println("Ergebnis: " + indexOf("Alfons", 'A'));
        System.out.println("Ergebnis: " + indexOf("Alfons", 's'));
        System.out.println("Ergebnis: " + indexOf("Alfons", 'y'));

        int[] numbers = new int[]{1, 2, 5, 21, 1, 4, 1, 4, 5, 2, 6, 7, 56, 8, 1, 5, 3, 5, 234, 2, 4, 32, 7, 5, 46};

        System.out.println("Count of 1s in array is: " + count(numbers, 1));
        System.out.println("Count of NOT 1s in array is: " + countNot(numbers, 1));
    }

    public static int count(int[] arr, int number) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == number) {
                count++;
            }
        }
        return count;
    }

    public static int countNot(int[] arr, int number) {
        return arr.length - count(arr, number);
    }

    public static int indexOf(String text, char c) {
        char[] arr = text.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == c) {
                return i;
            }
        }
        return -1;
    }
}
