package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NthLargestNumber {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,7,8,8));

        int max = Collections.max(list);

        int n = 3;
        for (int i = 0; i < n; i++) {
            list.removeIf(p-> p == max);
        }
        System.out.println(list);


        System.out.println(list);

        int max2 = Collections.max(list);
        list.removeIf(p-> p==max2);

        System.out.println(list);







    }
}
