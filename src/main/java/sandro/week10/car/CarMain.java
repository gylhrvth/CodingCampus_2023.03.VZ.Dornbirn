package sandro.week10.car;

import java.util.Vector;

public class CarMain {
    public static void main(String[] args) {
        //Car c = new Car();
        Vector<Car> carsInGarage = new Vector<>();

        carsInGarage.add(new Pickup("Opel", "Corsa"));
        carsInGarage.add(new SportCar("Porsche", "Kayan", "15"));

        for (Car c: carsInGarage){
            //c.start();
            System.out.println(c + " ist ein " + c.getClass().getSimpleName());
        }
    }
}
