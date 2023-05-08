package sandro.week10.car;

public class SportCar extends Car {
    private String startNummer;

    public SportCar(String producer, String model, String startNummer){
        super(producer, model);
        this.startNummer = startNummer;
    }

    public void start(){
        System.out.println("SEHR LAUT start...");
        super.start();
    }
}
