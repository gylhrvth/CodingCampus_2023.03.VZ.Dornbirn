package joachim.week08.Photoapparat2;

public class Objectiv {
    private String hersteller;
    private String model;
    private int brennweitemax;
    private int brennweitemin;
    private Objectiv objectiv;

    public Objectiv(String hersteller, String model, int brennweitemax, int brennweitemin) {
        this.hersteller = hersteller;
        this.model = model;
        this.brennweitemax = brennweitemax;
        this.brennweitemin = brennweitemin;
    }

    @Override
    public String toString() {
        return hersteller + "  " + model + " with " + brennweitemax + " to " + brennweitemin  +"Brennweite";
    }
}