package ridzdoe;

import java.util.Scanner;

public class Shop {
    public void Main() {

        Scanner scan = new Scanner(System.in);

        ControlPannel controlData = new ControlPannel();
        Owner owner = new Owner();

        String folder;
        String password;

        int n, t;
        int a;
        boolean b = true, c = false;

        System.out.print("Are you Owner(1) or user(2) : ");
        a = scan.nextInt();
        String www = scan.nextLine();
        System.out.println();

        if (a == 1) {

            while (b) {
                System.out.print("Enter your password : ");
                password = scan.nextLine();
                c = owner.OwnerVerification(password);

                if (c == true) {
                    b = false;
                    System.out.println("Bingo! << Correct password >>\n");
                    System.out.print("Do you want to change password Yes(1)  or No(2)  >>> ");
                    t = scan.nextInt();
                    www = scan.nextLine();

                    if (t == 1) {
                        System.out.print("\nEnter new password : ");
                        password = scan.nextLine();
                        owner.setOwnerPasswordFileData(password);
                    }
                } else {
                    System.out.println("Wrong password. Please try again khokha !!!\n");
                }
            }

        }

        System.out.println();

        if (a == 1 && c) {
            int i;
            System.out.print(
                    "If you want to add all products then enter 1 \nor, If you want to change single products information then enter 2 : ");
            i = scan.nextInt();
            System.out.println();

            if (i == 1) {
                controlData.setAllData();
            }

            else if (i == 2) {
                System.out.print("MobileData(1), AirPods(2), Earphone(3), Rice(4)  \n\nEnter product type no. : ");
                int p = scan.nextInt();
                if (p == 1) {
                    System.out.print("Product serial no. : ");
                    n = scan.nextInt();
                    folder = "D:\\VSCODE\\JavaProject_1\\hamimShop\\MobileData\\" + "\\product_" + (n - 1) + ".txt";

                    controlData.changeMobileData(folder, n);
                } else if (p == 2) {
                    System.out.print("Product serial no. : ");
                    n = scan.nextInt();
                    folder = "D:\\VSCODE\\JavaProject_1\\hamimShop\\AirPodsData\\" + "\\product_" + (n - 1) + ".txt";

                    controlData.changeAirPodsData(folder, n);
                } else if (p == 3) {
                    System.out.print("Product serial no. : ");
                    n = scan.nextInt();
                    folder = "D:\\VSCODE\\JavaProject_1\\hamimShop\\EarphoneData\\" + "\\product_" + (n - 1) + ".txt";

                    controlData.changeEarphoneData(folder, n);
                } else if (p == 4) {
                    System.out.print("Product serial no. : ");
                    n = scan.nextInt();
                    folder = "D:\\VSCODE\\JavaProject_1\\hamimShop\\RiceData\\" + "\\product_" + (n - 1) + ".txt";

                    controlData.changeRiceData(folder, n);
                }
            }
        }

        // controlData.setDataFromFile();
        controlData.getAlldata();
    }
}