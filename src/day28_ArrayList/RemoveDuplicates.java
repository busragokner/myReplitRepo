package day28_ArrayList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(10);
        list.add(20);
        list.add(20);
        list.add(20);
        list.add(30);
        list.add(30);
        list.add(30);


        ArrayList<Integer> result = new ArrayList<>();

        for (Integer each : list) {
            if( result.contains(each)){
            continue;}
            result.add(each);
        }
        System.out.println(result);


        /*Set<Integer> set1 = new HashSet<>(list);
        int i=1;
        for (Integer each:set1) {
            System.out.println(i+": "+each);
            i++;}
           */




    }
}
