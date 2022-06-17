package day17_While_DoWhile;

import java.util.Scanner;

public class whileLoopPractice {
    public static void main(String[] args) {


        //username ="Cydeo"
        //password = "Cydeo123"

        int attempt = 3;

        //while(invalid && hasAttempt)

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter your username:");
        String userName=scan.next();

        System.out.println("Enter your password:");
        String password=scan.next();

        if (userName.equals("Cydeo") && password.equals("Cydeo123")){
            System.out.println("Logged in");
        }else {
            int attempts=3;
            while (!(userName.equals("Cydeo") && password.equals("Cydeo123")) && attempts > 0){
                System.out.println("Incorrect username or password, please re-enter");
                System.out.println("Enter your username:");
                userName=scan.next();

                System.out.println("Enter your password");
                password=scan.next();
                attempts--;
            }
            if (userName.equals("Cydeo") && password.equals("Cydeo123")){
                System.out.println("Logged in");}
            else {
                System.out.println("Your account is locked. ");
            }










    }
}}
