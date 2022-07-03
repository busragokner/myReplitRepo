package day20_Array;

import java.util.Arrays;

public class ArrayIntro {
    public static void main(String[] args) {
        /*
        Data Structure: to use the data efficiently, store data in organized manner
        1.Array(size is fixed, supports primitives & non primitives)
        2.Collection(size not is fixed, only supports non-primitives)
        3.Map(size not is fixed, only supports non-primitives)
         */

        // create a variable that's capable enough to contain 5 names

        String[] myGroup = new String[5]; // 0~4
        myGroup[0] = "Gunay";
        myGroup[1] = "Neira";
        myGroup[2] = "Suat";
        myGroup[3] = "Hulya";
        myGroup[4] = "Mikael";

        System.out.println("========================================================");

        String [] days= {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        //index:             0        1            2           3          4         5            6

        System.out.println(Arrays.toString(days));

        System.out.println("=========================================================");

        int number = 5;
        if (number<1 || number>7){
            System.err.println("Invalid Number");
            System.exit(0);}

        System.out.println(days[number]);




       // System.out.println(myGroup); //hashcode
        /*
        Arrays Utility:
        class name:Arrays
        package:java.util

        default values:
        non-primitives: null
        primitives:
        byte, short, int, long ===> 0
        float, double ===> 0.0
        boolean ===> false
         */


        System.out.println(Arrays.toString(myGroup));


    }
}
