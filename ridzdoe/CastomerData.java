package ridzdoe;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class CastomerData {

    String gmailId;
    String password;
    String castomerName;
    String phoneNumber;
    String city;
    String address;

    Scanner scan = new Scanner(System.in);
    FrontEnd ob1 = new FrontEnd();

    public void setCastomerData(String gmailId, String password) {

        this.gmailId = gmailId;
        this.password = password;
        System.out.print("Enter your name : ");
        castomerName = scan.nextLine();
        System.out.print("Enter phone number : ");
        phoneNumber = scan.nextLine();
        System.out.print("City : ");
        city = scan.nextLine();
        System.out.print("Enter address : ");
        address = scan.nextLine();

        System.out.println();

        setFileData();

    }

    public int emtyFile(String folder) {
        this.folder = folder;

        for (t = 0;; t++) {
            File file1 = new File(folder + "\\castomer_" + t + ".txt");

            if (file1.exists()) {

            } else {

                break;
            }
        }

        return t;

    }

    int i, t, n;
    String folder, s;

    public void setFileData() {
        folder = "D:\\VSCODE\\JavaProject_1\\hamimShop\\CastomerData";
        File dir = new File(folder);
        dir.mkdir(); // directory will be created

        i = emtyFile(folder);

        folder = "D:\\VSCODE\\JavaProject_1\\hamimShop\\CastomerData\\" + "\\castomer_" + i + ".txt";

        File file = new File(folder);

        try {
            file.createNewFile(); // File will be created
            System.out.println("Files are created");
        } catch (Exception e) {
            System.out.println(e);
        }

        if (file.exists()) {
            System.out.println("file exists");
        }

        try {
            Formatter formatter = new Formatter(folder);
            formatter.format(" %s\r\n", gmailId);
            formatter.format(" %s\r\n", password);
            formatter.format(" %s\r\n", castomerName);
            formatter.format(" %s\r\n", phoneNumber);
            formatter.format(" %s\r\n", city);
            formatter.format(" %s\r\n", address);

            System.out.println("File create and write successfully done.\n");
            formatter.close();
        } catch (FileNotFoundException a) {
            System.out.println(a);
        }
    }

   

    
    String gmailIdf, passwordf;

    public int AccountChecker(String gmail, String password) { // It returns the castomer file no

        int castomer = 0;

        folder = "D:\\VSCODE\\JavaProject_1\\hamimShop\\CastomerData";
        File dir = new File(folder);
        dir.mkdir(); // directory will be created

        for (n = 0;; n++) {
            folder = "D:\\VSCODE\\JavaProject_1\\hamimShop\\CastomerData\\" + "\\castomer_" + n + ".txt";

            int num = 0;
            try {
                File file1 = new File(folder);

                if (file1.exists()) {
                    Scanner scan = new Scanner(file1);

                    while (scan.hasNextLine() ) {
                        if (num == 0) {
                            gmailIdf = scan.nextLine();
                            
                        } else if (num == 1) {
                            passwordf = scan.nextLine();
                            
                        }else{
                            String h = scan.nextLine();
                        }

                        num++;

                    }
                    
                    if (gmail.trim().equalsIgnoreCase(gmailIdf.trim())) {
                        castomer = 1;
                    } 

                    if (password.trim().equals(passwordf.trim())) {
                        castomer = castomer+2;
                    } 

                    if (gmail.trim().equals(gmailIdf.trim()) && password.trim().equals(passwordf.trim())) {
                        castomer = castomer+0;
                        break;
                    } 

                } else {
                    break;
                }

            } catch (Exception e) {
                System.out.println(e);
            }

        }

        return castomer;

    }




    public void getAndSetCastomerFileData(int n) {
        folder = "D:\\VSCODE\\JavaProject_1\\hamimShop\\CastomerData\\" + "\\castomer_" + n + ".txt";
        int num = 0;
        try {
            File file1 = new File(folder);

            Scanner scan = new Scanner(file1);

            while (scan.hasNextLine()) {
                if (num == 0) {
                    gmailId = scan.nextLine();
                } else if (num == 1) {
                    password = scan.nextLine();
                } else if (num == 2) {
                    castomerName = scan.nextLine();
                } else if (num == 3) {
                    phoneNumber = scan.nextLine();
                } else if (num == 4) {
                    city = scan.nextLine();
                } else if (num == 5) {
                    address = scan.nextLine();
                }

                num++;

            }

            scan.close();

        } catch (Exception a) {
            System.out.println(a);
        }

    }

    public void getCastomerData(int a) { // It shows castomer's information
        getAndSetCastomerFileData(a);

        ob1.box(1);
        System.out.println("Name         : " + castomerName);
        System.out.println("Gmail        : " + gmailId);
        System.out.println("Phone number : " + phoneNumber);
        System.out.println("City         : " + city);
        System.out.println("Address      : " + address);
    }
}