package eric.week04;

public class ExerciseForString {
    public static void main(String[] args) {
        String[] names = new String[]{"Joachim", "Mert", "Eric", "Marie Christine", "Benjamin", "Sandro", "Aygün", "Hassan", "Svitlana", "Lukas", "Gyula"};
        String[] namesAlphabetical = new String[]{"Joachim", "Mert", "Eric", "Marie Christine", "Benjamin", "Sandro", "Aygün", "Hassan", "Svitlana", "Lukas", "Gyula"};
        String[] namesLength = new String[]{"Joachim", "Mert", "Eric", "Marie Christine", "Benjamin", "Sandro", "Aygün", "Hassan", "Svitlana", "Lukas", "Gyula"};

        bubbleSortAlphabetical(namesAlphabetical);
        bubbleSortNameLength(namesLength);

        System.out.println("Aufgabe: Bubblesort mit Strings.");
        for (String i : namesAlphabetical) {
            System.out.print("[" + i + "] ");
        }
        for (String i : namesLength) {
            System.out.print("[" + i + "] ");
        }

        System.out.println();
        System.out.println("--------------------");

        System.out.println("Aufgabe: Bubblesort mit Strings Extended");
        boolean decision = false;
        bubbleSortExtended(names, decision);
        for (String i : names) {
            System.out.println("[" + i + "]");
        }

        System.out.println();
        System.out.println("--------------------");

        System.out.println("Aufgabe: Bubblesort mit Strings und Character Index");
        bubbleSortCharIndex(names, 4);
        for (String i : names) {
            System.out.println("[" + i + "]");
        }
    }

    public static void bubbleSortAlphabetical(String[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].compareToIgnoreCase(arr[j + 1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void bubbleSortNameLength(String[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].length() < arr[j + 1].length()) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void bubbleSortExtended(String[] arr, boolean decision) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                int compareResult = arr[j].compareToIgnoreCase(arr[j + 1]);
                if (decision) {
                    if (compareResult > 0) {
                        String temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }
    }

    public static void bubbleSortCharIndex(String[] arr, int letterIndex) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j+ 1].length() <= letterIndex ||
                        (arr[j].length() > letterIndex &&
                        (arr[j].charAt(letterIndex) > arr[j + 1].charAt(letterIndex))))
                {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
