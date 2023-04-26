package mariechristine.week8.camera;

public class Camera {
    private int focusMin;
    private int focusMax;
    private String model;
    private String manufacturer;
    private int resolution;

    public Camera(int focusMin, int focusMax, String model, String manufacturer, int resolution){
        this.focusMin = focusMin;
        this.focusMax = focusMax;
        this.model = model;
        this.manufacturer = manufacturer;
        this.resolution = resolution;
    }

    public void takePhoto(){
        System.out.println("Congrats! You took a photo of a banana!");
    }

    public int getFocusMin(){
        return focusMin;
    }

    public int getFocusMax(){
        return focusMax;
    }

    public String getModel(){
        return model;
    }

    public int getResolution(){
        return resolution;
    }

    public void setFocusMin(int focusMin){
        this.focusMin = focusMin;
    }

    public void setFocusMax(int focusMax){
        this.focusMax = focusMax;
    }

    public void setModel(String model){
        this.model = model;
    }

    public void setManufacturer(String manufacturer){
        this.manufacturer = manufacturer;
    }

    public void setResolution(int resolution){
        this.resolution = resolution;
    }


    public String toString(){
        return "This camera, model " + model + ", manufactured by " + manufacturer + ", has an adjustable focus between " + focusMin + "mm to " + focusMax + "mm, and has a resolution of " + resolution + " megapixels.";
    }
}
