package Practice;

import java.util.Scanner;

public class replit2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter cents:");
        int enterCents=scan.nextInt();
        if(enterCents>0 && enterCents<100) {
            int pennies=0;
            int quarters=0;
            int dimes=0;
            int nickels=0;
            System.out.println("Your change is "+ quarters+" quarters, "+dimes+" dimes, "+ nickels+" nickels and "+pennies+" pennies");


       }else {
            System.out.println("Invalid cents amount");
        }

    }
}
