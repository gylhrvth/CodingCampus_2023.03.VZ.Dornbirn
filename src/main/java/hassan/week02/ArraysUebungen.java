package hassan.week02;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class ArraysUebungen {

    static Random rand = new Random();

    public static void main(String[] args) {
        System.out.println("Halloooo");

        //Methoden Aufrufen
        int arrayspace = readArrayspace("Wie Groß willst du deine Array haben?");

        int[] countNumber1 = decreasingArray(arrayspace);
        int[] countNumber2 = increasingArray(arrayspace);
        int[] countNumber3 = makeacopy(countNumber2);

        int[] countNumber4 = randomArray(10);
        int[] crazyRange = crazyRange(arrayspace);
        int randSumme = randSumme(crazyRange);
        int[] random30 = randomzaehlen30(arrayspace);

        //Methoden Printen
        System.out.println("Aufgabe 1, Plus");
        System.out.println(Arrays.toString(countNumber2));

        System.out.println("-----------");

        System.out.println("Aufgabe 1, Minus");
        System.out.println(Arrays.toString(countNumber1));

        System.out.println("--------------------");

        System.out.println("Aufgabe Kopie (von erste aufgabe)");
        System.out.println(Arrays.toString(countNumber3));

        System.out.println("----------------------");

        System.out.println("Aufgabe Random fori schleife");
        System.out.println(Arrays.toString(countNumber4));

        System.out.println("======");

        System.out.println("Aufgabe Random ForEach schleife");
        for (int random : countNumber4) {
            System.out.print(random + " ");
        }

        System.out.println();
        System.out.println("Der 2te Wert ist : " + countNumber4[1] + " ");
        System.out.println("Der 5te Wert ist : " + countNumber4[4] + " ");
        System.out.println("Der 10te Wert ist : " + countNumber4[9] + " ");

        System.out.println("---------");

        System.out.println("Jede zweite wert anzeigen : ");
        for (int i = 0; i < countNumber4.length; i += 2) {
            System.out.print(countNumber4[i] + " ");
        }

        System.out.println();

        System.out.println("----------");

        System.out.println("Crazy Range");
        for (int crazy : crazyRange) {
            System.out.print(crazy + " ");
        }

        System.out.println();
        System.out.print("SUMME vom oberen array: ");
        System.out.println(randSumme);

        System.out.println("------------");

        System.out.println("Zahlen über 30 zählen");
        System.out.println(Arrays.toString(random30));
        int count = 0;
        for (int i = 0; i < random30.length; i++) {
            if (random30[i] > 30) {
                count = count + 1;
            }
        }

        System.out.println("Es sind " + count + " Zahlen über 30");
        System.out.println("-------------");
        System.out.println("Min, Max, Avg");
        int[] ranNum = random30;
        System.out.println(Arrays.toString(random30));

        int min = minNumber(ranNum);
        System.out.println("Minimum: " + min);
        System.out.println("--------");

        int max = maxNumber(ranNum);
        System.out.println("Maximum: " + max);
        System.out.println("--------");

        double avg = avgNumber(ranNum);
        System.out.println("Average: " + avg);
        System.out.println("----------");

        System.out.println("Zwei Demonsial Array");
        System.out.println(Arrays.toString(zweiDArray(arrayspace,arrayspace)));


    }

    public static int[] decreasingArray(int arrayspace) {
        int[] countNumber2 = new int[arrayspace];
        for (int i = 0; i < countNumber2.length; i++) {
            countNumber2[i] = arrayspace - i;
        }
        return countNumber2;
    }

    public static int[] increasingArray(int arrayspace) {
        int[] countNumber = new int[arrayspace];
        for (int i = 0; i < countNumber.length; i++) {
            countNumber[i] = 1 + i;
        }

        return countNumber;
    }

    public static int[] makeacopy(int[] arrayToCopy) {
        int[] result = new int[arrayToCopy.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = arrayToCopy[i];
        }
        return result;
    }

    public static int[] randomArray(int arrayspace) {
        int[] randomArray = new int[arrayspace];
        for (int i = 0; i < randomArray.length; i++) {
            int randomValue = rand.nextInt(101);
            randomArray[i] = randomValue;
        }
        return randomArray;
    }

    public static int[] crazyRange(int arrayspace) {
        int[] crazyRange = new int[arrayspace];
        for (int i = 0; i < crazyRange.length; i++) {
            int randRange = rand.nextInt(-50, 51);
            crazyRange[i] = randRange;
        }

        return crazyRange;
    }

    public static int[] randomzaehlen30(int arrayspace) {
        int[] random30 = new int[arrayspace];
        for (int i = 0; i < random30.length; i++) {
            int randomValue = rand.nextInt(101);
            random30[i] = randomValue;
        }

        return random30;
    }


    public static int randSumme(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int[] randomNumber(int size) {
        int[] ranNum = new int[size];
        for (int i = 0; i < size; i++) {
            ranNum[i] = rand.nextInt(101);
        }
        return ranNum;
    }

    public static int minNumber(int[] num) {
        int minNumbers = Integer.MAX_VALUE;
        for (int i : num) {
            if (i < minNumbers) {
                minNumbers = i;
            }
        }
        return minNumbers;
    }

    public static int maxNumber(int[] num) {
        int maxNumbers = Integer.MIN_VALUE;
        for (int i : num) {
            if (i > maxNumbers) {
                maxNumbers = i;
            }
        }
        return maxNumbers;
    }


    public static double avgNumber(int[] num) {
        int avgNumbers = 0;
        for (int i : num) {
            avgNumbers += i;
        }
        return (double) avgNumbers / num.length;
    }


    public static int [][] zweiDArray(int rows, int cols){

        int [][] array = new int [rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = (int) (Math.random() * 10);
            }
        }
        for (int i = 0; i <rows ; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array [i][j] + " ");
            }
            System.out.println();
        }
        return array;
    }


    public static int readArrayspace(String message) {
        Scanner sc = new Scanner(System.in);
        int value = 0;
        boolean valid = false;
        while (!valid) {
            System.out.println(message);
            try {
                String line = sc.nextLine();
                value = Integer.parseInt(line);
                if (value > 0) {
                    valid = true;
                } else {
                    System.out.println("die Zahl Muss positiv sein");
                }
            } catch (NumberFormatException nfe) {
                System.out.println("Das ist keine gültige ZAHL mein Lieber");
            }
        }

        return value;
    }


}






