package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods2 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1000);
        list.add(500);
        list.add(500);
        list.add(50);
        list.add(30);
        list.add(30);

        System.out.println(list);

       Integer num = 500;
       boolean r = list.remove(num);
        System.out.println(list);
        System.out.println(r);
        System.out.println("-------------------------------------------------");

        System.out.println( list.size());

        list.clear();
        System.out.println(list.size());
        System.out.println(list);

        System.out.println("-----------------------------------------");

        ArrayList<Character> characters = new ArrayList<>();

        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');

        int a =characters.indexOf('A');
        int b = characters.lastIndexOf('A'); //karakterin hangi index te oldugunu gosteriyor yani index numarasini print ediyor

        System.out.println(a);
        System.out.println(b);

        System.out.println("--------------------------------------------------");

        boolean r1 = characters.contains('S');
        System.out.println(r1);

        System.out.println("---------------------------------------------------");

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(100);
        list1.add(100);
        list1.add(100);

        ArrayList<Integer> list2 = new ArrayList<>();
        list1.add(100);
        list1.add(100);
        list1.add(200);

        System.out.println(list1.equals(list2));

        System.out.println("-------------------------------------------------");

        boolean r4 = list1.isEmpty();
        System.out.println(r4);

        System.out.println("----------------------------------------------------");

        ArrayList<Integer> numbers = new ArrayList<>();
        // Bulk operation
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8));

        System.out.println(numbers);










    }
}
