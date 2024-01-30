package ridzdoe;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;

public class RiceData implements FileData{
    String productType;

    String productName;
    String produceIn;
    String price;
    String deliveryFee;
    String brandName;
    String duration;
    String riceType;
    String riceSize;

    String productNo;

    Scanner scan = new Scanner(System.in);
    FrontEnd ob1 = new FrontEnd();
    ArrayList<Rice> riceList = new ArrayList<>(); // Creating Earphone's objects

    int a, n;
    String s;


    public void setRiceData() {
        System.out.print("How many Rice products : ");
        a = scan.nextInt();
        s = scan.nextLine();

        for (int i = 0; i < a; i++) {
            System.out.println((i + 1) + " No. Earphone :");
            System.out.print("Enter product name : ");
            productName = scan.nextLine();
            System.out.print("Produce in : ");
            produceIn = scan.nextLine();
            System.out.print("Enter brand name : ");
            brandName = scan.nextLine();
            System.out.print("Duration : ");
            duration = scan.nextLine();
            System.out.print("Price : ");
            price = scan.nextLine();
            System.out.print("Rice type : ");
            riceType = scan.nextLine();
            System.out.print("Rice size : ");
            riceSize = scan.nextLine();
            System.out.print("Delivery fee : ");
            deliveryFee = scan.nextLine();

            riceList.add(new Rice(productName, produceIn, price, deliveryFee, brandName, duration, riceType, riceSize));
            System.out.println();
            setFileData(i);
        }
    }


    int i;
    String folder;

    @Override
    public void clearFile() {
        folder = "D:\\VSCODE\\JavaProject_1\\hamimShop\\RiceData";
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

        folder = "D:\\VSCODE\\JavaProject_1\\hamimShop\\RiceData";
        File dir = new File(folder);
        dir.mkdir(); // directory will be created

        this.i = i;
        folder = "D:\\VSCODE\\JavaProject_1\\hamimShop\\RiceData\\" + "\\product_" + i + ".txt";

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
            formatter.format(" %s\r\n", "Rice");
            formatter.format(" %s\r\n", riceList.get(i).getProductName());
            formatter.format(" %s\r\n", riceList.get(i).getMadeIn());
            formatter.format(" %s\r\n", riceList.get(i).getBrandName());
            formatter.format(" %s\r\n", riceList.get(i).getDuration());
            formatter.format(" %s\r\n", riceList.get(i).getPrice());
            formatter.format(" %s\r\n", riceList.get(i).getRiceType());
            formatter.format(" %s\r\n", riceList.get(i).getRiceSize());
            formatter.format(" %s\r\n", riceList.get(i).getDeliveryFee());
            formatter.format(" %d\r\n", riceList.get(i).getProductNo());
            System.out.println("File create and write successfully done.\n");
            formatter.close();
        } catch (FileNotFoundException a) {
            System.out.println(a);
        }
    }


    @Override
    public void getAndSetFileData() { 
        for (n = 0;; n++) {
            folder = "D:\\VSCODE\\JavaProject_1\\hamimShop\\RiceData\\" + "\\product_" + n + ".txt";
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
                            produceIn = scan.nextLine();
                        } else if (num == 3) {
                            brandName = scan.nextLine();
                        } else if (num == 4) {
                            duration = scan.nextLine();
                        } else if (num == 5) {
                            price = scan.nextLine();
                        } else if (num == 6) {
                            riceType = scan.nextLine();
                        } else if (num == 7) {
                            riceSize = scan.nextLine();
                        } else if (num == 8) {
                            deliveryFee = scan.nextLine();
                        } else if (num == 9) {
                            productNo = scan.nextLine();
                        }

                        num++;

                    }

                    riceList.add(new Rice(productName, produceIn, price, deliveryFee, brandName, duration, riceType, riceSize));
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
            formatter.format(" %s\r\n", "Rice");
            System.out.print("Enter product name : ");
            s = scan.nextLine();
            formatter.format(" %s\r\n", s);
            System.out.print("Produce in : ");
            s = scan.nextLine();
            formatter.format(" %s\r\n", s);
            System.out.print("Enter brand name : ");
            s = scan.nextLine();
            formatter.format(" %s\r\n", s);
            System.out.print("Duration : ");
            s = scan.nextLine();
            formatter.format(" %s\r\n", s);
            System.out.print("Price : ");
            s = scan.nextLine();
            formatter.format(" %s\r\n", s);
            System.out.print("Rice type : ");
            s = scan.nextLine();
            formatter.format(" %s\r\n", s);
            System.out.print("Rice size : ");
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



    public void getRiceData() { // It shows the pages outlook whith products

        System.out.println("Rice   >>>\n");

        int b = a / 5, c = a % 5;
        int h = 0, d = 0, t = 0;

        for (int i = 0; i <= 4 && h != a; i++) {
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
                    String productInfo = "Name : " + riceList.get(h).getProductName();
                    System.out.print(productInfo);
                    for (int n = 1; n <= 32 - productInfo.length(); n++) {
                        System.out.print(" ");
                    }
                } else if (i == 1) {
                    String productInfo = "Brand : " + riceList.get(h).getBrandName();
                    System.out.print(productInfo);
                    for (int n = 1; n <= 32 - productInfo.length(); n++) {
                        System.out.print(" ");
                    }
                } else if (i == 2) {
                    String productInfo = "Rice type : " + riceList.get(h).getRiceType();
                    System.out.print(productInfo);
                    for (int n = 1; n <= 32 - productInfo.length(); n++) {
                        System.out.print(" ");
                    }
                } else if (i == 3) {
                    String productInfo = "Price : " + riceList.get(h).getPrice();
                    System.out.print(productInfo);
                    for (int n = 1; n <= 32 - productInfo.length(); n++) {
                        System.out.print(" ");
                    }
                } else if (i == 4) {
                    String productInfo = "Product No : " + riceList.get(h).getProductNo();
                    System.out.print(productInfo);
                    for (int n = 1; n <= 32 - productInfo.length(); n++) {
                        System.out.print(" ");
                    }
                }
            }

            if (i == 4) {
                i = -1;
                t = h;
            } else {
                h = t;
            }
            System.out.println();
        }
        System.out.println("\n");
    }


    public void getIndibidualRiceData(int a) { // It shows indibudual product's information
        ob1.box(1);
        System.out.println("Name              : " + riceList.get(a).getProductName());
        System.out.println("Brand             : " + riceList.get(a).getBrandName());
        System.out.println("Produce in        : " + riceList.get(a).getMadeIn());
        System.out.println("Duration          : " + riceList.get(a).getDuration());
        System.out.println("Price             : " + riceList.get(a).getPrice());
        System.out.println("--------------------------------------");
        System.out.println("Rice type         : " + riceList.get(a).getRiceType());
        System.out.println("Rice size         : " + riceList.get(a).getRiceSize());
        System.out.println("--------------------------------------");
        System.out.println("Product No        : " + riceList.get(a).getProductNo());
    }
}