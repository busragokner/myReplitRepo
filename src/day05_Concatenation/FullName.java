package day05_Concatenation;

public class FullName {
    public static void main(String[] args) {
        String firstName= "Aaron";
        String lastName= "Daniel";
        String fullName= firstName + " " + lastName;
        int age = 45;
        String jobTitle ="Senior SDET";
        String companyName= "Apple Inc";
        double salary= 100000.58;
        //System.out.println(fullName);
        //Full name of the person is...........
       // System.out.println("Full name of the person is" +" " + firstName + " " + lastName +".");
        // System.out.println("Full name of the person is " + fullName);
        //System.out.println(fullName +" is "+ age + " years old.");
        System.out.println( fullName + " is " + jobTitle + ", works at " + companyName
                +", and "+ fullName +"'s salary is $"+ salary +".");

    }
}
