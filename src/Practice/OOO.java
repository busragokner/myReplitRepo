package Practice;

import java.util.Scanner;

public class OOO {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double laptopPrice=0;
        System.out.println("Select storage type:");
        String storage=scan.next();
        System.out.println("Enter memory size:");
        int howManyGB =scan.nextInt();

        if (storage.equals("SSD")){
            laptopPrice= howManyGB/500*100;}
        else if (storage.equals("HDD")){

            laptopPrice= howManyGB/500*50;}
        System.out.println("laptopPrice = " + laptopPrice);
}}
