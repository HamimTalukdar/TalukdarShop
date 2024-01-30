package ridzdoe;

public class Electronics extends Product {
    private String brandName;
    private String warranty;
    
    public Electronics(String productNames, String madeIn, String price, String deliveryFee,  String brandName, String warranty) {
        super(productNames, madeIn, price, deliveryFee);
        this.brandName = brandName;
        this.warranty = warranty;
    }

    public String getBrandName() {
        return brandName;
    }
    
    public String getWarranty() {
        return warranty;
    }

}