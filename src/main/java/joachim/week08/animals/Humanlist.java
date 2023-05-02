package joachim.week08.animals;


import java.util.ArrayList;
import java.util.List;
public class Humanlist {
    public static void main(String[] args) {
        Human human = new Human("Dude", 22, 1.2, 75);
        Human human1 = new Human("Dudette", 21, 1.7, 65);
        Human human2 = new Human("Bubatz", 13, 1.4, 45);
        Human human3 = new Human("Bubette", 14, 1.5, 38);
        List<Human> humanStatistics = new ArrayList<>();

        humanStatistics.add(human);
        humanStatistics.add(human1);
        humanStatistics.add(human2);
        humanStatistics.add(human3);
        System.out.println("avg");
        System.out.println(avg(humanStatistics));
        System.out.println("max");
        System.out.println(max(humanStatistics));
        System.out.println("min");
        System.out.println(min(humanStatistics));
        System.out.println();

        System.out.println("WEIGHT");
        System.out.println(sort(humanStatistics, HumanSortBy.WEIGHT));
        System.out.println("HEIGHT");
        System.out.println(sort(humanStatistics, HumanSortBy.HEIGHT));
        System.out.println("AGE");
        System.out.println(sort(humanStatistics, HumanSortBy.AGE));
    }

    private static List sort(List<Human> list, HumanSortBy sortBy) {
        if (sortBy == HumanSortBy.WEIGHT) {
            //sortiere nach gewicht
            Human temp = null;
            for (int i = 0; i < list.size(); i++) {
                for (int j = 0; j < list.size() - 1; j++) {
                    if (list.get(j).getWeight() < list.get(j + 1).getWeight()) {
                        temp = list.get(j);
                        list.set(j, list.get(j + 1));
                        list.set(j + 1, temp);
                    }
                }
            }
        } else if (sortBy == HumanSortBy.HEIGHT) {
            //sortiere nach größe
            Human temp = null;
            for (int i = 0; i < list.size(); i++) {
                for (int j = 0; j < list.size() - 1; j++) {
                    if (list.get(j).getHeight() < list.get(j + 1).getHeight()) {
                        temp = list.get(j);
                        list.set(j, list.get(j + 1));
                        list.set(j + 1, temp);
                    }
                }
            }
        } else if (sortBy == HumanSortBy.AGE) {
            //sortiere nach alter
            Human temp = null;
            for (int i = 0; i < list.size(); i++) {
                for (int j = 0; j < list.size() - 1; j++) {
                    if (list.get(j).getAge() < list.get(j + 1).getAge()) {
                        temp = list.get(j);
                        list.set(j, list.get(j + 1));
                        list.set(j + 1, temp);
                    }
                }
            }
        } else {
            //sortiere nichts
        }
        return list;
    }

    public static MinMaxAvg avg(List<Human> list) {
        double avgHeight = 0;
        int avgAge = 0;
        int avgWeight = 0;
        for (Human human : list) {
            avgHeight += human.getHeight();
        }
        avgHeight = avgHeight / list.size();

        for (Human human : list) {
            avgAge += human.getAge();
        }
        avgAge = avgAge / list.size();

        for (Human human : list) {
            avgWeight += human.getWeight();
        }
        avgWeight = avgWeight / list.size();

        return new MinMaxAvg(avgAge, avgHeight, avgWeight);
    }

    public static MinMaxAvg max(List<Human> list) {
        double maxHeight = 0;
        int maxAge = 0;
        int maxWeight = 0;
        for (Human human : list) {
            if (human.getHeight() > maxHeight) {
                maxHeight = human.getHeight();
            }
        }
        for (Human human : list) {
            if (human.getWeight() > maxWeight) {
                maxWeight = human.getWeight();
            }
        }
        for (Human human : list) {
            if (human.getAge() > maxAge) {
                maxAge = human.getAge();
            }
        }
        return new MinMaxAvg(maxAge, maxHeight, maxWeight);
    }

    public static MinMaxAvg min(List<Human> list) {
        double minHeight = 100;
        int minAge = 100;
        int minWeight = 100;
        for (Human human : list) {
            if (human.getHeight() < minHeight) {
                minHeight = human.getHeight();
            }
        }
        for (Human human : list) {
            if (human.getWeight() < minWeight) {
                minWeight = human.getWeight();
            }
        }
        for (Human human : list) {
            if (human.getAge() < minAge) {
                minAge = human.getAge();
            }
        }
        return new MinMaxAvg(minAge, minHeight, minWeight);
    }
}