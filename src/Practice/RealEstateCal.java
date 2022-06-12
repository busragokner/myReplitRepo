package Practice;

import java.util.Scanner;

public class RealEstateCal {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int propertyPrice = 0;
        int numberOfBedrooms, garageSpots;
        float metroAccessibility, schoolScore, highwayAccessibility;
        boolean backyard, smoking, garage;

        System.out.println("*****************************************");
        System.out.println("* Welcome to the RealEstate calculator! *");
        System.out.println("*****************************************");

        System.out.println("Enter your property type:");
        String houseType=scan.next();
        if(houseType.equals("Condo")){
            propertyPrice+=50000;
        }else if (houseType.equals("Townhouse")){
            propertyPrice+=75000;
        }else if (houseType.equals("Single Family Home")){
            propertyPrice+=95000;
        }
        System.out.println("How many bedrooms do you have?");
        int howmany=1;
        int oneBed=30000;
        propertyPrice+=30000*howmany;
        System.out.println(propertyPrice);

        System.out.println("Do you have a backyard?");
        backyard=true;
        if(backyard==true){
            propertyPrice+= 5000;
            if(houseType.equals("Condo")){
                System.out.println("Backyard is not available for condo!");
            }

        }


        /*

         */





    }
}
