package ridzdoe;

public class FrontEnd {

    String mobile = "Mobile", electronics = "Electronics", clothes = "Clothes";

    public void productImg() {
        String name = "RidzDoe";
        String shop = "Welcome to our e-Shop";
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 149; j++) {
                if ((i == 1 || i == 7) && (j > 1 && j < 149)) {
                    System.out.print("_");
                } else if ((i > 1) && (j == 1 || j == 149)) {
                    System.out.print("|");
                } else if (i == 4 && (j >= 71 && j <= 77)) {
                    System.out.print(name.charAt(j - 71));
                } else if ((i == 5) && (j > 1 && j < 149)) {
                    System.out.print("=");
                } else if (i == 6 && (j >= 64 && j <= 84)) {
                    System.out.print(shop.charAt(j - 64));
                } else
                    System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("\n\n");

    }

    int a;

    public void box(int a) {
        this.a = a;
        String name = "Img";

        for (int i = 1, n = 1; i <= 10; i++, n++) {
            for (int j = 1; j <= 20; j++) {
                if ((i == 1 || i == 4 || i == 10) && (j > 1 && j < 20)) {
                    System.out.print("_");
                } else if ((i > 1) && (j == 1 || j == 20)) {
                    System.out.print("|");
                } else if (i == 7 && (j > 8 && j < 12)) {
                    System.out.print(name.charAt(j - 9));
                } else
                    System.out.print(" ");
            }

            if (n <= a - 1) {
                System.out.print("            ");
                i--;
            } else {
                n = 0;
                System.out.println();
            }
        }
        System.out.println();
    }

    public void Line(){
        for(int i=1; i<=149; i++){
            System.out.print("-");
        }
        System.out.println("\n");
    }
}