package Practice;

import java.util.Scanner;

public class replit1 {
    public static void main(String[] args) {
        /*
        Welcome to the Grader!
Please enter subject name number 1 and score for this subject
Please enter subject name number 2 and score for this subject
Please enter subject name number 3 and score for this subject
Please enter subject name number 4 and score for this subject
Please enter subject name number 5 and score for this subject
Summary: Java - 4.2, Selenium - 5.8, SQL - 4.8, HTML - 5.2, Git - 5.0
Your average score is: 5.0
Thank you for using Grader!
Goodbye!
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Welcome to the Grader!");
        System.out.println("Please enter subject name number 1 and score for this subject");
        String math=scan.nextLine();
        double num1=scan.nextDouble();

        System.out.println("Please enter subject name number 2 and score for this subject");
        String biology=scan.next();
        scan.nextLine();
        double num2=scan.nextDouble();

        System.out.println("Please enter subject name number 3 and score for this subject");
        String english=scan.next();
        scan.nextLine();
        double num3=scan.nextDouble();

        System.out.println("Please enter subject name number 4 and score for this subject");
        String chemistry=scan.next();
        scan.nextLine();
        double num4=scan.nextDouble();

        System.out.println("Please enter subject name number 5 and score for this subject");
        String music=scan.next();
        scan.nextLine();
        double num5=scan.nextDouble();

        System.out.println("Summary: "+ math+ " - " + num1+ ", "+ biology+" - "+ num2+", "+ english+" - "+num3+", "+
                chemistry+" - "+num4+", "+ music+" - "+num5);
        double score=(num1+num2+num3+num4+num5)/5;
        System.out.println("Your average score is: "+ score);
        System.out.println("Thank you for using Grader!");
        System.out.println("Goodbye!");






    }
}
