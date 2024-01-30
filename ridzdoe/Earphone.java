package ridzdoe;

public class Earphone extends Electronics{
    private String model;
    private String material;
    private String audioJack;

    private Sound sound;
    private Connectivity connectivity; 

    public Earphone(String productNames, String madeIn, String price, String deliveryFee, String brandName, String warranty, String model, String material, String audioJack, 
        Sound sound, Connectivity connectivity) {
        super(productNames, madeIn, price, deliveryFee, brandName, warranty);
        this.model = model;
        this.material = material;
        this.audioJack = audioJack;
        this.sound = sound;
        this.connectivity = connectivity;
    }

    public String getModel(){
        return model;
    }

    public String getMaterial(){
        return material;
    }

    public String getAudioJack(){
        return audioJack;
    }

    public Sound getSound(){
        return sound;
    }

    public Connectivity getConnectivity(){
        return connectivity;
    }
}
