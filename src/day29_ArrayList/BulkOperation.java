package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperation {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        System.out.println(list);

        list.removeAll(Arrays.asList(3,5,8));

        System.out.println(list);

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(100,200,300,400,500,600,700,800,900));

        numbers.retainAll(Arrays.asList(100,200,300));

        System.out.println(numbers);


        ArrayList <String> jobTitles = new ArrayList<>();
        jobTitles.addAll(Arrays.asList("QA", "SDET", "Developer", "QA", "SDET", "Scrum Master", "BA", "BA"));

        jobTitles.retainAll(Arrays.asList("QA", "SDET"));
        System.out.println(jobTitles);

        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        boolean r1 = nums.contains(10);
        boolean r2 = nums.contains(2) && nums.contains(5) && nums.contains(10);

        System.out.println(r2);

        boolean r3 = nums.containsAll(Arrays.asList(2,5,10, 1000));

        System.out.println(r3);

        System.out.println("------------------------------------------------------------------");

        String [] names = {"Josh", "Jack", "Daniel", "Shay", "Breanna"};

        ArrayList<String> nameList = new ArrayList<>(Arrays.asList(names));

        //nameList.addAll(Arrays.asList(names));

        System.out.println(nameList);

        System.out.println("-----------------------------------------------");

        ArrayList<Integer> list2 = new ArrayList<>();
        System.out.println(list2);

        System.out.println("-------------------------------------------------------");

        int[] arr2 = {1,2,3,4,5,6,7,8,9,10};

        ArrayList<Integer> list3 = new ArrayList<>(convertToArrayList(arr2));
        System.out.println(list3);







    }

    public static ArrayList<Integer> convertToArrayList(int[] array){
        ArrayList<Integer> list = new ArrayList<>();

        for (int each : array) {
            list.add(each);}

        return list;
    }
}
