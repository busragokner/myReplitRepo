package day18_NestedLoop;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your username: ");
        String userName=scan.next();

        System.out.println("Enter your password: ");
        String password=scan.next();

        if (userName.equals("Cydeo") && password.equals("WoodenSpoon")){
            System.out.println("Logged In");
        }else {
            for (int i = 1; i <4 ; i++) {
                System.out.println("Incorrect username or password");
                System.out.println("Enter your username: ");
                userName=scan.next();
                System.out.println("Enter your password: ");
                password=scan.next();

                if (userName.equals("Cydeo") && password.equals("WoodenSpoon")){
                    break;
                }

            }
            if (!(userName.equals("Cydeo") && password.equals("WoodenSpoon"))){
                System.err.println("Your account is locked, Please contact support team");
            }
        }
    }
}
