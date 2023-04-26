package hassan.week08.Photo;

public class PhotoAbarrat {

    private int brennweiteMin;
    private int brennweiteMax;
    private String model;
    private String hersteller;
    private int megapixel;

    public PhotoAbarrat(int brennweiteMin, int brennweiteMax, String model, String hersteller, int megapixel) {
        this.brennweiteMin = brennweiteMin;
        this.brennweiteMax = brennweiteMax;
        this.model = model;
        this.hersteller = hersteller;
        this.megapixel = megapixel;
    }

    public int getBrennweiteMin(){
        return brennweiteMin;
    }

    public void setBrennweiteMin(int brennweiteMin){
        this.brennweiteMin = brennweiteMin;
    }
    public int getBrennweiteMax(){
        return brennweiteMax;
    }

    public void setBrennweiteMax(int brennweiteMax){
        this.brennweiteMax = brennweiteMax;
    }

    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model = model;
    }

    public String getHersteller(){
        return hersteller;
    }

    public void setHersteller(String hersteller){
        this.hersteller = hersteller;
    }

    public int getMegapixel(){
        return megapixel;
    }

    public void setMegapixel(int megapixel){
        this.megapixel = megapixel;
    }

    public void takePhoto(){
        System.out.println("KLICK!! Das Foto wurde geschossen.");
    }
    @Override
    public String toString(){
        return "FOTOAPPARAT \n"+
                "BrennweiteMin: " + brennweiteMin+ "\n"+
                "BrennweiteMax: " + brennweiteMax+ "\n"+
                "Model        : " + model + "\n"+
                "Hersteller   : " + hersteller + "\n"+
                "Megapixel    : " + megapixel+ "\n"
                ;

    }

}
