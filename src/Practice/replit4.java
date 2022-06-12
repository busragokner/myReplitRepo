package Practice;

import java.util.Scanner;

public class replit4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens:");
        int seniorCitizen= scan.nextInt();
        int nonSeniorCitizen=scan.nextInt();
        System.out.println("What is new citizen's age?");
        int age=scan.nextInt();
        if(age>=65){
            System.out.println("Senior Citizen");
            System.out.println("New seniorCitizens count " +(++seniorCitizen));
            System.out.println("New nonSeniorCitizens count "+ nonSeniorCitizen);
        }else{
            System.out.println("Non-Senior Citizen");
            System.out.println("New seniorCitizens count "+seniorCitizen);
            System.out.println("New nonSeniorCitizens count "+ (++nonSeniorCitizen));
        }





        /*
        Enter current count for seniorCitizens and nonSeniorCitizens:
What is new citizen's age?
Senior Citizen
New seniorCitizens count 8
New nonSeniorCitizens count 8
if citizen's age is more than or equals to 65 then print "Senior Citizen" and increment seniorCitizens variable by 1.

if citizen's age is less than 65 then print "Non-Senior Citizen" and increment nonSeniorCitizens variable by 1.

Last print another message:
"New seniorCitizens count ValueOfVariable"

"New nonSeniorCitizens count ValueOfVariable
         */

    }

}
