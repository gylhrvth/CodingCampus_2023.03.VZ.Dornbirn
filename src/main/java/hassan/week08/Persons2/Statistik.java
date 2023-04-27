package hassan.week08.Persons2;

public class Statistik {
    private int minAge;
    private int maxAge;
    private double avgAge;
    private int minWeight;
    private int maxWeight;
    private double avgWeight;
    private int minHeight;
    private int maxHeight;
    private double avgHeight;

    public Statistik(int minAge, int maxAge, double avgAge, int minWeight, int maxWeight, double avgWeight, int minHeight, int maxHeight, double avgHeight) {
        this.minAge = minAge;
        this.maxAge = maxAge;
        this.avgAge = avgAge;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.avgWeight = avgWeight;
        this.minHeight = minHeight;
        this.maxHeight = maxHeight;
        this.avgHeight = avgHeight;
    }

    public int getMinAge() {
        return minAge;
    }

    public int getMaxAge() {
        return maxAge;
    }

    public double getAvgAge() {
        return avgAge;
    }

    public int getMinWeight() {
        return minWeight;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public double getAvgWeight() {
        return avgWeight;
    }

    public int getMinHeight() {
        return minHeight;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public double getAvgHeight() {
        return avgHeight;
    }

    @Override
    public String toString() {
        return "Statistik " + "\n" +
                "MinAge    : " + minAge + "\n" +
                "MaxAge    : " + maxAge + "\n" +
                "AvgAge    : " + avgAge + "\n" +
                "MinWeight : " + minWeight + "\n" +
                "MaxWeight : " + maxWeight + "\n" +
                "AvgWeight : " + avgWeight + "\n" +
                "MinHeight : " + minHeight + "\n" +
                "MaxHeight : " + maxHeight + "\n" +
                "AvgHeight : " + avgHeight +"\n"
                ;
    }
}
