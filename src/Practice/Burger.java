package Practice;

import java.util.Scanner;

public class Burger {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String in = s.next();
        double price=10.0;
        double soda=2.0;
        double fries=3.5;

        if (in.equals("burger") || in.equals("chicken")){
            System.out.println(price);

        }else if (in.equals("soda")){
            System.out.println(soda);
        }else {
            System.out.println(fries);
        }
    }
}
