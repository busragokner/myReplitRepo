package Practice;

import java.util.Scanner;

public class RealEstateCal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int propertyPrice = 0;
        int numberOfBedrooms;




        System.out.println("*****************************************");
        System.out.println("* Welcome to the RealEstate calculator! *");
        System.out.println("*****************************************");

        System.out.println("Enter your property type:");
        String houseType = scan.nextLine();
        if (houseType.equals("Condo")) {
            propertyPrice += 50000;
        } else if (houseType.equals("Townhouse")) {
            propertyPrice += 75000;
        } else if (houseType.equals("Single Family Home")) {
            propertyPrice += 95000;
        }


        System.out.println("How many bedrooms do you have?");
        numberOfBedrooms = scan.nextInt();
        propertyPrice += 30000 * numberOfBedrooms;

        System.out.println("Do you have a backyard?");
        boolean backyard = scan.nextBoolean();

        if (houseType.equals("Condo")) {
            System.out.println("Backyard is not available for condo!");
        }else{
            if (backyard == true) {
                propertyPrice += 5000;
            }

        }

        System.out.println("Do you have garage?");
        boolean garage = scan.nextBoolean();
        if(garage==true) {
            System.out.println("How many spots?");
            int howManySpot = scan.nextInt();
            if (howManySpot > 10) {
                System.out.println("Pardon, it's not public parking!");
            }else{
                propertyPrice += howManySpot * 20000;
            }

            }

        System.out.println("How close is metro station?");
        float metroAccessibility = scan.nextFloat();
        if(metroAccessibility<=1){
            propertyPrice += 10000;
    }else if(metroAccessibility>1 && metroAccessibility<3){

            propertyPrice += 5000;}



        System.out.println("How close is highway?");
        float highwayAccessibility=scan.nextFloat();
        if (highwayAccessibility<=1){
            propertyPrice+=15000;
        }else if (highwayAccessibility>1 && highwayAccessibility<5){
            propertyPrice+=8000;
        }else if (highwayAccessibility>=5 && highwayAccessibility<=20){
            propertyPrice+=4000;
        }

        System.out.println("What's the rating of nearest school?");
        float schoolScore=scan.nextFloat();
        if (schoolScore<=10 && schoolScore>8){
            propertyPrice+=45000;
        }else if (schoolScore<8 && schoolScore>=4){
            propertyPrice+=20000;
        }else {
            propertyPrice+=5000;
        }

        System.out.println("Does any of your family members smoke?");
        boolean smoking=scan.nextBoolean();

        if (smoking==true){
            propertyPrice-=5000;
        }
        System.out.println("Market report has been generated.\nYour estimate market price is: "+propertyPrice+"$");






}}



