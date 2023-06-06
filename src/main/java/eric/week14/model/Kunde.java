package eric.week14.model;

public class Kunde {
    private int KundenNr;
    private String name;

    public Kunde(int kundenNr, String name) {
        this.KundenNr = kundenNr;
        this.name = name;
    }

    public int getKundenNr() {
        return KundenNr;
    }

    @Override
    public String toString() {
        return "Kunde{" +
                "KundenNr=" + KundenNr +
                ", name='" + name + '\'' +
                '}';
    }
}
