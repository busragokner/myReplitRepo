package day13_StringClass;

import java.util.Scanner;

public class MyInfo {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age=scan.nextInt();

        System.out.println("Enter your gender: ");
        String gender=scan.next();
        scan.nextLine();

        System.out.println("Enter your full name: ");
        String fullName=scan.nextLine();// if the previous scanner method that's used is not nextLine(), then we need to use one more

        System.out.println("Enter your phone number: ");
        long phoneNum=scan.nextLong();

        System.out.println("Enter your zip code: ");
        int zipCode=scan.nextInt();

        scan.nextLine();

        System.out.println("Enter your school name: ");
        String schoolName=scan.nextLine();

        System.out.println("Enter your city name: ");
        String cityName=scan.nextLine();

        System.out.println("Enter your state name: ");
        String stateName=scan.next();
        scan.nextLine();

        System.out.println("Enter your building number: ");
        int buildingNum=scan.nextInt();
        scan.nextLine();

        System.out.println("Enter your street name: ");
        String streetName=scan.nextLine();

        scan.close();
        System.out.println("fullName = " + fullName);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("phoneNum = " + phoneNum);
        System.out.println("Address: \n\t"+buildingNum+" "+streetName +"\n\t"+ cityName+", "+stateName+" "+zipCode);




    }
}
