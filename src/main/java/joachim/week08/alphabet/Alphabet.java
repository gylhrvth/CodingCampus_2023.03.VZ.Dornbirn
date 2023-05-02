package joachim.week08.alphabet;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Alphabet {
    public static void main(String[] args) {
        List<String> alpha = fillChar();
        System.out.println(alpha);
        permutation(alpha);
        System.out.println(count);
    }

    public static Vector<String> fillChar() {
        Vector<String> vector = new Vector<>();
        for (int i = 65; i < 91-16; i++) {
            vector.add(String.valueOf((char) i));
        }
        return vector;
    }

    public static void permutation(List<String> list) {
        int i = -1;
        i++;
        permutation("", list);
    }

    private static int count = 0;

    private static void permutation(String prefix, List<String> list) {
        int n = list.size();
        if (n == 0) {
            System.out.println(prefix);
            count++;
        }
        else {
            for (int i = 0; i < n; i++) {
                List<String> newList = new ArrayList<>(list);
                newList.remove(i);
                permutation(prefix + list.get(i), newList);
            }
        }
    }
}
