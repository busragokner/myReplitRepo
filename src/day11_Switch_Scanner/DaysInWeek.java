package day11_Switch_Scanner;

public class DaysInWeek {
    public static void main(String[] args) {
        /*
        switch(data){
        case data1:
                 Statement;
                 break;
        case data2:
                 Statement;
                 break;

        default:
                 Statement;
                 break;
        }
         */

        int number =7;
        switch (number){//1,2,3,4,5,6,7. ==
            case 1:
                System.out.println("Monday");
                break;
            case  2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:// only gets executed if none of the case blocks are matching
                System.out.println("Invalid");
                break;


            //long number = 9L;
            // float number = 9F;
            //double number = 9D;
            //boolean number = true; we can not use this one.







        }
    }
}
