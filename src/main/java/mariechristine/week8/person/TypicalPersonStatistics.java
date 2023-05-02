package mariechristine.week8.person;

import mariechristine.week8.MinMaxAvg;

import java.util.List;

public class TypicalPersonStatistics {
    private int minHeight;
    private int maxHeight;
    private double averageHeight;

    private double minWeight;
    private double maxWeight;
    private double averageWeight;

   private int minAge;
   private int maxAge;
   private int averageAge;

    public static TypicalPersonStatistics calculate(List<TypicalPerson> persons) {
        TypicalPersonStatistics result = new TypicalPersonStatistics();




        return result;
    }

    public int getMinHeight() {
        return minHeight;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public double getAverageHeight() {
        return averageHeight;
    }

    public double getMinWeight() {
        return minWeight;
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public double getAverageWeight() {
        return averageWeight;
    }

    public int getMinAge() {
        return minAge;
    }

    public int getMaxAge() {
        return maxAge;
    }

    public int getAverageAge() {
        return averageAge;
    }
}
