package day08_IfStatements;

public class SingleIfStatementIntro {
    public static void main(String[] args) {

        int number = 301;
        boolean evenNumber = number % 2 == 0;
        if(evenNumber){
            System.out.println(number +" is even number.");}

        if (!evenNumber){
            System.out.println(number+ " is odd number."); }
        System.out.println("--------------------------------------------------------------");

        int n= -20;
        if(n>0){
            System.out.println(n+" is positive.");
        }
        if(n<0){
            System.out.println(n+" is negative. ");
        }
        if(n==0){
            System.out.println(n+" is zero.");
        }







        /*System.out.println("Odd Number");
        System.out.println("Even Number");*/

        /*
        Single if statement = can be used creating condition for 1 possible outcomes

         */

    }
}
