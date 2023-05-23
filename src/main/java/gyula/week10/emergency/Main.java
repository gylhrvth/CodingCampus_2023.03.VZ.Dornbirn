package gyula.week10.emergency;

public class Main {
    public static void main(String[] args) {
        CallCenter cc = new CallCenter();

        cc.addRessource(new Ambulance("Red 1"));
        cc.addRessource(new Ambulance("Red 2"));


        for (int i = 0; i < 10; i++) {
            cc.call();
        }
    }
}
