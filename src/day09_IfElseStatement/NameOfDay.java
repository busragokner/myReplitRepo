package day09_IfElseStatement;

public class NameOfDay {
    public static void main(String[] args) {
        int n=10; //1 ~7
        String day;
        if (n==1) {
            System.out.println("Monday");
        } else if (n==2) {
            System.out.println("Tuesday");
        }else if(n==3){
            System.out.println("Wednesday");
        } else if (n==4) {
            day="Thursday";
        } else if (n==5) {
            System.out.println("Friday");
        } else if (n==6) {
            System.out.println("Saturday");
        }else if(n==7){
            System.out.println("Sunday");
        }else{
            System.out.println("Invalid"); }
        System.out.println("--------------------------------------------------------------");
    }
}
