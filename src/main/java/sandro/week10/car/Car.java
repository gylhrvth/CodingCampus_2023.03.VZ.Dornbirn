package sandro.week10.car;

public abstract class Car {
    private String producer;
    private String model;

    public Car(String producer, String model){
        this.producer = producer;
        this.model = model;
    }

    public void start(){
        System.out.println(producer + " / " + model + " starts.");
    }

    @Override
    public String toString() {
        return model;
    }
}
