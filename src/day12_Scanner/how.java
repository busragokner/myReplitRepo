package day12_Scanner;

import java.util.Scanner;

public class how {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("How many people do you live with? :");

        int howMany = input.nextInt();

        if(howMany >=0 && howMany<= 2) {
            System.out.println("Live with less than 3 people");
        } else if (howMany >=3 && howMany<=6 ) {
            System.out.println("Live with 3 - 6 people");

        }else {
            System.out.println("Live with more than 6 people");

        }if(howMany>6){
            System.out.println("Invalid number");

    }
}
    }

