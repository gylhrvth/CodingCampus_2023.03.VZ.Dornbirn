package benjamin.week04;

import javax.swing.*;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class CreateStrings {
    public static void main(String[] args) {

        String[] name = createNames();
        printnames(name);

//        bubbleSortAscending(name);
//        printnames(name);
//
//        bubbleSortDescending(name);
//        printnames(name);
//
//        printNamesLengthAsc(name);
//        printnames(name);
//
//        printNamesLengthDsc(name);
//        printnames(name);
//
//        printBubbleSortTrueOrFalse(name, true);
//        printnames(name);
//        printBubbleSortTrueOrFalse(name, false);
//        printnames(name);

        printChracterIndex(name, 4);
        printnames(name);

    }


    public static String[] createNames() {
        return new String[]{"Joachim", "Mert", "Eric", "Marie Christine", "Benjamin", "Sandro", "Aygün", "Hassan", "Svitlana", "Lukas", "Gyula"};
    }

    public static void printnames(String[] dim) {
        for (int i = 0; i < dim.length; i++) {
            System.out.print(dim[i] + " ");
        }
        System.out.println();
    }

    public static void printNamesLengthAsc(String[] dim) {
        for (int i = 0; i < dim.length; i++) {
            for (int j = 0; j < dim.length - i - 1; j++) {
                if (dim[j].length() > (dim[j + 1]).length()) {
                    String temp = dim[j];
                    dim[j] = dim[j + 1];
                    dim[j + 1] = temp;
                }
            }
        }
    }

    public static void printNamesLengthDsc(String[] dim) {
        for (int i = 0; i < dim.length; i++) {
            for (int j = 0; j < dim.length - i - 1; j++) {
                if (dim[j].length() < (dim[j + 1]).length()) {
                    String temp = dim[j];
                    dim[j] = dim[j + 1];
                    dim[j + 1] = temp;
                }
            }
        }
    }

    public static void printBubbleSortTrueOrFalse(String[] dim, boolean asc) {
        for (int i = 0; i < dim.length; i++) {
            for (int j = 0; j < dim.length - i - 1; j++) {
                if ((dim[j].compareTo(dim[j + 1]) > 0) == asc) {
                    String temp = dim[j];
                    dim[j] = dim[j + 1];
                    dim[j + 1] = temp;
                }
            }
        }
/*
        if (asc){
            bubbleSortAscending(dim);
        } else {
            bubbleSortDescending(dim);
        }
 */
    }

    public static void printChracterIndex(String[] dim, int index) {
        for (int i = 0; i < dim.length; i++) {
            for (int j = 0; j < dim.length - i - 1; j++) {
                //mit chars wäre es evtl. übersichtlicher ausprobieren
                if ((index >= dim[j].length()) ||
                    (index < dim[j + 1].length() && dim[j].charAt(index) > dim[j + 1].charAt(index))) {
                    String temp = dim[j];
                    dim[j] = dim[j + 1];
                    dim[j + 1] = temp;
                }
            }
        }
    }

    public static void bubbleSortAscending(String[] dim) {
        for (int i = 0; i < dim.length; i++) {
            for (int j = 0; j < dim.length - i - 1; j++) {
                if (dim[j].compareTo(dim[j + 1]) > 0) {
                    String temp = dim[j];
                    dim[j] = dim[j + 1];
                    dim[j + 1] = temp;
                }
            }
        }

    }

    public static void bubbleSortDescending(String[] dim) {
        for (int i = 0; i < dim.length; i++) {
            for (int j = 0; j < dim.length - i - 1; j++) {
                if (dim[j].compareTo(dim[j + 1]) < 0) {
                    String temp = dim[j];
                    dim[j] = dim[j + 1];
                    dim[j + 1] = temp;
                }

            }

        }
    }

}
