package ridzdoe;

import java.util.Scanner;

public class ControlPannel {
    Scanner scan = new Scanner(System.in);

    FrontEnd frontEnd = new FrontEnd();

    ProductInfo productInfo = new ProductInfo();
    Order order;

    MobileData mobiles = new MobileData();
    AirPodsData airpods = new AirPodsData();
    EarphoneData earphone = new EarphoneData();
    RiceData rice = new RiceData();

    public void setAllData() {
        mobiles.clearFile();
        mobiles.setMobileData();

        airpods.clearFile();
        airpods.setAirPodsData();

        earphone.clearFile();
        earphone.setEarphoneData();

        rice.clearFile();
        rice.setRiceData();

    }

    public void setDataFromFile() {  // This function can set hole data from file 
        mobiles.getAndSetFileData();
        airpods.getAndSetFileData();
        earphone.getAndSetFileData();
        rice.getAndSetFileData();

    }

    public void changeMobileData(String s, int i) {
        mobiles.changeFileData(s, i);
    }

    // Methode overloading for AirPods products
    public void changeAirPodsData(String s, int i) {
        airpods.changeFileData(s, i);
    }

    // Methode overloading for Earphone products
    public void changeEarphoneData(String s, int i) {
        earphone.changeFileData(s, i);
    }

    // Methode overloading for Rice products
    public void changeRiceData(String s, int i) {
        rice.changeFileData(s, i);
    }



    int c;

    public void getAlldata() {
        String str, str2, productType;

        mobiles.getAndSetFileData();
        mobiles.getMobileData();
        frontEnd.Line();
        System.out.print("Next page(Press Enter) or, product No(..)    >>>> ");
        str = scan.nextLine();
        c = productInfo.getProductInfo(str, mobiles);
        if(str.equals("") || c==1){
            frontEnd.Line();
        }else{
            productType = "Mobile";
            System.out.print("Order product (odr) Or, Next page(Press Enter)    >>> ");
            str2 = scan.nextLine();
            if (str2.equals("odr")) {
                order = new Order(str, productType);
            }
            frontEnd.Line();
        }
        c=0;
        



        airpods.getAndSetFileData();
        airpods.getAirPodsData();
        frontEnd.Line();
        System.out.print("Next page(Press Enter) or, product No(..)    >>>> ");
        str = scan.nextLine();
        c=productInfo.getProductInfo(str, airpods);
        if(str.equals("") || c==1){
            frontEnd.Line();
        }else{
            productType = "AirPods";
            System.out.print("Order product (odr) Or, Next page(Press Enter)    >>> ");
            str2 = scan.nextLine();
            if (str2.equals("odr")) {
                order = new Order(str, productType);
            }
            frontEnd.Line();
        }
        c=0;




        earphone.getAndSetFileData();
        earphone.getEarphoneData();
        frontEnd.Line();
        System.out.print("Next page(Press Enter) or, product No(..)    >>>> ");
        str = scan.nextLine();
        c=productInfo.getProductInfo(str, earphone);
        if(str.equals("") || c==1){
            frontEnd.Line();
        }else{
            productType = "Earphone";
            System.out.print("Order product (odr) Or, Next page(Press Enter)    >>> ");
            str2 = scan.nextLine();
            if (str2.equals("odr")) {
                order = new Order(str, productType);
            }
            frontEnd.Line();
        }
        c=0;




        rice.getAndSetFileData();
        rice.getRiceData();
        frontEnd.Line();
        System.out.print("Next page(Press Enter) or, product No(..)    >>>> ");
        str = scan.nextLine();
        c=productInfo.getProductInfo(str, rice);    // Here is the bug bro and you know that Hamim
        if(str.equals("") || c==1){
            frontEnd.Line();
        }else{
            productType = "Rice";
            System.out.print("Order product (odr) Or, Next page(Press Enter)    >>> ");
            str2 = scan.nextLine();
            if (str2.equals("odr")) {
                order = new Order(str, productType);
            }
            frontEnd.Line();
        }
        c=0;





        scan.close();

    }

}