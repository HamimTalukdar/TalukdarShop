package ridzdoe;

public class AirPods extends Electronics{
    private String releasDate;
    
    private Sound sound;
    private Battery battery;
    private Connectivity connectivity;

    public AirPods(String productNames, String madeIn, String price, String deliveryFee,  String brandName, String warranty, String releasDate, 
        Sound sound, Battery battery, Connectivity connectivity) {
        super(productNames, madeIn, price, deliveryFee,  brandName, warranty);
        this.releasDate = releasDate;
        this.sound = sound;
        this.battery = battery;
        this.connectivity = connectivity;
    }

    public String getAirPodsReleasDate(){
        return releasDate;
    }

    public Sound getSound(){
        return sound;
    }

    public Battery getBattery(){
        return battery;
    }

    public Connectivity getConnectivity(){
        return connectivity;
    }

}