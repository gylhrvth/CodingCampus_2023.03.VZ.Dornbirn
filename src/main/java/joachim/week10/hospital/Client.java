package joachim.week10.hospital;

public class Client {
    private String name;

    public Client(String name) {
        this.name = name;
    }

    public static String createNames(String name, int amount) {
        name += amount;
        return name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
