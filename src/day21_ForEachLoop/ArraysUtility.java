package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5};
        System.out.println(nums);

        System.out.println(Arrays.toString(nums));

        /*
        toString(): converts the array object (single dimensional) to string, returns
        sort():sorts the array in ascending order
               ascending order: smallest to largest
               0 ~ 9
             -10 ~ 10
               a ~ z
         equals(array1, array2):

         copyOf(array, newLength)
         copyOfRange (array, beginningIndex, endingIndex)
         */

        /*
        int [] numbers = {3, 6, 9};
        for(int each : numbers){
        System.out.println(each);
         */

        System.out.println(nums[0]);

        System.out.println("--------------------------------------------------------");


        int[] scores = {95, 100, 55, 65, 85, 78};

        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));

        System.out.println("Min Score: "+scores[0]);
        System.out.println("Max Score: "+scores[scores.length-1]);
        System.out.println("------------------------------------------------------");

        String [] names = {"Gunay", "Anna", "Zuhal", "Ahmet", "Maria", "Sinema"};

        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        String[] words = { "Anna", "ANNA"};
        Arrays.sort(words);

        System.out.println(Arrays.toString(words));

        System.out.println("-------------------------------------------------------------");

        int[] arr1 = {1, 3, 2};
        int[] arr2 = {1, 2, 3};

        boolean r1 = Arrays.equals(arr1, arr2);
        System.out.println(r1);

        System.out.println("----------------------------------------------------");

        char[] ch1 = {'a', 'b', 'c'};
        char[] ch2 = {'b', 'a', 'c'};

        boolean r2=Arrays.equals(ch1, ch2);
        System.out.println(r2);

        Arrays.sort(ch2);
        System.out.println(Arrays.toString(ch2));

        System.out.println("--------------------------------------------------------");










    }
}
