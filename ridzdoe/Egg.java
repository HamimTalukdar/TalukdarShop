package ridzdoe;

public class Egg extends Groceries{
    private String eggType;
    private String eggSize;

    public Egg(String productNames, String price, String deliveryFee,  String brandName, String duration, 
                  String eggType, String eggSize) {
        super(productNames, price, deliveryFee, brandName, duration);
        this.eggType = eggType;
        this.eggSize = eggSize;
    }

    public String getEggType(){
        return eggType;
    }

    public String getEggSize(){
        return eggSize;
    }
}
