package Practice;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        /*
Check amount:
Service Quality:
Number of people entered: &&&&&
Total to pay: 600.0
Total tip: 100.0
Total per person: 120.0
Tip per person:
Poor = 5% Fair = 10% Good = 15% Great = 20% Excellent = 25%
         */

        String SplitOrNoSplit=scan.next();

        if(SplitOrNoSplit.equals("Yes")){
            System.out.println("Split:");}

        int numOfPeople=0;
        System.out.println("Number of people:");
        numOfPeople=scan.nextInt();
        System.out.println("Check amount:");
        double checkAmount=scan.nextDouble();
        System.out.println("Service Quality:");
        String serviceQuality=scan.next();

       System.out.println("Number of people entered:"+numOfPeople);



        System.out.println("Total to pay:"+checkAmount);

        double totalTip=0;
        if (serviceQuality.equals("Poor")){
            totalTip=(checkAmount*5)/100;
            System.out.println("Total tip:"+totalTip);
        }else if (serviceQuality.equals("Fair")){
            totalTip=(checkAmount*10)/100;
            System.out.println("Total tip:"+totalTip);
        }else if (serviceQuality.equals("Good")){
            totalTip=(checkAmount*15)/100;
            System.out.println("Total tip = " + totalTip);
        }else if (serviceQuality.equals("Great")){
            totalTip=(checkAmount*20)/100;
            System.out.println("Total tip = " + totalTip);
        }else if (serviceQuality.equals("Excellent")){
            totalTip=(checkAmount*25)/100;
            System.out.println("Total tip = " + totalTip);
        }

        double totalPerPerson=checkAmount/numOfPeople;
        System.out.println("Total per person: "+totalPerPerson);

        double tipPerPerson=totalTip/numOfPeople;
        System.out.println("Tip per person: "+tipPerPerson);



















    }
}
