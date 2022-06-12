package day09_IfElseStatement;

public class MaxNum {
    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 75;
        /*boolean maxNum1= num1 > num2;
        boolean maxNum2= num2 > num1;
        if (maxNum1) {
            System.out.println(num1 +" is the max number.");
        }else {
            System.out.println(num2+ " is the max number. ");
        }
         */

        if(num1>num2){
            System.out.println(num1+" is the max number.");
        }else {
            System.out.println(num2+" is the max number.");
        }
    }
}
