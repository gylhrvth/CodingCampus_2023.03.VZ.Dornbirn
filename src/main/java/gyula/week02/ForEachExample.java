package gyula.week02;

public class ForEachExample {
    public static void main(String[] args) {
        String[] tnListe = new String[]{"Marie", "Joachim", "Benni", "Sandro", "Aygün", "Mert", "Rick", "Hassan", "Lukas", "Gyula", "Svitlana"};

        for (String name : tnListe) {
            System.out.println(name);
        }
        System.out.println("========================================");
        for (int i = 0; i < tnListe.length; i++) {
            String name = tnListe[i];

            System.out.println(name);
        }
    }
}
