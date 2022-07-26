package Practice;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {

        ArrayList <String> groups = new ArrayList<>();
        groups.add("Busra");
        groups.add("Adil");
        groups.add("Kubra");
        groups.add("Omer");

        for (int i = 0; i < groups.size(); i++) {
            System.out.println(groups.get(i)); }
        groups.remove("Busra");

        for (int i = 0; i < groups.size(); i++) {
            System.out.println(groups.get(i)); }

        for (String s : groups){
            System.out.println(s);
        }

        System.out.println("----------------------------------");

        String s1 = "Mustafa" ;
        String s2 = new String("Mustafa");
        System.out.println(s1.length());

        System.out.println(s1.charAt(0));

        System.out.println(s2.charAt(2));

        System.out.println(s1.substring(0, 3));

        System.out.println(s2.charAt(s2.length()-1));

        System.out.println(s2.startsWith("Mu"));

        if (s1.equals(s2)){
            System.out.println("esit");
        }








    }
}
