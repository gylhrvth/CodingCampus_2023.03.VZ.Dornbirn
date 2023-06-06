package eric.week14.model;

public class KundenKonto {
    private int kontoNr;

    private int kundenNr;

    private String rolle;


    public KundenKonto(int kontoNr, int kundenNr, String inhaber){
        this.kontoNr = kontoNr;
        this.kundenNr = kundenNr;
        this.rolle = inhaber;
    }

    @Override
    public String toString() {
        return "KundenKonto{" +
                "kontoNr=" + kontoNr +
                ", kundenNr=" + kundenNr +
                ", rolle='" + rolle + '\'' +
                '}';
    }
}
