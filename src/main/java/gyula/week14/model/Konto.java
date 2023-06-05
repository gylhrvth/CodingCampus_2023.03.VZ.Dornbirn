package gyula.week14.model;

public class Konto {
    private int id;
    private String inhaber;
    private long kontostand;


    public Konto(int id, String inhaber, long kontostand){
        this.id = id;
        this.inhaber = inhaber;
        this.kontostand = kontostand;
    }

    public int getId() {
        return id;
    }

    public long getKontostand() {
        return kontostand;
    }

    public void setKontostand(long kontostand) {
        this.kontostand = kontostand;
    }

    @Override
    public String toString() {
        return "Konto{" +
                "id=" + id +
                ", inhaber='" + inhaber + '\'' +
                ", kontostand=" + kontostand +
                '}';
    }
}
