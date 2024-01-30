package ridzdoe;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class Owner {
    public void setOwnerPasswordFileData(String password) {
        folder = "D:\\VSCODE\\JavaProject_1\\hamimShop\\OwnerData";
        File dir = new File(folder);
        dir.mkdir(); // directory will be created

        folder = "D:\\VSCODE\\JavaProject_1\\hamimShop\\OwnerData\\" + "\\owner_0.txt";

        File file = new File(folder);

        try {
            file.createNewFile(); // File will be created
            System.out.println("\nFiles are created");
        } catch (Exception e) {
            System.out.println(e);
        }

        if (file.exists()) {
            System.out.println("file exists");
        }

        try {
            Formatter formatter = new Formatter(folder);
            formatter.format(" %s\r\n", password);

            System.out.println("Password update successfully done.\n");
            formatter.close();
        } catch (FileNotFoundException a) {
            System.out.println(a);
        }
    }

    int n;
    String folder;
    String passwordf;

    public boolean OwnerVerification(String password) { // It returns the castomer file no

        boolean owner = false;

        folder = "D:\\VSCODE\\JavaProject_1\\hamimShop\\OwnerData";
        File dir = new File(folder);
        dir.mkdir(); // directory will be created

        folder = "D:\\VSCODE\\JavaProject_1\\hamimShop\\OwnerData\\" + "\\owner_0.txt";

        try {
            File file1 = new File(folder);

            if (file1.exists()) {
                Scanner scan = new Scanner(file1);

                while (scan.hasNextLine()) {
                    passwordf = scan.nextLine();
                }

                if (password.trim().equals(passwordf.trim())) {
                    owner = true;
                }

            } else {
                setOwnerPasswordFileData(password);
                owner = true; 
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        return owner;

    }
}
