package day05_Concatenation;

public class ShippingAddress {
    public static void main(String[] args) {
        String name = "James King",
                buildingNumber= "1123A",
                streetName = "Jones Branch Dr",
                city= "Mclean",
                state= "VA",
                zipcode="22031A";
        String addrees =name + "\n" + buildingNumber +" "+streetName+ "\n" + city +", "+state +" " + zipcode;
        System.out.println(addrees);

    }
}
