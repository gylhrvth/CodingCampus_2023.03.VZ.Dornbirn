package eric.week08;

public class PhotoData {
    private String minFocalLength;
    private String maxFocalLength;
    private String model;
    private String producer;
    private double megaPixel;

    public PhotoData(String minFocalLengthPossible, String maxFocalLengthPossible, String modelName, String manufacturer, double megaPixel){
        this.minFocalLength = minFocalLengthPossible;
        this.maxFocalLength = maxFocalLengthPossible;
        this.model = modelName;
        this.producer = manufacturer;
        this.megaPixel = megaPixel;
    }

    public void takePhoto(String message){
        System.out.println("Photo was taken");
    }





    public String toString(){return "Min. focal length is: " + minFocalLength + "\nMax. focal length is: " + maxFocalLength +
      "\nModel Name: " + model + "\nManufactured by: " + producer + "\nMegapixel: " + megaPixel;}
}
