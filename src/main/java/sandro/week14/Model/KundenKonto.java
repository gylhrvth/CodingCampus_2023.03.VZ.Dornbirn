package sandro.week14.Model;

public class KundenKonto {

    private Konto kontoNummer;
    private Kunden kundenNummer;
    private String rolle;

    public KundenKonto(Konto kontoNummer, Kunden kundenNummer, String rolle) {
        this.kontoNummer= kontoNummer;
        this.kundenNummer= kundenNummer;
        this.rolle = rolle;
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
                "kontoNummer=" + kontoNummer +
                ", kundenNummer=" + kundenNummer +
                ", rolle='" + rolle + '\'' +
                '}';
    }
}
