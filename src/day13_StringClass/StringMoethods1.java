package day13_StringClass;

public class StringMoethods1 {
    public static void main(String[] args) {
        String str1= "   batch 25   ";
               str1= str1.trim();// trim the unnecessary space
        System.out.println(str1);
        System.out.println("-----------------------------------------");


        String str2= "Cydeo School";
        int n1=str2.indexOf("h");// kacinci karakter oldugunu bulma
        System.out.println("n1 = " + n1);

        int n2=str2.indexOf("o");
        System.out.println("n2 = " + n2);

        System.out.println("------------------------------------------------------------");

        String str3="Java Programming Language";
        int n3=str3.indexOf("amm");
        System.out.println("n3 = " + n3);

        int n4=str3.lastIndexOf("g");
        System.out.println("n4 = " + n4); //cumlenin sonundan buluyor









    }
}
