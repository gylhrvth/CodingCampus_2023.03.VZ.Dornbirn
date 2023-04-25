package sandro.week08.DatenKlasse;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PhotoCamErweiterung {
    private String objektive;
    private String model;
    private String hersteller;
    private double megapixel;
    private Date datum;
    private double size;
    private double memory;


    public PhotoCamErweiterung(String hersteller, String model, int megapixel, double size) {
        this.objektive = "Standart";
        this.model = model;
        this.hersteller = hersteller;
        this.megapixel = megapixel;
        this.datum = new Date(); // new SimpleDateFormat("yyyy.MM.dd hh:mm:ss");
        this.size = size*megapixel;
        this.memory = 10000;
    }


    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");

        return "PhotoCam Info Data\n"
                + "Picture was taken with objectice -->" + objektive + "\n"
                + "Picture was taken with a: " + model + " from: " + hersteller + "\n"
                + "Picture has: " + megapixel + " MegaPixel\n"
                + "Pictrue is: " + size + " MegaByte\n"
                + "Picture was taken at: " + sdf.format(datum);
    }

    public void setObjektive(String objektive) {
            this.objektive = objektive;
        }
    public void setMemory(int objektive) {
        this.memory = memory;
    }
}
