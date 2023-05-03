package eric.week09;

public class Sandbox {
    public static void main(String[] args) {

        functionWithManyParameters(3, "Dolly", "Marco", "Polo", "Bla bla", "World", "Doo-doo");
    }


    public static void functionWithManyParameters(int count, String... name){
        for (int i = 0; i < count; i++) {
            for (String n : name) {
                System.out.println("Hello " + n + "!");
            }
        }
    }
}
