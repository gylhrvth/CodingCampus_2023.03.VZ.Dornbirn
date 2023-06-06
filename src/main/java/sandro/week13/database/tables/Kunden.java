package sandro.week13.database.tables;

public class Kunden {
    private long kundenNummer;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getKundenNummer() {
        return kundenNummer;
    }

    public void setKundenNummer(long kundenNummer) {
        this.kundenNummer = kundenNummer;
    }

    @Override
    public String toString() {
        return "Kunden{" +
                "kundenNummer=" + kundenNummer +
                ", name='" + name + '\'' +
                '}';
    }
}
