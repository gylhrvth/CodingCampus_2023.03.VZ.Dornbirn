package gyula.week08;

import java.util.ArrayList;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Integer[] arr = new Integer[20];
        Vector<Integer> data = new Vector<>();

        data.add(123);
        data.add(34);
        data.add(5);
        data.add(15);
        System.out.println(data);
        data.add(0, 7);
        System.out.println(data);

        System.out.println(data.elementAt(3));
        try {
            System.out.println(data.elementAt(7));
        } catch (IndexOutOfBoundsException ioobe){
            System.out.println(ioobe.toString());
        }

        data.set(0, 100);
        System.out.println(data);

        System.out.println("Size: " + data.size());
        System.out.println("Capacity: " + data.capacity());

        for (int i = 0; i < 25; i++) {
            data.add(i);
            System.out.println("Size: " + data.size() + " Capacity: " + data.capacity());
        }

        System.out.println(data);
        data.remove(Integer.valueOf(1));
        System.out.println(data);
        data.remove(0);
        System.out.println(data);

        System.out.println("Ist ein 17-er da? " + data.contains(17));
        System.out.println("Wo ist mein 34-er? " + data.indexOf(34));

        System.out.println("Mit for-i");
        for (int i = 0; i < data.size(); i++) {
            System.out.print(data.elementAt(i) + " ");
        }
        System.out.println();

        System.out.println("mit For-Each");
        for (Integer value: data){
            System.out.print(value + " ");
        }
        System.out.println();

        Integer[] testArray = data.toArray(new Integer[0]);

        System.out.println("first: " + data.firstElement());
        System.out.println("last : " + data.lastElement());

        System.out.println("=======================");
        ArrayList<String> data2 = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            data2.add("Hello World " + i + "!");
        }
        System.out.println(data2);
        for (String message: data2) {
            System.out.println("Message: " + message);
        }
    }
}
