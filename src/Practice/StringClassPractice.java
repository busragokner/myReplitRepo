package Practice;

import java.util.Scanner;

public class StringClassPractice {
    public static void main(String[] args) {
      /*
      Create a class called Reverse, write a program that will reverse a
string.
Your program should reverse a string only 5 characters long.
If word is shorter, display message: "Too short!".
If word is longer, display message: "Too long!".
Otherwise, reverse this word and print out result into the console.
       */
        String ayrac = "--------------------------***---------------------------------------";
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String name = scan.next();

        String result = "";
        if (name.length() > 5) {
            System.out.println("Too long");
        } else if (name.length() < 5) {
            System.out.println("Too short");
        } else {
            for (int i = name.length() - 1; i >= 0; i--) {
                result += name.charAt(i);

            }
            System.out.print(result);
        }

        scan.close();
        System.out.println();

        System.out.println(ayrac);

        String dublicate = "bbbcccdddggg";
        String result2 = "";

        for (int i = 0; i <= dublicate.length() - 1; i++) {
            String ch = "" + dublicate.charAt(i);

            if (!result2.contains(ch)) {

                result2 += ch;

            }



        } System.out.println(result2);
    }}
