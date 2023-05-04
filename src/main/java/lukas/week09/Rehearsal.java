package lukas.week09;

public class Rehearsal {
    public static void main(String[] args) {

        Zoo zoo = new Zoo("Alpenzoo");
        zoo.populate();
        System.out.println("Simulating one year");
        for (int i = 0; i < 365; i++) {
            zoo.beforeSimulate();
            zoo.simulate();
        }
    }
}
