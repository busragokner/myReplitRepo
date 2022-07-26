package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListIntro {
    public static void main(String[] args) {

        /*
        Array: size is fixed, supports both primitives & non primitives
        Collection : size is dynamic, does not support primitives

        ArrayList: part of the collection.internally uses the array
         */

        ArrayList<Integer> numbers = new ArrayList<Integer>() ;
        ArrayList<String> names = new ArrayList<>();

        System.out.println(numbers.toString());
        System.out.println(names.toString());


    }
}
