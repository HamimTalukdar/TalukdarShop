package ridzdoe;

public class Mobile extends Electronics{
    private String releasDate;

    private Display display1;
    private Camera camera;
    private Sound sound;
    private Battery battery;

    public Mobile(String productNames, String madeIn, String price, String deliveryFee, String brandName, String warranty, String releasDate, 
                  String displayType, String displayQuality, String displaySize, String displayBrightness, Camera camera, Sound sound, Battery battery) {
        super(productNames, madeIn, price, deliveryFee, brandName, warranty);
        this.releasDate = releasDate;
        this.display1 = new Display(displayType, displayQuality, displaySize, displayBrightness);
        this.camera = camera;
        this.sound = sound;
        this.battery = battery;
    }

    public String getMobileReleasDate(){
        return releasDate;
    }

    public Display getDisplay(){
        return display1;
    }

    public Camera getCamera(){
        return camera;
    }

    public Sound getSound(){
        return sound;
    }

    public Battery getBattery(){
        return battery;
    }
}