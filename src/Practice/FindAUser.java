package Practice;

import java.util.Scanner;

public class FindAUser {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        //Max Payne" or "Alan Wake",
        System.out.println("Enter full name:");
        String fullName=scan.nextLine();
        String name1="Max Payne";
        String name2="Alan Wake";
        name1.equalsIgnoreCase(fullName);
        name2.equalsIgnoreCase(fullName);
        if(fullName.contains(name1) || fullName.contains(name2) || fullName.equalsIgnoreCase(name1) || fullName.equalsIgnoreCase(name2)){
            System.out.println("User found!");
        }else {
            System.out.println("User not found!");
        }

    }
}
