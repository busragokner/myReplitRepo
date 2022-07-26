package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice1 {
    public static void main(String[] args) {


        String[] countries = {"Japan", "Korea", "United States", "Turkey", "United Kingdom", "Canada"};

        ArrayList<String > list = new ArrayList<>(Arrays.asList(countries));// converting array to arrayList

        list.removeIf(p-> p.length() >= 10);

        countries = list.toArray(new String[0]); //converting arrayList to array

        System.out.println(Arrays.toString(countries));



    }
}
