package ridzdoe;

public class Groceries extends Product{
    private String brandName;
    private String duration;

    public Groceries(String productNames, String price, String deliveryFee,  String brandName, String duration) {
        super(productNames, price, deliveryFee);
        this.brandName = brandName;
        this.duration = duration;
    }

    // Constractor overload
    public Groceries(String productNames, String madeIn, String price, String deliveryFee,  String brandName, String duration) {
        super(productNames, madeIn, price, deliveryFee);
        this.brandName = brandName;
        this.duration = duration;
    }

    public String getBrandName() {
        return brandName;
    }
    
    public String getDuration() {
        return duration;
    }

}         