package mariechristine.week8.camera;

public class ObjectiveLens {
    private String manufacturer;
    private String model;
    private int zoomMin;
    private int zoomMax;

    public ObjectiveLens(String manufacturer, String model, int zoomIn, int zoomOut){
        this.manufacturer = manufacturer;
        this.model = model;
        this.zoomMin = zoomIn;
        this.zoomMax = zoomOut;

    }

    public String getManufacturer(){
        return manufacturer;
    }

    public String getModel(){
        return model;
    }

    public int getZoomMin(){
        return zoomMin;
    }

    public int getZoomMax(){
        return zoomMax;
    }

    @Override
    public String toString() {
        return "Objective lens " + manufacturer + " " + model + " has been removed.";
    }
}
