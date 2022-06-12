package Practice;

import java.util.Scanner;

public class FindTheLength {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the text:");
        String text=scan.next();
        int length=text.length();
        System.out.println(length);
    }
}
