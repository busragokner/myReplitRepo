package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3_NextLine {
    public static void main(String[] args) {
        //123Enter
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your full name: ");
        String fullName= scan.nextLine();

        System.out.println("Enter your Programming Language");
        String programming = scan.nextLine();

        System.out.println("Enter your age: ");
        int age = scan.nextInt();
        scan.nextLine();// capture the Entre key that user pressed for nextInt()

        System.out.println("Enter your School Name: ");
        String schoolName = scan.nextLine();

        System.out.println("fullName = " + fullName);
        System.out.println("programming = " + programming);
        System.out.println("schoolName = " + schoolName);
        System.out.println("age = " + age);
        /*nextLine(): If we are using nextLine() method ofter the other methods of scanner,
         we must provide one addition*/





    }
}
