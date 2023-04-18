package mariechristine.week2;

import java.util.Arrays;
import java.util.Random;

public class ArraysNew {

    static Random ran = new Random();

    public static void main(String[] args) {

        int size = Ratespiel.validInput("Wie groß soll dein Array sein?", 1, 10);

/*        int[] arr = numbersIncreasing(size); //Damit der Ausdruck nicht in der Methode erfolgt, wird ein array initialisiert und der Methode gleichgesetzt
        System.out.println(Arrays.toString(arr));

        int[] arr2 = numbersDecreasing(size);
        System.out.println(Arrays.toString(arr2));

        int[] arrCopy = makeACopy(arr);
        System.out.println(Arrays.toString(arrCopy));
*/
        int[] ranArray = randomNumber(size);
        System.out.println(Arrays.toString(ranArray));

//        int random = ran.nextInt(101);
//        int[] ranNumArray = crazyRange(random);
//        System.out.println(Arrays.toString(ranNumArray));


        ranNumForEach(ranArray);
        ranNumForI(ranArray);
        crazyRange(size);

        System.out.println("Over 30: " + countOver30(ranArray));



    }

/*        public static int[] numbersIncreasing(int size) {
            System.out.println("Numbers Increasing");
            int[] arr = new int[size];                  //Initialisierung eines neuen Arrays bei dem der User die Größe definiert
            for (int i = 0; i < arr.length; i++) {      //Größe des Arrays bsp. 3 = [0, 0, 0]
                arr[i] = i + 1;                         //Hier wird definiert welche Zahlen im Array stehen; arr[0] = 0 + 1, arr[1] = 1 + 1 ... [1, 2, 3]
            }
            //System.out.println(Arrays.toString(arr));//Ausdruck soll bestenfalls nicht in der Methode stehen
            return arr;
        }

        public static int[] numbersDecreasing(int size) {
            System.out.println("Numbers Decreasing");
            int[] arr2 = new int[size];
            for (int i = 0; i < arr2.length; i++) {
                arr2[i] = arr2.length - i;
            }
            //System.out.println(Arrays.toString(arr2));
            return arr2;
        }

        public static int[] makeACopy(int[] original) { //Da eine Kopie vom Original Array gemacht werden soll, braucht es hier auch ein int[]
            System.out.println("Make a Copy");
            int[] arrCopy = new int[original.length];
            for (int i = 0; i < original.length; i++) {
                arrCopy[i] = original[i];
            }

            return original;
        }

*/    public static int[] randomNumber(int size) {
        System.out.println("Random Number Array mit definierter Größe");
        int[] ranArray = new int[size];
        for (int i = 0; i < ranArray.length; i++) {
            ranArray[i] = ran.nextInt(101);

        }
//        for (int ranArrayPrint : ranArray) {
//            System.out.println("Print mit For Each-Schleife: " + ranArrayPrint);
//        }

        return ranArray;
    }

    public static int[] crazyRange(int random) {
        System.out.println("Crazy Range");
        int[] ranNumArray = new int[random];
        for (int i = 0; i < ranNumArray.length; i++) {
            ranNumArray[i] = ran.nextInt(101) - 50;

        }
        for (int ranNumArrayPrint : ranNumArray) {
            System.out.println("Print mit foreach-Schleife: " + ranNumArrayPrint);
      }

        return ranNumArray;
    }

    public static void ranNumForEach(int[] size) {
        System.out.println("Random Number ForEach-Schleife");
        System.out.print("[");
        boolean first = true;
        for (int printRanArr: size) {
            if (!first) {
                System.out.print(", ");
            }
            System.out.print(printRanArr);
            first = false;
        }
        System.out.println("]");
    }

    public static void ranNumForI(int[] size) {
        System.out.println("Random Number ForI-Schleife");
        System.out.print("[");
        for (int i = 0; i < size.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            if (i % 2 == 1)
            System.out.print(size[i]);
        }
        System.out.println("]");
    }

    public static int countOver30(int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 30) {
                ++result;//result = result + 1
            }
        }
        return result;
    }
}
