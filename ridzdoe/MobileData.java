package ridzdoe;

import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;

public class MobileData implements FileData {

    String productType;

    String productName;
    String brandName;
    String madeIn;
    String price;
    String warranty;
    String releasedDate;
    String displayType;
    String displayQuality;
    String displaySize;
    String displayBrightness;
    String mainCamera;
    String frontCamera;
    String ultrawideCamera;
    String microCamera;
    String telephotoLence;
    String soundSystem;
    String soundQuality;
    String batteryType;
    String batteryCapacity;
    String chargingTime;
    String dischargingTime;
    String batteryLife;
    String deliveryFee;
    String productNo;

    Scanner scan = new Scanner(System.in);
    FrontEnd ob1 = new FrontEnd();
    ArrayList<Mobile> mobileList = new ArrayList<>(); // Creating Mobile's objects

    int a, n;
    String s;

    public void setMobileData() {
        System.out.print("How many Mobiles : ");
        a = scan.nextInt();
        s = scan.nextLine();

        for (int i = 0; i < a; i++) {
            System.out.println((i + 1) + " No. Mobile :");
            System.out.print("Enter product name : ");
            productName = scan.nextLine();
            System.out.print("Enter brand name : ");
            brandName = scan.nextLine();
            System.out.print("Made in : ");
            madeIn = scan.nextLine();
            System.out.print("Warranty : ");
            warranty = scan.nextLine();
            System.out.print("Released : ");
            releasedDate = scan.nextLine();
            System.out.print("Price : ");
            price = scan.nextLine();
            System.out.print("Display type : ");
            displayType = scan.nextLine();
            System.out.print("Display : ");
            displayQuality = scan.nextLine();
            System.out.print("Display size : ");
            displaySize = scan.nextLine();
            System.out.print("Brightness : ");
            displayBrightness = scan.nextLine();
            System.out.print("Main Camera : ");
            mainCamera = scan.nextLine();
            System.out.print("Front Camera : ");
            frontCamera = scan.nextLine();
            System.out.print("Ultra Wide Camera : ");
            ultrawideCamera = scan.nextLine();
            System.out.print("Micro Camera : ");
            microCamera = scan.nextLine();
            System.out.print("Telephoto Lence : ");
            telephotoLence = scan.nextLine();
            System.out.print("Sound system : ");
            soundSystem = scan.nextLine();
            System.out.print("Sound quality : ");
            soundQuality = scan.nextLine();
            System.out.print("battery type : ");
            batteryType = scan.nextLine();
            System.out.print("battery Capacity : ");
            batteryCapacity = scan.nextLine();
            System.out.print("Charging time : ");
            chargingTime = scan.nextLine();
            System.out.print("Discharging time : ");
            dischargingTime = scan.nextLine();
            System.out.print("Battery life : ");
            batteryLife = scan.nextLine();
            System.out.print("Delivery fee : ");
            deliveryFee = scan.nextLine();

            Camera camera = new Camera(mainCamera, frontCamera, ultrawideCamera, microCamera, telephotoLence);
            Sound sound = new Sound(soundSystem, soundQuality);
            Battery battery = new Battery(batteryType, batteryCapacity, chargingTime, dischargingTime, batteryLife);

            mobileList.add(new Mobile(productName, madeIn, price, deliveryFee, brandName, warranty, releasedDate,
                    displayType, displayQuality, displaySize, displayBrightness, camera, sound, battery));
            System.out.println();
            setFileData(i);
        }
    }

    int i;
    String folder;

    @Override
    public void clearFile() {
        folder = "D:\\VSCODE\\JavaProject_1\\hamimShop\\MobileData";
        File dir = new File(folder);
        dir.mkdir(); // directory will be created

        for (int t = 0;; t++) {
            File file1 = new File(folder + "\\product_" + t + ".txt");

            if (file1.exists()) {
                file1.delete();
            } else {
                dir.delete();
                break;
            }
        }

    }

    @Override
    public void setFileData(int i) {

        folder = "D:\\VSCODE\\JavaProject_1\\hamimShop\\MobileData";
        File dir = new File(folder);
        dir.mkdir(); // directory will be created

        this.i = i;
        folder = "D:\\VSCODE\\JavaProject_1\\hamimShop\\MobileData\\" + "\\product_" + i + ".txt";

        File file = new File(folder);

        try {
            file.createNewFile();
            System.out.println("Files are created");
        } catch (Exception e) {
            System.out.println(e);
        }

        if (file.exists()) {
            System.out.println("file exists");
        }

        try {
            Formatter formatter = new Formatter(folder); 
            formatter.format(" %s\r\n", "Mobile");
            formatter.format(" %s\r\n", mobileList.get(i).getProductName());
            formatter.format(" %s\r\n", mobileList.get(i).getBrandName());
            formatter.format(" %s\r\n", mobileList.get(i).getMadeIn());
            formatter.format(" %s\r\n", mobileList.get(i).getWarranty());
            formatter.format(" %s\r\n", mobileList.get(i).getMobileReleasDate());
            formatter.format(" %s\r\n", mobileList.get(i).getPrice());
            formatter.format(" %s\r\n", mobileList.get(i).getDisplay().getDisplayType());
            formatter.format(" %s\r\n", mobileList.get(i).getDisplay().getDisplayQuality());
            formatter.format(" %s\r\n", mobileList.get(i).getDisplay().getDisplaySize());
            formatter.format(" %s\r\n", mobileList.get(i).getDisplay().getDisplayBrightness());
            formatter.format(" %s\r\n", mobileList.get(i).getCamera().getMainCamera());
            formatter.format(" %s\r\n", mobileList.get(i).getCamera().getFrontCamera());
            formatter.format(" %s\r\n", mobileList.get(i).getCamera().getUltrawideCamera());
            formatter.format(" %s\r\n", mobileList.get(i).getCamera().getMicroCamera());
            formatter.format(" %s\r\n", mobileList.get(i).getCamera().getTelephotoLence());
            formatter.format(" %s\r\n", mobileList.get(i).getSound().getSoundSystem());
            formatter.format(" %s\r\n", mobileList.get(i).getSound().getSoundQuality());
            formatter.format(" %s\r\n", mobileList.get(i).getBattery().getBattaryType());
            formatter.format(" %s\r\n", mobileList.get(i).getBattery().getBattaryCapacity());
            formatter.format(" %s\r\n", mobileList.get(i).getBattery().getChargingTime());
            formatter.format(" %s\r\n", mobileList.get(i).getBattery().getDischargingTime());
            formatter.format(" %s\r\n", mobileList.get(i).getBattery().getBatteryLife());
            formatter.format(" %s\r\n", mobileList.get(i).getDeliveryFee());
            formatter.format(" %d\r\n", mobileList.get(i).getProductNo());
            System.out.println("File create and write successfully done.\n");
            formatter.close();
        } catch (FileNotFoundException a) {
            System.out.println(a);
        }
    }
     

    @Override
    public void getAndSetFileData() {
        for (n = 0;; n++) {
            folder = "D:\\VSCODE\\JavaProject_1\\hamimShop\\MobileData\\" + "\\product_" + n + ".txt";
            int num = 0;
            try {
                File file1 = new File(folder);

                if (file1.exists()) {
                    Scanner scan = new Scanner(file1);
                    while (scan.hasNextLine()) {
                        if (num == 0) {
                            productType = scan.nextLine();
                        } else if (num == 1) {
                            productName = scan.nextLine();
                        } else if (num == 2) {
                            brandName = scan.nextLine();
                        } else if (num == 3) {
                            madeIn = scan.nextLine();
                        } else if (num == 4) {
                            warranty = scan.nextLine();
                        } else if (num == 5) {
                            releasedDate = scan.nextLine();
                        } else if (num == 6) {
                            price = scan.nextLine();
                        } else if (num == 7) {
                            displayType = scan.nextLine();
                        } else if (num == 8) {
                            displayQuality = scan.nextLine();
                        } else if (num == 9) {
                            displaySize = scan.nextLine();
                        } else if (num == 10) {
                            displayBrightness = scan.nextLine();
                        } else if (num == 11) {
                            mainCamera = scan.nextLine();
                        } else if (num == 12) {
                            frontCamera = scan.nextLine();
                        } else if (num == 13) {
                            ultrawideCamera = scan.nextLine();
                        } else if (num == 14) {
                            microCamera = scan.nextLine();
                        } else if (num == 15) {
                            telephotoLence = scan.nextLine();
                        } else if (num == 16) {
                            soundSystem = scan.nextLine();
                        } else if (num == 17) {
                            soundQuality = scan.nextLine();
                        } else if (num == 18) {
                            batteryType = scan.nextLine();
                        } else if (num == 19) {
                            batteryCapacity = scan.nextLine();
                        } else if (num == 20) {
                            chargingTime = scan.nextLine();
                        } else if (num == 21) {
                            dischargingTime = scan.nextLine();
                        } else if (num == 22) {
                            batteryLife = scan.nextLine();
                        } else if (num == 23) {
                            deliveryFee = scan.nextLine();
                        } else if (num == 24) {
                            productNo = scan.nextLine();
                        }

                        num++;

                    }
                    Camera camera = new Camera(mainCamera, frontCamera, ultrawideCamera, microCamera,
                            telephotoLence);
                    Sound sound = new Sound(soundSystem, soundQuality);
                    Battery battery = new Battery(batteryType, batteryCapacity, chargingTime, dischargingTime,
                            batteryLife);

                    mobileList.add(new Mobile(productName, madeIn, price, deliveryFee, brandName, warranty, releasedDate,
                            displayType, displayQuality, displaySize, displayBrightness, camera, sound, battery));
                    scan.close();

                } else {
                    break;
                }

            } catch (Exception a) {
                System.out.println(a);
            }

        }
        a = n;

    }


    //////////
    @Override
    public void changeFileData(String folder, int p) {   // For changing single products information
        File file1 = new File(folder);

        try {
            file1.createNewFile();
            System.out.println("Files are created");
        } catch (Exception e) {
            System.out.println(e);
        }

        if (file1.exists()) {
            System.out.println("file exists");
        }

        try {
            Formatter formatter = new Formatter(folder);
            formatter.format(" %s\r\n", "Mobile");
            System.out.print("Enter product name : ");
            s = scan.nextLine();
            formatter.format(" %s\r\n", s);
            System.out.print("Enter brand name : ");
            s = scan.nextLine();
            formatter.format(" %s\r\n", s);
            System.out.print("Made in : ");
            s = scan.nextLine();
            formatter.format(" %s\r\n", s);
            System.out.print("Warranty : ");
            s = scan.nextLine();
            formatter.format(" %s\r\n", s);
            System.out.print("Released : ");
            s = scan.nextLine();
            formatter.format(" %s\r\n", s);
            System.out.print("Price : ");
            s = scan.nextLine();
            formatter.format(" %s\r\n", s);
            System.out.print("Display type : ");
            s = scan.nextLine();
            formatter.format(" %s\r\n", s);
            System.out.print("Display : ");
            s = scan.nextLine();
            formatter.format(" %s\r\n", s);
            System.out.print("Display size : ");
            s = scan.nextLine();
            formatter.format(" %s\r\n", s);
            System.out.print("Brightness : ");
            s = scan.nextLine();
            formatter.format(" %s\r\n", s);
            System.out.print("Main Camera : ");
            s = scan.nextLine();
            formatter.format(" %s\r\n", s);
            System.out.print("Front Camera : ");
            s = scan.nextLine();
            formatter.format(" %s\r\n", s);
            System.out.print("Ultra Wide Camera : ");
            s = scan.nextLine();
            formatter.format(" %s\r\n", s);
            System.out.print("Micro Camera : ");
            s = scan.nextLine();
            formatter.format(" %s\r\n", s);
            System.out.print("Telephoto Lence : ");
            s = scan.nextLine();
            formatter.format(" %s\r\n", s);
            System.out.print("System system : ");
            s = scan.nextLine();
            formatter.format(" %s\r\n", s);
            System.out.print("Sound quality : ");
            s = scan.nextLine();
            formatter.format(" %s\r\n", s);
            System.out.print("battery type : ");
            s = scan.nextLine();
            formatter.format(" %s\r\n", s);
            System.out.print("batteryCapacity : ");
            s = scan.nextLine();
            formatter.format(" %s\r\n", s);
            System.out.print("Charging time : ");
            s = scan.nextLine();
            formatter.format(" %s\r\n", s);
            System.out.print("Discharging time : ");
            s = scan.nextLine();
            formatter.format(" %s\r\n", s);
            System.out.print("Battery life : ");
            s = scan.nextLine();
            formatter.format(" %s\r\n", s);
            System.out.print("Delivery Fee : ");
            s = scan.nextLine();
            formatter.format(" %s\r\n", s);
            formatter.format(" %d\r\n", p);
            System.out.println("File over-write successfully done.\n");
            formatter.close();
        } catch (FileNotFoundException a) {
            System.out.println(a);
        }
    }
    

    public void getMobileData() { // It shows the pages outlook whith products

        System.out.println("\n");

        int b = a / 5, c = a % 5;
        ob1.productImg();
        System.out.println("Mobile   >>>\n");
        int h = 0, d = 0, t = 0;

        for (int i = 0; i <= 6 && h != a; i++) {
            if (i == 0 && t % 5 == 0) {
                if (b > 0) {
                    ob1.box(5);
                    b--;
                    d = 5;
                } else {
                    ob1.box(c);
                    d = c;
                }
            }

            for (int j = 0; j < d; j++, h++) {
                if (i == 0) {
                    String productInfo = "Name : " + mobileList.get(h).getProductName();
                    System.out.print(productInfo);
                    for (int n = 1; n <= 32 - productInfo.length(); n++) {
                        System.out.print(" ");
                    }
                } else if (i == 1) {
                    String productInfo = "Brand : " + mobileList.get(h).getBrandName();
                    System.out.print(productInfo);
                    for (int n = 1; n <= 32 - productInfo.length(); n++) {
                        System.out.print(" ");
                    }
                } else if (i == 2) {
                    String productInfo = "Made in : " + mobileList.get(h).getMadeIn();
                    System.out.print(productInfo);
                    for (int n = 1; n <= 32 - productInfo.length(); n++) {
                        System.out.print(" ");
                    }
                } else if (i == 3) {
                    String productInfo = "Warranty : " + mobileList.get(h).getWarranty();
                    System.out.print(productInfo);
                    for (int n = 1; n <= 32 - productInfo.length(); n++) {
                        System.out.print(" ");
                    }
                } else if (i == 4) {
                    String productInfo = "Released : " + mobileList.get(h).getMobileReleasDate();
                    System.out.print(productInfo);
                    for (int n = 1; n <= 32 - productInfo.length(); n++) {
                        System.out.print(" ");
                    }
                } else if (i == 5) {
                    String productInfo = "Price : " + mobileList.get(h).getPrice();
                    System.out.print(productInfo);
                    for (int n = 1; n <= 32 - productInfo.length(); n++) {
                        System.out.print(" ");
                    }
                } else if (i == 6) {
                    String productInfo = "Product No : " + mobileList.get(h).getProductNo();
                    System.out.print(productInfo);
                    for (int n = 1; n <= 32 - productInfo.length(); n++) {
                        System.out.print(" ");
                    }
                }
            }

            if (i == 6) {
                i = -1;
                t = h;
            } else {
                h = t;
            }
            System.out.println();
        }
        System.out.println("\n");
    }


    public void getIndibidualMobileData(int a) { // It shows indibudual product's information
        ob1.box(1);
        System.out.println("Name              : " + mobileList.get(a).getProductName());
        System.out.println("Brand             : " + mobileList.get(a).getBrandName());
        System.out.println("Made in           : " + mobileList.get(a).getMadeIn());
        System.out.println("Warranty          : " + mobileList.get(a).getWarranty());
        System.out.println("Released          : " + mobileList.get(a).getMobileReleasDate());
        System.out.println("Price             : " + mobileList.get(a).getPrice());
        System.out.println("--------------------------------------");
        System.out.println("Display type      : " + mobileList.get(a).getDisplay().getDisplayType());
        System.out.println("Display           : " + mobileList.get(a).getDisplay().getDisplayQuality());
        System.out.println("Display size      : " + mobileList.get(a).getDisplay().getDisplaySize());
        System.out.println("Brightness        : " + mobileList.get(a).getDisplay().getDisplayBrightness());
        System.out.println("--------------------------------------");
        System.out.println("Main Camera       : " + mobileList.get(a).getCamera().getMainCamera());
        System.out.println("Front Camera      : " + mobileList.get(a).getCamera().getFrontCamera());
        System.out.println("Ultra-wide Camera : " + mobileList.get(a).getCamera().getUltrawideCamera());
        System.out.println("Micro Camera      : " + mobileList.get(a).getCamera().getMicroCamera());
        System.out.println("Telephoto Lence   : " + mobileList.get(a).getCamera().getTelephotoLence());
        System.out.println("--------------------------------------");
        System.out.println("Sound system      : " + mobileList.get(a).getSound().getSoundSystem());
        System.out.println("Sound quality     : " + mobileList.get(a).getSound().getSoundQuality());
        System.out.println("--------------------------------------");
        System.out.println("Battery type      : " + mobileList.get(a).getBattery().getBattaryType());
        System.out.println("Battery capacity  : " + mobileList.get(a).getBattery().getBattaryCapacity());
        System.out.println("Charging time     : " + mobileList.get(a).getBattery().getChargingTime());
        System.out.println("Discharging time  : " + mobileList.get(a).getBattery().getDischargingTime());
        System.out.println("Battery life      : " + mobileList.get(a).getBattery().getBatteryLife());
        System.out.println("--------------------------------------");
        System.out.println("Product No        : " + mobileList.get(a).getProductNo());
    }
}