package ridzdoe;

import java.util.Scanner;

public class Order implements SignupLogin{
    Scanner scan = new Scanner(System.in);

    FrontEnd frontEnd = new FrontEnd();

    ProductInfo productInfo = new ProductInfo();

    CastomerData castomer = new CastomerData();

    MobileData mobiles = new MobileData();
    AirPodsData airpods = new AirPodsData();
    EarphoneData earphone = new EarphoneData();
    RiceData rice = new RiceData();

    String productNo, productType;

    public Order(String a, String s) {
        this.productNo = a;
        this.productType = s;

        System.out.print("\nSignin (1) Or, Login (2) : ");
        int i = scan.nextInt();
        String st = scan.nextLine();
        if (i == 1) {
            System.out.println("\nSign in : \n");
            Signup();
        } else if (i == 2) {
            System.out.println("\nLoggin in : \n");
            Login();
        }

    }

    int Castomer;
    String gmailId, password;
    String str;

    public void Signup() {
        while (true) {
            System.out.print("Enter gmail id : ");
            gmailId = scan.nextLine();
            System.out.print("Enter password : ");
            password = scan.nextLine();

            Castomer = castomer.AccountChecker(gmailId, password);

            if (Castomer == 3) {
                System.out.println("\nYou already have an account with this gmail id.\n");

                System.out.print("Conferm order(c) or cancel(press Enter)  >>> ");
                //
                str = scan.nextLine();

                break;

            } else if (Castomer == 1) {
                System.out.println("Wrong password. Please, try again");
            } else {
                castomer.setCastomerData(gmailId, password);

                System.out.println("Sign in successful");

                System.out.print("Conferm order(c) or cancel(press Enter)  >>> ");
                //
                str = scan.nextLine();

                break;
            }
        }

    }


    public void Login() {
        while (true) {
            System.out.print("Enter gmail id : ");
            gmailId = scan.nextLine();
            System.out.print("Enter password : ");
            password = scan.nextLine();

            Castomer = castomer.AccountChecker(gmailId, password);

            if (Castomer == 3) {
                System.out.println("Loggin successfully done");

                System.out.print("Conferm order(c) or cancel(press Enter)  >>> ");
                //
                str = scan.nextLine();

                break;

            } else if (Castomer == 1) {
                System.out.println("Wrong password. Please, try again");
            } else {
                System.out.println("We don't find such an account like this.\nSo, please sign in first.");

                System.out.println("Sign in : \n");
                Signup();
                break;

            }
        }

    }



    public void setOrderInfo() {

    }






    public void getProductInfo(String str, String dataType) {

        frontEnd.box(1);

        if (dataType.equals("Mobile")) {
            productInfo.getProductInfo(str, mobiles);
        } else if (dataType.equals("AirPods")) {
            productInfo.getProductInfo(str, airpods);
        } else if (dataType.equals("Earphone")) {
            productInfo.getProductInfo(str, earphone);
        } else if (dataType.equals("Rice")) {
            productInfo.getProductInfo(str, rice);
        }

    }

}