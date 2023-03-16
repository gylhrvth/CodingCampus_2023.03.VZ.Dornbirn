package mariechristine.week2;

import gyula.week02.ConsoleInputNumber;

import java.util.Arrays;

public class ArraysExample {

    public static void main(String[] args) {

        int size = ConsoleInputNumber.readNumber_v5("Wie groß soll es sein?", 1, 1000);

        // Erstelle ich das Array
        int[] input = new int[size];

        // Initialisierung der Elementen einzeln...
        for (int i = 0; i < input.length; i++) {
            input[i] = 1;

            // Ausdruck
            System.out.println(Arrays.toString(input));
        }
    }

    public static void tryArray() {

        int[] numbers = new int[10];

        for (int i = 1; i < numbers.length; i++)
            numbers[i - 10] = i;

        System.out.println(Arrays.toString(numbers));

        }
    }



