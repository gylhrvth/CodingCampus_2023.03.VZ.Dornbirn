package mert.week08.Personen2;

import java.util.ArrayList;
import java.util.List;

public class Persooooon2Main {
    public static void main(String[] args) {
        Personnnn2 werte = new Personnnn2("Mert", 180, 26, 90);

        List<Personnnn2> persons = arrayList();                  //keine Fehlermeldung


        CalculateMix asdf = CalculateMix.calculate(arrayList());
        printList(arrayList());
        System.out.println("MinMaxAvg");
        System.out.println("------------");
        System.out.println(asdf);
    }

    public static List<Personnnn2> arrayList() {
        List<Personnnn2> arraylist = new ArrayList<>(20);
        arraylist.add(new Personnnn2("Lukas", 180, 30, 80));
        arraylist.add(new Personnnn2("Eric", 180, 24, 100));
        arraylist.add(new Personnnn2("Joachim", 180, 24, 90));
        arraylist.add(new Personnnn2("Marie", 180, 24, 85));
        arraylist.add(new Personnnn2("Beni", 180, 24, 75));
        arraylist.add(new Personnnn2("Sandor", 180, 24, 80));
        arraylist.add(new Personnnn2("Aygün", 180, 24, 70));
        arraylist.add(new Personnnn2("Hassan", 180, 24, 80));
        arraylist.add(new Personnnn2("Gyula", 180, 24, 80));
        return arraylist;
    }

    public static void printList(List<Personnnn2> arr) {
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }

    }
}
