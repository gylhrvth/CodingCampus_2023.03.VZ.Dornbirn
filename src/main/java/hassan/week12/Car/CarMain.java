package hassan.week12.Car;

import hassan.week12.Car.Car;

import java.util.ArrayList;
import java.util.List;

public class CarMain {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        cars.add(new Car("BMW", "M4", 150, 40, Car.Antriebstart.BENZIN, 1400));
        cars.add(new Car("Mercedes", "C63s", 120, 60, Car.Antriebstart.BENZIN, 1890));


        while (true) {
            for (Car car : cars) {
                System.out.println("Fahrzeug: " + car.getHersteller() + " " + car.getModell());
                System.out.println("Gesamte gefahrene Strecke: " + car.getDrivenDistance() + " km");

                int distance = 200; // Annahme: Auto fährt immer 200 km pro Durchlauf

                if (car.getTankinhalt() <= 0) {
                    System.out.println("Warnung: Tank ist leer. Tanken...");
                    car.refillTank(30); // Annahme: Auto wird immer mit 30 Litern aufgefüllt
                }

                if (car.getTankinhalt() > 0) {
                    int drivenDistance = car.drive(distance);
                    System.out.println("Aktuelle gefahrene Strecke: " + drivenDistance + " km");
                }

                System.out.println("------------------------");
            }
        }
    }
}

