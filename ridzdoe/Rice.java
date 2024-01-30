package ridzdoe;

public class Rice extends Groceries{
    private String riceType;
    private String riceSize;

    public Rice(String productNames, String madeIn, String price, String deliveryFee,  String brandName, String duration, 
                  String riceType, String riceSize) {
        super(productNames, madeIn, price, deliveryFee, brandName, duration);
        this.riceType = riceType;
        this.riceSize = riceSize;
    }

    public String getRiceType(){
        return riceType;
    }

    public String getRiceSize(){
        return riceSize;
    }
}
