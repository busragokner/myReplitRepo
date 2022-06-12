package day15_ForLoop;

import java.util.Scanner;

public class DigitUpperLowerSpecialChar {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String word=scan.next();

        scan.close();

        char firstChar=word.charAt(0);
        String result="";

        if(firstChar>='0' && firstChar<='9'){
            result="First character is digit";
        }else if(firstChar>='a' && firstChar<='z'){
            result="First character is lowercase letter";
        }else if(firstChar>='A' && firstChar<='z'){
            result="First character is uppercase letter";
        }else {
            result="First character is special character";
        }



    }
}
