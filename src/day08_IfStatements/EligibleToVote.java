package day08_IfStatements;

public class EligibleToVote {
    public static void main(String[] args) {
        String name = "Josh";
        int age= 38;
        String citizen = "USA";
        boolean isEligilbe= age >=21 && citizen =="USA";


        if (isEligilbe) {
            System.out.println("Eligible"); }
        if(!isEligilbe){
            System.out.println("Not Eligible"); }

    }
}
