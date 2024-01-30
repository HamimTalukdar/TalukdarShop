package ridzdoe;

import java.util.Scanner;

public class ProductInfo {
    String str;
    int diff, c;

    Scanner scan = new Scanner(System.in);
    //OrderInfo order;


    MobileData mobiles = new MobileData();
    AirPodsData airpods = new AirPodsData();
    EarphoneData earphone = new EarphoneData();
    RiceData rice = new RiceData();


    // For Mobile informations
    public int getProductInfo(String str, MobileData mobiles) {
        this.str = str;
        this.mobiles = mobiles;
        diff = mobiles.mobileList.get(0).getProductNo();
        try {
            int productNo = Integer.parseInt(str);
            if (productNo == mobiles.mobileList.get(productNo - diff).getProductNo()) {
                mobiles.getIndibidualMobileData(productNo - diff);
                System.out.println();
                
            }
        } catch (NumberFormatException e) {
            System.out.println();
        } catch (Exception a) {
            System.out.println("\nThis product isn't availible now.");
            String str3 = scan.nextLine();
            c = 1;
        }
        return c;
    }


    // Method Overloading  For AirPods informations
    public int getProductInfo(String str, AirPodsData airpods) {
        this.str = str;
        this.airpods = airpods;
        diff = airpods.airpodsList.get(0).getProductNo();
        try {
            int productNo = Integer.parseInt(str);
            if (productNo == airpods.airpodsList.get(productNo - diff).getProductNo()) {
                airpods.getIndibidualAirPodsData(productNo - diff);
                System.out.println();
                
            }
        } catch (NumberFormatException e) {
            System.out.println();
        } catch (Exception a) {
            System.out.println("\nThis product isn't availible now.");
            String str3 = scan.nextLine();
            c = 1;
        }
        return c;
    }


    // Method Overloading  For Earphone informations
    public int getProductInfo(String str, EarphoneData earphone) {
        this.str = str;
        this.earphone = earphone;
        diff = earphone.earphoneList.get(0).getProductNo();
        try {
            int productNo = Integer.parseInt(str);
            if (productNo == earphone.earphoneList.get(productNo - diff).getProductNo()) {
                earphone.getIndibidualEarphoneData(productNo - diff);
                System.out.println();
                
            }
        } catch (NumberFormatException e) {
            System.out.println();
        } catch (Exception a) {
            System.out.println("\nThis product isn't availible now.");
            String str3 = scan.nextLine();
            c = 1;
        }
        return c;
    }


    // Method Overloading  For  Rice informations
    public int getProductInfo(String str, RiceData rice) {
        this.str = str;
        this.rice = rice;
        diff = rice.riceList.get(0).getProductNo();
        try {
            int productNo = Integer.parseInt(str);
            if (productNo == rice.riceList.get(productNo - diff).getProductNo()) {
                rice.getIndibidualRiceData(productNo - diff);
                System.out.println();
                
            }
        } catch (NumberFormatException e) {
            System.out.println();
        } catch (Exception a) {
            System.out.println("\nThis product isn't availible now.");
            String str3 = scan.nextLine();
           c = 1;
        }
        return c;
    }

}