package day25_CustomMethod_Overloading;

import Utilities.StringUtilities;

public class Test {
    public static void main(String[] args) {
        String str = "Java Programming Language";
        StringUtilities.printEachChar(str);

        String result = StringUtilities.reverse(str);
        System.out.print(result);

        System.out.println("<=========================================================>");

        String word = "Civic";

        boolean palindrome  =StringUtilities.isPalindrome(word);
        System.out.println("palindrome = " + palindrome);

        System.out.println("<=========================================================>");

        String [] names = {"Anna", "Java", "Python", "racecar", "Mom", "Cydeo"};

        int count = 0;

        for (String each : names) {
            if (StringUtilities.isPalindrome(each)){
                count++ ; }
        }
        System.out.println("count = " + count);

        System.out.println("<====================================================>");

        String s2 = "aaaaaabbbbyyyyh";
        String nonDup = StringUtilities.removeDuplicate(s2);

        System.out.println("nonDup = " + nonDup);
    }
}
