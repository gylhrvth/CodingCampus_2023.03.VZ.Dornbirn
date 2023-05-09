package sandro.week10.Museum;

public class Main {
    public static void main(String[] args) {

        Gang eingang = new Gang("Eingang");
        Museum pinakothek = new Museum("Pinakothek", "von 8:00 bis 18:00", eingang);




        Zeichen kreuz = new Zeichen("Kreuz","Israel",2020,1.3,"Holz");
        Zeichen monolith = new Zeichen("Monolith","Afrika",4703,10.5,"Stein");

        Gemälde monaLisa = new Gemälde("Mona Lisa","Italien",250,5.5,"Portrait","Ölgemälde");
        Gemälde derSchrei = new Gemälde("Der Schrei","Norwegen",140,3.5,"Expressionismus","Pastell");

        Statue david = new Statue("David", "Italien",560,4.7,"Marmor", "Skulptur");
        Statue david2 = new Statue("David", "Italien",560,4.7,"Marmor", "Skulptur");

        Kunstobjekt kunst = new Kunstobjekt("Kunst", "Deutschland", 17,0.5,"ModerneKunst");
        Kunstobjekt kunst2 = new Kunstobjekt("Kunst", "Deutschland", 17,0.5,"ModerneKunst");


        Gang korridor = new Gang("Hauptkorridor");

        AusstellungsRaum raum1 = new AusstellungsRaum("raum1");
        AusstellungsRaum raum2 = new AusstellungsRaum("raum2");
        AusstellungsRaum raum3 = new AusstellungsRaum("raum3");
        AusstellungsRaum raum4 = new AusstellungsRaum("raum4");
        AusstellungsRaum raum5 = new AusstellungsRaum("raum5");
        AusstellungsRaum raum6 = new AusstellungsRaum("raum6");
        AusstellungsRaum raum7 = new AusstellungsRaum("raum7");
        AusstellungsRaum raum8 = new AusstellungsRaum("raum8");

        eingang.addTuerZuRaum(korridor);
        korridor.addTuerZuRaum(raum1);
        korridor.addTuerZuRaum(raum2);
        korridor.addTuerZuRaum(raum3);
        korridor.addTuerZuRaum(raum4);
        korridor.addTuerZuRaum(raum5);
        korridor.addTuerZuRaum(raum8);
        raum1.addTuerZuRaum(raum2);
        raum2.addTuerZuRaum(raum3);
        raum5.addTuerZuRaum(raum6);
        raum6.addTuerZuRaum(raum7);
        raum7.addTuerZuRaum(raum8);

        System.out.println();
    }
}
