package gyula.week09.zoo;

public class Food {
    private String name;
    private String unit;
    private int pricePerUnitInCent;

    public Food(String name, String unit, int pricePerUnitInCent){
        this.name = name;
        this.unit = unit;
        this.pricePerUnitInCent = pricePerUnitInCent;
    }

    String getName() {
        return name;
    }

    String getUnit() {
        return unit;
    }

    int getPricePerUnitInCent() {
        return pricePerUnitInCent;
    }

    @Override
    public String toString() {
        return name;
    }

}
