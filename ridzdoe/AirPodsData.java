package ridzdoe;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;

public class AirPodsData implements FileData {
    String productType;

    String productName;
    String madeIn;
    String price;
    String brandName;
    String warranty;
    String releasedDate;
    String soundSystem;
    String soundQuality;
    String soundControl;
    String batteryType;
    String batteryCapacity;
    String chargingTime;
    String dischargingTime;
    String batteryLife;
    String connectivityType;
    String bluetoothVersion;
    String deliveryFee;

    String productNo;

    Scanner scan = new Scanner(System.in);
    FrontEnd ob1 = new FrontEnd();
    ArrayList<AirPods> airpodsList = new ArrayList<>(); // Creating AirPods's objects

    int a, n;
    String s;

    public void setAirPodsData() {
        System.out.print("How many AirPods : ");
        a = scan.nextInt();
        s = scan.nextLine();

        for (int i = 0; i < a; i++) {
            System.out.println((i + 1) + " No. AirPods :");
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
            System.out.print("Sound system : ");
            soundSystem = scan.nextLine();
            System.out.print("Sound quality : ");
            soundQuality = scan.nextLine();
            System.out.print("Sound control : ");
            soundControl = scan.nextLine();
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
            System.out.print("Connectivity type : ");
            connectivityType = scan.nextLine();
            System.out.print("Bluetooth version : ");
            bluetoothVersion = scan.nextLine();
            System.out.print("Delivery fee : ");
            deliveryFee = scan.nextLine();

            Sound sound = new Sound(soundSystem, soundQuality, soundControl);
            Battery battery = new Battery(batteryType, batteryCapacity, chargingTime, dischargingTime, batteryLife);
            Connectivity connectivity = new Connectivity(connectivityType, bluetoothVersion);

            airpodsList.add(new AirPods(productName, madeIn, price, deliveryFee, brandName, warranty, releasedDate,
                    sound, battery, connectivity));
            System.out.println();
            setFileData(i);
        }
    }


    int i;
    String folder;

    @Override
    public void clearFile() {
        folder = "D:\\VSCODE\\JavaProject_1\\hamimShop\\AirPodsData";
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

        folder = "D:\\VSCODE\\JavaProject_1\\hamimShop\\AirPodsData";
        File dir = new File(folder);
        dir.mkdir(); // directory will be created

        this.i = i;
        folder = "D:\\VSCODE\\JavaProject_1\\hamimShop\\AirPodsData\\" + "\\product_" + i + ".txt";

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
            formatter.format(" %s\r\n", "AirPods");
            formatter.format(" %s\r\n", airpodsList.get(i).getProductName());
            formatter.format(" %s\r\n", airpodsList.get(i).getBrandName());
            formatter.format(" %s\r\n", airpodsList.get(i).getMadeIn());
            formatter.format(" %s\r\n", airpodsList.get(i).getWarranty());
            formatter.format(" %s\r\n", airpodsList.get(i).getAirPodsReleasDate());
            formatter.format(" %s\r\n", airpodsList.get(i).getPrice());
            formatter.format(" %s\r\n", airpodsList.get(i).getSound().getSoundSystem());
            formatter.format(" %s\r\n", airpodsList.get(i).getSound().getSoundQuality());
            formatter.format(" %s\r\n", airpodsList.get(i).getSound().getSoundControl());
            formatter.format(" %s\r\n", airpodsList.get(i).getBattery().getBattaryType());
            formatter.format(" %s\r\n", airpodsList.get(i).getBattery().getBattaryCapacity());
            formatter.format(" %s\r\n", airpodsList.get(i).getBattery().getChargingTime());
            formatter.format(" %s\r\n", airpodsList.get(i).getBattery().getDischargingTime());
            formatter.format(" %s\r\n", airpodsList.get(i).getBattery().getBatteryLife());
            formatter.format(" %s\r\n", airpodsList.get(i).getConnectivity().getConnectivityType());
            formatter.format(" %s\r\n", airpodsList.get(i).getConnectivity().getBluetoothVersion());
            formatter.format(" %s\r\n", airpodsList.get(i).getDeliveryFee());
            formatter.format(" %d\r\n", airpodsList.get(i).getProductNo());
            System.out.println("File create and write successfully done.\n");
            formatter.close();
        } catch (FileNotFoundException a) {
            System.out.println(a);
        }
    }

    @Override
    public void getAndSetFileData() {
        for (n = 0;; n++) {
            folder = "D:\\VSCODE\\JavaProject_1\\hamimShop\\AirPodsData\\" + "\\product_" + n + ".txt";
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
                            soundSystem = scan.nextLine();
                        } else if (num == 8) {
                            soundQuality = scan.nextLine();
                        } else if (num == 9) {
                            soundControl = scan.nextLine();
                        } else if (num == 10) {
                            batteryType = scan.nextLine();
                        } else if (num == 11) {
                            batteryCapacity = scan.nextLine();
                        } else if (num == 12) {
                            chargingTime = scan.nextLine();
                        } else if (num == 13) {
                            dischargingTime = scan.nextLine();
                        } else if (num == 14) {
                            batteryLife = scan.nextLine();
                        } else if (num == 15) {
                            connectivityType = scan.nextLine();
                        } else if (num == 16) {
                            bluetoothVersion = scan.nextLine();
                        } else if (num == 17) {
                            deliveryFee = scan.nextLine();
                        } else if (num == 18) {
                            productNo = scan.nextLine();
                        }

                        num++;

                    }
                    Sound sound = new Sound(soundSystem, soundQuality, soundControl);
                    Battery battery = new Battery(batteryType, batteryCapacity, chargingTime, dischargingTime,
                            batteryLife);
                    Connectivity connectivity = new Connectivity(connectivityType, bluetoothVersion);

                    airpodsList.add(new AirPods(productName, madeIn, price, deliveryFee, brandName, warranty, releasedDate,
                            sound, battery, connectivity));
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
    public void changeFileData(String folder, int productNo) {   // For changing single products information
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
            formatter.format(" %s\r\n", "AirPods");
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
            System.out.print("Sound system : ");
            s = scan.nextLine();
            formatter.format(" %s\r\n", s);
            System.out.print("Sound quality : ");
            s = scan.nextLine();
            formatter.format(" %s\r\n", s);
            System.out.print("Sound control : ");
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
            System.out.print("Connectivity type : ");
            s = scan.nextLine();
            formatter.format(" %s\r\n", s);
            System.out.print("Bluetooth version : ");
            s = scan.nextLine();
            formatter.format(" %s\r\n", s);
            System.out.print("Delivery fee : ");
            s = scan.nextLine();
            formatter.format(" %s\r\n", s);
            formatter.format(" %d\r\n", productNo);
            System.out.println("File over-write successfully done.\n");
            formatter.close();
        } catch (FileNotFoundException a) {
            System.out.println(a);
        }
    }


    public void getAirPodsData() { // It shows the pages outlook whith products

        System.out.println("AirPods   >>>\n");

        int b = a / 5, c = a % 5;
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
                    String productInfo = "Name : " + airpodsList.get(h).getProductName();
                    System.out.print(productInfo);
                    for (int n = 1; n <= 32 - productInfo.length(); n++) {
                        System.out.print(" ");
                    }
                } else if (i == 1) {
                    String productInfo = "Brand : " + airpodsList.get(h).getBrandName();
                    System.out.print(productInfo);
                    for (int n = 1; n <= 32 - productInfo.length(); n++) {
                        System.out.print(" ");
                    }
                } else if (i == 2) {
                    String productInfo = "Made in : " + airpodsList.get(h).getMadeIn();
                    System.out.print(productInfo);
                    for (int n = 1; n <= 32 - productInfo.length(); n++) {
                        System.out.print(" ");
                    }
                } else if (i == 3) {
                    String productInfo = "Warranty : " + airpodsList.get(h).getWarranty();
                    System.out.print(productInfo);
                    for (int n = 1; n <= 32 - productInfo.length(); n++) {
                        System.out.print(" ");
                    }
                } else if (i == 4) {
                    String productInfo = "Released : " + airpodsList.get(h).getAirPodsReleasDate();
                    System.out.print(productInfo);
                    for (int n = 1; n <= 32 - productInfo.length(); n++) {
                        System.out.print(" ");
                    }
                } else if (i == 5) {
                    String productInfo = "Price : " + airpodsList.get(h).getPrice();
                    System.out.print(productInfo);
                    for (int n = 1; n <= 32 - productInfo.length(); n++) {
                        System.out.print(" ");
                    }
                } else if (i == 6) {
                    String productInfo = "Product No : " + airpodsList.get(h).getProductNo();
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


    public void getIndibidualAirPodsData(int a) { // It shows indibudual product's information
        ob1.box(1);
        System.out.println("Name              : " + airpodsList.get(a).getProductName());
        System.out.println("Brand             : " + airpodsList.get(a).getBrandName());
        System.out.println("Made in           : " + airpodsList.get(a).getMadeIn());
        System.out.println("Warranty          : " + airpodsList.get(a).getWarranty());
        System.out.println("Released          : " + airpodsList.get(a).getAirPodsReleasDate());
        System.out.println("Price             : " + airpodsList.get(a).getPrice());
        System.out.println("--------------------------------------");
        System.out.println("Sound system      : " + airpodsList.get(a).getSound().getSoundSystem());
        System.out.println("Sound quality     : " + airpodsList.get(a).getSound().getSoundQuality());
        System.out.println("Sound control     : " + airpodsList.get(a).getSound().getSoundControl());
        System.out.println("--------------------------------------");
        System.out.println("Battery type      : " + airpodsList.get(a).getBattery().getBattaryType());
        System.out.println("Battery capacity  : " + airpodsList.get(a).getBattery().getBattaryCapacity());
        System.out.println("Charging time     : " + airpodsList.get(a).getBattery().getChargingTime());
        System.out.println("Discharging time  : " + airpodsList.get(a).getBattery().getDischargingTime());
        System.out.println("Battery life      : " + airpodsList.get(a).getBattery().getBatteryLife());
        System.out.println("--------------------------------------");
        System.out.println("Connectivity type : " + airpodsList.get(a).getConnectivity().getConnectivityType());
        System.out.println("Bluetooth version : " + airpodsList.get(a).getConnectivity().getBluetoothVersion());
        System.out.println("--------------------------------------");
        System.out.println("Product No        : " + airpodsList.get(a).getProductNo());
    }


}
