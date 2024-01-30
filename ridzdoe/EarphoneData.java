package ridzdoe;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;

public class EarphoneData implements FileData{
    String productType;

    String productName;
    String madeIn;
    String price;
    String brandName;
    String warranty;
    String model;
    String material;
    String audioJack;
    String soundSystem;
    String soundQuality;
    String soundControl;
    String inputPower;
    String speaker;
    String speakerPower;
    String connectivityType;
    String frequencyRange;
    String impedance;
    String deliveryFee;

    String productNo;

    Scanner scan = new Scanner(System.in);
    FrontEnd ob1 = new FrontEnd();
    ArrayList<Earphone> earphoneList = new ArrayList<>(); // Creating Earphone's objects

    int a, n;
    String s;


    public void setEarphoneData() {
        System.out.print("How many Earphone : ");
        a = scan.nextInt();
        s = scan.nextLine();

        for (int i = 0; i < a; i++) {
            System.out.println((i + 1) + " No. Earphone :");
            System.out.print("Enter product name : ");
            productName = scan.nextLine();
            System.out.print("Enter brand name : ");
            brandName = scan.nextLine();
            System.out.print("Made in : ");
            madeIn = scan.nextLine();
            System.out.print("Warranty : ");
            warranty = scan.nextLine();
            System.out.print("Model : ");
            model = scan.nextLine();
            System.out.print("Material : ");
            material = scan.nextLine();
            System.out.print("Audio Jack : ");
            audioJack = scan.nextLine();
            System.out.print("Price : ");
            price = scan.nextLine();
            System.out.print("Sound system : ");
            soundSystem = scan.nextLine();
            System.out.print("Sound quality : ");
            soundQuality = scan.nextLine();
            System.out.print("Sound control : ");
            soundControl = scan.nextLine();
            System.out.print("Input power : ");
            inputPower = scan.nextLine();
            System.out.print("Speaker : ");
            speaker = scan.nextLine();
            System.out.print("Speaker power : ");
            speakerPower = scan.nextLine();
            System.out.print("Connectivity type : ");
            connectivityType = scan.nextLine();
            System.out.print("Frequency range : ");
            frequencyRange = scan.nextLine();
            System.out.print("Impedance : ");
            impedance = scan.nextLine();
            System.out.print("Delivery fee : ");
            deliveryFee = scan.nextLine();

            Sound sound = new Sound(soundSystem, soundQuality, soundControl, inputPower, speaker, speakerPower);
            Connectivity connectivity = new Connectivity(connectivityType, frequencyRange, impedance);

            earphoneList.add(new Earphone(productName, madeIn, price, deliveryFee, brandName, warranty, model,
                    material, audioJack, sound, connectivity));
            System.out.println();
            setFileData(i);
        }
    }


    int i;
    String folder;

    @Override
    public void clearFile() {
        folder = "D:\\VSCODE\\JavaProject_1\\hamimShop\\EarphoneData";
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

        folder = "D:\\VSCODE\\JavaProject_1\\hamimShop\\EarphoneData";
        File dir = new File(folder);
        dir.mkdir(); // directory will be created

        this.i = i;
        folder = "D:\\VSCODE\\JavaProject_1\\hamimShop\\EarphoneData\\" + "\\product_" + i + ".txt";

        File file = new File(folder);

        try {
            file.createNewFile();  // File will be created
            System.out.println("Files are created");
        } catch (Exception e) {
            System.out.println(e);
        }

        if (file.exists()) {
            System.out.println("file exists");
        }

        try {
            Formatter formatter = new Formatter(folder);
            formatter.format(" %s\r\n", "Earphone");
            formatter.format(" %s\r\n", earphoneList.get(i).getProductName());
            formatter.format(" %s\r\n", earphoneList.get(i).getBrandName());
            formatter.format(" %s\r\n", earphoneList.get(i).getMadeIn());
            formatter.format(" %s\r\n", earphoneList.get(i).getWarranty());
            formatter.format(" %s\r\n", earphoneList.get(i).getModel());
            formatter.format(" %s\r\n", earphoneList.get(i).getMaterial());
            formatter.format(" %s\r\n", earphoneList.get(i).getAudioJack());
            formatter.format(" %s\r\n", earphoneList.get(i).getPrice());
            formatter.format(" %s\r\n", earphoneList.get(i).getSound().getSoundSystem());
            formatter.format(" %s\r\n", earphoneList.get(i).getSound().getSoundQuality());
            formatter.format(" %s\r\n", earphoneList.get(i).getSound().getSoundControl());
            formatter.format(" %s\r\n", earphoneList.get(i).getSound().getInputPower());
            formatter.format(" %s\r\n", earphoneList.get(i).getSound().getSpeaker());
            formatter.format(" %s\r\n", earphoneList.get(i).getSound().getSpeakerPower());
            formatter.format(" %s\r\n", earphoneList.get(i).getConnectivity().getConnectivityType());
            formatter.format(" %s\r\n", earphoneList.get(i).getConnectivity().getFrequencyRange());
            formatter.format(" %s\r\n", earphoneList.get(i).getConnectivity().getImpedence());
            formatter.format(" %s\r\n", earphoneList.get(i).getDeliveryFee());
            formatter.format(" %d\r\n", earphoneList.get(i).getProductNo());
            System.out.println("File create and write successfully done.\n");
            formatter.close();
        } catch (FileNotFoundException a) {
            System.out.println(a);
        }
    }


    @Override
    public void getAndSetFileData() {
        for (n = 0;; n++) {
            folder = "D:\\VSCODE\\JavaProject_1\\hamimShop\\EarphoneData\\" + "\\product_" + n + ".txt";
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
                            model = scan.nextLine();
                        } else if (num == 6) {
                            material = scan.nextLine();
                        } else if (num == 7) {
                            audioJack = scan.nextLine();
                        } else if (num == 8) {
                            price = scan.nextLine();
                        } else if (num == 9) {
                            soundSystem = scan.nextLine();
                        } else if (num == 10) {
                            soundQuality = scan.nextLine();
                        } else if (num == 11) {
                            soundControl = scan.nextLine();
                        } else if (num == 12) {
                            inputPower = scan.nextLine();
                        } else if (num == 13) {
                            speaker = scan.nextLine();
                        } else if (num == 14) {
                            speakerPower = scan.nextLine();
                        } else if (num == 15) {
                            connectivityType = scan.nextLine();
                        } else if (num == 16) {
                            frequencyRange = scan.nextLine();
                        } else if (num == 17) {
                            impedance = scan.nextLine();
                        } else if (num == 18) {
                            deliveryFee = scan.nextLine();
                        } else if (num == 19) {
                            productNo = scan.nextLine();
                        }

                        num++;

                    }
                    Sound sound = new Sound(soundSystem, soundQuality, soundControl, inputPower, speaker, speakerPower);
                    Connectivity connectivity = new Connectivity(connectivityType, frequencyRange, impedance);

                    earphoneList.add(new Earphone(productName, madeIn, price, deliveryFee, brandName, warranty, model,
                                    material, audioJack, sound, connectivity));
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
            System.out.print("Model : ");
            s = scan.nextLine();
            formatter.format(" %s\r\n", s);
            System.out.print("Material : ");
            s = scan.nextLine();
            formatter.format(" %s\r\n", s);
            System.out.print("Audio Jack : ");
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
            System.out.print("Input power : ");
            s = scan.nextLine();
            formatter.format(" %s\r\n", s);
            System.out.print("Speaker : ");
            s = scan.nextLine();
            formatter.format(" %s\r\n", s);
            System.out.print("Speaker power : ");
            s = scan.nextLine();
            formatter.format(" %s\r\n", s);
            System.out.print("Connectivity type : ");
            s = scan.nextLine();
            formatter.format(" %s\r\n", s);
            System.out.print("Frquency range : ");
            s = scan.nextLine();
            formatter.format(" %s\r\n", s);
            System.out.print("Impedance : ");
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


    public void getEarphoneData() { // It shows the pages outlook whith products

        System.out.println("Earphone   >>>\n");

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
                    String productInfo = "Name : " + earphoneList.get(h).getProductName();
                    System.out.print(productInfo);
                    for (int n = 1; n <= 32 - productInfo.length(); n++) {
                        System.out.print(" ");
                    }
                } else if (i == 1) {
                    String productInfo = "Brand : " + earphoneList.get(h).getBrandName();
                    System.out.print(productInfo);
                    for (int n = 1; n <= 32 - productInfo.length(); n++) {
                        System.out.print(" ");
                    }
                } else if (i == 2) {
                    String productInfo = "Made in : " + earphoneList.get(h).getMadeIn();
                    System.out.print(productInfo);
                    for (int n = 1; n <= 32 - productInfo.length(); n++) {
                        System.out.print(" ");
                    }
                } else if (i == 3) {
                    String productInfo = "Warranty : " + earphoneList.get(h).getWarranty();
                    System.out.print(productInfo);
                    for (int n = 1; n <= 32 - productInfo.length(); n++) {
                        System.out.print(" ");
                    }
                } else if (i == 4) {
                    String productInfo = "Model : " + earphoneList.get(h).getModel();
                    System.out.print(productInfo);
                    for (int n = 1; n <= 32 - productInfo.length(); n++) {
                        System.out.print(" ");
                    }
                } else if (i == 5) {
                    String productInfo = "Price : " + earphoneList.get(h).getPrice();
                    System.out.print(productInfo);
                    for (int n = 1; n <= 32 - productInfo.length(); n++) {
                        System.out.print(" ");
                    }
                } else if (i == 6) {
                    String productInfo = "Product No : " + earphoneList.get(h).getProductNo();
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


    public void getIndibidualEarphoneData(int a) { // It shows indibudual product's information
        ob1.box(1);
        System.out.println("Name              : " + earphoneList.get(a).getProductName());
        System.out.println("Brand             : " + earphoneList.get(a).getBrandName());
        System.out.println("Made in           : " + earphoneList.get(a).getMadeIn());
        System.out.println("Warranty          : " + earphoneList.get(a).getWarranty());
        System.out.println("Model             : " + earphoneList.get(a).getModel());
        System.out.println("Material          : " + earphoneList.get(a).getMaterial());
        System.out.println("Audio Jack        : " + earphoneList.get(a).getAudioJack());
        System.out.println("Price             : " + earphoneList.get(a).getPrice());
        System.out.println("--------------------------------------");
        System.out.println("Sound system      : " + earphoneList.get(a).getSound().getSoundSystem());
        System.out.println("Sound quality     : " + earphoneList.get(a).getSound().getSoundQuality());
        System.out.println("Sound control     : " + earphoneList.get(a).getSound().getSoundControl());
        System.out.println("Input power       : " + earphoneList.get(a).getSound().getInputPower());
        System.out.println("Speaker           : " + earphoneList.get(a).getSound().getSpeaker());
        System.out.println("Speaker power     : " + earphoneList.get(a).getSound().getSpeakerPower());
        System.out.println("--------------------------------------");
        System.out.println("Connectivity type : " + earphoneList.get(a).getConnectivity().getConnectivityType());
        System.out.println("Frequency range   : " + earphoneList.get(a).getConnectivity().getFrequencyRange());
        System.out.println("Impedance         : " + earphoneList.get(a).getConnectivity().getImpedence());
        System.out.println("--------------------------------------");
        System.out.println("Product No        : " + earphoneList.get(a).getProductNo());
    }
}
