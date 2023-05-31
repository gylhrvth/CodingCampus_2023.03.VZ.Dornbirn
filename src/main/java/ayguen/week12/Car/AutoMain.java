package ayguen.week12.Car;

import java.util.Random;

public class AutoMain {
    public static void main(String[] args) {
        Auto mercedes = new Auto("Mercedes", "E63 amg", 560, 90, "Benzin", 2189, 20.8);
        Auto mustang = new Auto("Ford", "Mustang", 466, 70, "Benzin", 1838, 19.6);
        mercedes.printCar();
        System.out.println();
        mustang.printCar();

        mustang.drive2(0);



    }
}
