package day11_Switch_Scanner;
import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {
        //Scanner keyboard = new Scanner(System.in);
        Scanner input =new Scanner(System.in);
        int num1;
        double num2;
        System.out.println("Enter an integer number");
        num1 = input.nextInt();
        System.out.println("Enter a decimal number");
        num2 = input.nextDouble();
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        input.close(); // closes the scanner, after this scanner can not be used anymore


        // double num2 = input.nextDouble();


    }
}
