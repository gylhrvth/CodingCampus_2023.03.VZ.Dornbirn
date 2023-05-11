package joachim.week10.model;

import java.util.List;
import java.util.Vector;

public class Server {
    private String name;
    private List<Food> order;
    private List<Food> allorder;

    public Server(String name) {
        this.name = name;
    }

    public void addFood(Food f) {
        order.add(f);
    }

    public void addAllorder(List<Food> f) {
        if (f != null) {
            allorder.addAll(f);
        }
    }

    public List<Food> getAllorder() {
        return allorder;
    }

    public List<Food> getOrder() {
        return order;
    }

    @Override
    public String toString() {
        return name;
    }
}