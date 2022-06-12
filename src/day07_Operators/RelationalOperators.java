package day07_Operators;

public class RelationalOperators {
    public static void main(String[] args) {
        /*
        boolean true or false
        greater than               >
        greater than or equal      >=
        less than                  <
        less than or equal         <=
        equal                      ==
        not equal                  !=
        */
        boolean result1=200>40;
        System.out.println("result1 = " + result1);
        boolean result2= 300>=150;
        System.out.println("result2 = " + result2);
        boolean result3= 100 >= 100;
        System.out.println("result3 = " + result3);

        // credit score of 720
        int creditScore= 745;
        boolean isEligibleForLoan= creditScore >= 720;

        System.out.println("isEligibleForLoan = " + isEligibleForLoan);

        int score = 59;
        boolean hasFailed= score <= 59;
        System.out.println("hasFailed = " + hasFailed);

        boolean result7= 45 <= 60;
        System.out.println("----------------------------------------------------");
        int x=100;
        int y=200;

        boolean equal = x==y;
        System.out.println("equal = " + equal);

        boolean result8= "Muhtar "== "Good Guy"; // false
        System.out.println("result8 = " + result8);

        boolean result9='A' == 'a'; // false
        System.out.println("result9 = " + result9);

        boolean result10= "Java"=="Java" ;
        System.out.println("result10 = " + result10);

        System.out.println("---------------------------------------------------");

        // "Hello World"=="hello world"  = false
        boolean result11= 100 != 200.5; //true
        System.out.println("result11 = " + result11);

        boolean result12= "Java" != "Break"; // true
        System.out.println("result12 = " + result12);

        boolean result13= 300 !=300 ; // false
        System.out.println("result13 = " + result13);








    }
}
