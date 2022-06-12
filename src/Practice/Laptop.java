package Practice;

import java.util.Scanner;

public class Laptop {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        double laptopPrice=0;

        System.out.println("Select screen size:");
        double screenSize=scan.nextDouble();

        if(screenSize==13.3){
            laptopPrice+=200;
        }else if(screenSize==15.0){
            laptopPrice+=300;}
        else if(screenSize==17.3){
            laptopPrice+=400;
        }


        System.out.println("Select CPU type:");
        String cpuSize=scan.next();
        if(cpuSize.equals("i3")){
            laptopPrice+=150;
        }else if(cpuSize.equals("i5")){
            laptopPrice+=250;
        }else if(cpuSize.equals("i7")){
            laptopPrice+=350;
        }

        System.out.println("Select RAM size:");
        int ram=scan.nextInt();
        int howManyRam = ram/4;
        laptopPrice+=howManyRam*50;

        System.out.println("Select storage type:");
        String storage=scan.next();
        System.out.println("Enter memory size:");
        int howManyGB =scan.nextInt();

        if (storage.equals("SSD")){
            laptopPrice+= howManyGB/500*100;}
        else if (storage.equals("HDD")){
            laptopPrice+= howManyGB/500*50;}


        System.out.println("Enter screen resolution:");
        String screen=scan.next();
        if(screen.equals("4K")){
            laptopPrice=laptopPrice+200;
        }else if(screen.equals("FULLHD")){
            laptopPrice=laptopPrice+100;
        }

        System.out.println("Laptop price is:"+" $"+laptopPrice);
    }
}
