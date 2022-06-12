package day12_Scanner;

import java.util.Scanner;

public class replit {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Welcome to the patient portal!");
        System.out.println("Enter your first name");
        String firstName=scan.nextLine();
        System.out.println("Enter your last name");
        String lastName=scan.nextLine();
        System.out.println("Enter your email");
        String email = scan.next();
        scan.nextLine();//to capture Enter key press
        System.out.println("Enter your street");
        String street = scan.nextLine();
        System.out.println("Enter your city");
        String city= scan.nextLine();
        System.out.println("Enter your state");
        String state=scan.nextLine();

        System.out.println("Enter your zip code");
        int zipCode= scan.nextInt();
        scan.nextLine();
        System.out.println("Enter your work phone number");
        long workPhoneNumber=scan.nextLong();
        System.out.println("Enter your personal phone number");
        long personalPhoneNumber=scan.nextLong();
        scan.nextLine();
        System.out.println("Enter your age");
        int age=scan.nextInt();
        System.out.println("Enter your height");
        double height= scan.nextDouble();
        System.out.println("Enter your weight");
        double weight= scan.nextDouble();
        boolean isMarried=scan.nextBoolean();







       /*
       Welcome to the patient portal!
Please enter your personal information
Enter your first name
Enter your last name
Enter your email
Enter your street
Enter your city
Enter your state
Enter your zip code
Enter your work phone number
Enter your personal phone number
Enter your age
Enter your height
Enter your weight
Are you married?
Patient personal information
Full name: Tyson, Mike
Address: 7911 Westpark Dr, McLean, VA 22102
Contacts: work phone number - 7896542315, personal phone number - 2406542315, email: miketyson@gmail.com
Age: 45
Height: 6.1
Weight: 175.2 pounds
Married?: false
        */

    }
}
