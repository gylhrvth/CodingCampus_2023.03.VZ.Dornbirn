package hassan.week08.PhotoNew;

public class Lens {
    private String hersteller;
    private int brennweite;

    public Lens(String hersteller,int brennweite){
        this.brennweite = brennweite;
        this.hersteller = hersteller;
    }

    public String getHersteller() {
        return hersteller;
    }

    public int getBrennweite() {
        return brennweite;
    }

    public void setHersteller(String hersteller) {
        this.hersteller = hersteller;
    }

    public void setBrennweite(int brennweite) {
        this.brennweite = brennweite;
    }

    @Override
    public String toString(){
        return "Objektiv "+
                hersteller;
    }
}
