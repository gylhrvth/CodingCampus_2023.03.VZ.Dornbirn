package joachim.week09.zoo;

public class Food {
    private float cost;
    private String unit;
    private String name;

    public Food(String name, float cost, String unit) {
        this.name = name;
        this.cost = cost;
        this.unit = unit;
    }

    public String getName() {
        return name;
    }

    public String getUnit() {
        return unit;
    }

    public float getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return name;
    }
}
