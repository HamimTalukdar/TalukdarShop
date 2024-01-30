package ridzdoe;

public class Product {
    private String productName;
    private String madeIn;
    private String price;
    private String deliveryFee;

    private static int productNumber = 0;
    private int productNo = 0;
    

    public void productNo() {
        productNumber++;
        productNo = productNumber;
    }           

    public Product(String productName, String price, String deliveryFee) {
        this.productName = productName;
        this.price = price;
        this.deliveryFee = deliveryFee;
        productNo();
    }

    public Product(String productName, String madeIn, String price, String deliveryFee) {  // Made in
        this.productName = productName;
        this.madeIn = madeIn;
        this.price = price;
        this.deliveryFee = deliveryFee;
        productNo();
    }

    public String getProductName() {
        return productName;
    }

    public String getMadeIn() {
        return madeIn;
    }

    public String  getPrice(){
        return price;
    }

    public String getDeliveryFee(){
        return deliveryFee;
    }

    public int  getProductNo(){
        return productNo;
    }

    


}