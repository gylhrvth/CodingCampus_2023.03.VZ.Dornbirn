package hassan.week08.Photo;

public class Objektiv {
    private String hersteller;
    private int brennweite;

    public Objektiv(String hersteller, int brennweite) {
        this.hersteller = hersteller;
        this.brennweite = brennweite;
    }

    public String getHersteller(){
        return hersteller;
    }

    public int getBrennweite(){
        return brennweite;
    }

    public void setHersteller(String hersteller){
        this.hersteller = hersteller;
    }

    public void setBrennweite(int brennweite){
        this.brennweite = brennweite;
    }

    @Override
    public String toString(){
        return "Objektiv"+
                "hersteller : " + hersteller + "\n" +
                "brennweite : " + brennweite + "\n";
    }
}
