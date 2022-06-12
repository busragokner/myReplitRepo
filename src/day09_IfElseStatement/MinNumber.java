package day09_IfElseStatement;

public class MinNumber {
    public static void main(String[] args) {
        int num1= 100;
        int num2= 100;
        boolean minNum= num1 < num2;
        boolean minNum2= num2<num1;
        boolean equal = num1==num2;
        if(minNum){
            System.out.println(num1 +" is the minimum number."); }
        if(minNum2){
            System.out.println(num2+" is the minimum number. "); }
        if (equal) {
            System.out.println("Equal");}





    }
}
