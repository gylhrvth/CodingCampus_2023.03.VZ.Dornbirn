package hassan.week08.Vector;

import java.util.Random;
import java.util.Vector;

public class RandomVector {

    public static void main(String[] args) {

        Vector<Integer> myVector = generateRandomVector();
        System.out.println(myVector);
    }

    public static Vector<Integer> generateRandomVector() {
        Vector<Integer> randomVector = new Vector<Integer>();
        Random rand = new Random();

        for (int i = 0; i < 100000000; i++) {
            int randomNum = rand.nextInt(2000);
            randomVector.add(randomNum);
        }

        return randomVector;
    }
}
