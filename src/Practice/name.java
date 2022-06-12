package Practice;

import java.util.Scanner;

public class name {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String purchaseName=scan.nextLine();
        int purchase=1;
        int giftCard=100;
        int blanket=60;
        int charger=25;
        int hat=25;
        int headphones=30;
        int laptop=200;
        int pants=50;
        int pillow=40;
        int smartPhone=1000;
        int socks=5;
        int usbCable=10;
        if(purchase>=1 && purchase<=100){
            switch (purchaseName){
                case "Blanket":
                    System.out.println("Thank you for your purchase!");
                    System.out.println("Your current balance is: "+(giftCard-blanket)+"$");
                    break;
                case "Hat":
                    System.out.println("Thank you for your purchase!");
                    System.out.println("Your current balance is: "+(giftCard-hat)+"$");
                    break;
                case "Headphones":
                    System.out.println("Thank you for your purchase!");
                    System.out.println("Your current balance is: "+(giftCard-headphones)+"$");
                    break;
                case "Laptop":
                    System.out.println("Sorry, not enough funds on your gift card!");
                    break;
                case "Pants":
                    System.out.println("Thank you for your purchase!");
                    System.out.println("Your current balance is: "+(giftCard-pants)+"$");
                    break;
                case "Pillow":
                    System.out.println("Thank you for your purchase!");
                    System.out.println("Your current balance is: "+(giftCard-pillow)+"$");
                    break;
                case "Smartphone":
                    System.out.println("Sorry, not enough funds on your gift card!");
                    break;


                case "Socks":
                    System.out.println("Thank you for your purchase!");
                    System.out.println("Your current balance is: "+(giftCard-socks)+"$");
                    break;
                case "Charger":
                    System.out.println("Thank you for your purchase!");
                    System.out.println("Your current balance is: "+(giftCard-charger)+"$");
                    break;

                case "USB cable":
                    System.out.println("Thank you for your purchase!");
                    System.out.println("Your current balance is: "+(giftCard-usbCable)+"$");

                default:
                    System.out.println("Invalid item!");





            }
        }


        /*
         Blanket - 60$ Charger - 25$ Hat - 25$ Headphones - 30$ Laptop - 200$ Pants - 50$ Pillow - 40$
         Smartphone - 1000$ Socks - 5$
         USB cable - 10$
         */








    }
}
