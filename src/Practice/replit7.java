package Practice;

import java.util.Scanner;

public class replit7 {
    public static void main(String[] args) {
        //if n1 is biggest output: "n1 is bigger"
        //if n2 is biggest output: "n2 is bigger"
        //if n3 is biggest output: "n3 is bigger"


        Scanner scan=new Scanner(System.in);
        System.out.println("Enter month number");
        int monthNum = scan.nextInt();

        if(monthNum>=1 && monthNum<=12){
            switch (monthNum){
            case 1:
                System.out.println("January");
                break;
                case 2:
                    System.out.println("February");
                    break;
                case 3:
                    System.out.println("March");
                    break;
                case 4:
                    System.out.println("April");
                    break;
                case 5:
                    System.out.println("May");
                    break;
                case 6:
                    System.out.println("June");
                    break;
                case 7:
                    System.out.println("July");
                    break;
                case 8:
                    System.out.println("August");
                    break;
                case 9:
                    System.out.println("September");
                    break;
                case 10:
                    System.out.println("October");
                    break;
                case 11:
                    System.out.println("November");
                    break;
                case 12:
                    System.out.println("December");


        }




    }else {
            System.out.println("Invalid month number");
        }
}}
