package day12_Scanner;

//import java.util.*;//wild import: everything from the package
import java.util.Scanner;
public class ScannerPractice {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        //Scanner scanner= new Scanner(System.in);
        // scanner.nextInt();
        System.out.println("Enter a number between 1 to 7:");
        int num= scanner.nextInt();
        String result="";
                if(num>=1 && num<=7){
                    result =(num == 1)? "Monday" : (num==2)? "Tuesday" :(num == 3)? "Wednesday" : (num== 4)?
                            "Thursday" : (num==5)? "Friday" : (num == 6)? "Saturday" : "Sunday" ;
                    }
                else{
                    result="Invalid Number"; }
        System.out.println(result);

        System.out.println("--------------------------------------------------------");
        System.out.print("Enter Item1 and its price: ");

        String item1Name=scanner.nextLine();
        double item1PRice=scanner.nextDouble();

        System.out.println("Enter Item2 and its price: ");
        String item2Name=scanner.nextLine();
        double item2Price=scanner.nextDouble();
        System.out.println("Enter Item3 and its price: ");
        String item3Name=scanner.nextLine();
        double item3Price=scanner.nextDouble();
        double total= item1PRice+item2Price+item3Price;

        System.out.println(total);
    }
    }