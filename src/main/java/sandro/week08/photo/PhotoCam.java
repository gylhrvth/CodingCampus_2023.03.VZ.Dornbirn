package sandro.week08.photo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PhotoCam {
    private int brennweite;
    private String model;
    private String hersteller;
    private double megapixel;
    private Date datum;
    private double size;


    public PhotoCam(String hersteller,String model, int megapixel, int size) {
        this.brennweite = 35;
        this.model = model;
        this.hersteller = hersteller;
        this.megapixel = megapixel;
        this.datum = new Date(); // new SimpleDateFormat("yyyy.MM.dd hh:mm:ss");
        this.size = size;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");

        return "PhotoCam Info Data\n"
                + "Picture was taken with focal length -->" + brennweite + "\n"
                + "Picture was taken with a: " + model + " from: " + hersteller + "\n"
                + "Picture has: " + megapixel + " MegaPixel\n"
                + "Pictrue is: " + size + " MegaByte\n"
                + "Picture was taken at: " + sdf.format(datum);
    }

    public void setBrennweite(int brennweite) {
        if (brennweite < 18 || brennweite > 135) {
            System.out.println("focal length is not valid setting");
        } else {
            this.brennweite = brennweite;
        }
    }
}
