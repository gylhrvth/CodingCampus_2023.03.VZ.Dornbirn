package sandro.week13.database.tables;

public class KundenKonto {

    private long konto_kontoNummerFK;
    private long kunden_kundenNummerFK;
    private String rolle;

    public long getKonto_kontoNummerFK() {
        return konto_kontoNummerFK;
    }

    public void setKonto_kontoNummerFK(long konto_kontoNummerFK) {
        this.konto_kontoNummerFK = konto_kontoNummerFK;
    }

    public long getKunden_kundenNummerFK() {
        return kunden_kundenNummerFK;
    }

    public void setKunden_kundenNummerFK(long kunden_kundenNummerFK) {
        this.kunden_kundenNummerFK = kunden_kundenNummerFK;
    }

    public String getRolle() {
        return rolle;
    }

    public void setRolle(String rolle) {
        this.rolle = rolle;
    }

    @Override
    public String toString() {
        return "KundenKonto{" +
                "konto_kontoNummerFK=" + konto_kontoNummerFK +
                ", kunden_kundenNummerFK=" + kunden_kundenNummerFK +
                ", role='" + rolle + '\'' +
                '}';
    }
}
