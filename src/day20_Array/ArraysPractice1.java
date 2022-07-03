package day20_Array;

import java.util.Arrays;

public class ArraysPractice1 {
    public static void main(String[] args) {

        // store teh elements : 10, 20, 50, 70

        int [] number={10, 20, 50, 70}; //size: 4

        System.out.println(Arrays.toString(number));
        System.out.println("-----------------------------------------------------------");

        int [] scores= new int[5];
        scores[1] = 85;
        scores[scores.length -1] = 95;
        scores[3] = 75;
        scores [0] = 65;
        scores [2] = 55;

        System.out.println(Arrays.toString(scores));

        System.out.println("----------------------------------------");

        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August",
        "September", "October", "November", "December"};

        // System.out.println(months[months.length -1]);
        // System.out.println(months[2]);

        for (int i = 0; i < months.length; i++) {
            System.out.println(months[i]);}

            System.out.println("------------------------------------------------------------");

        for (int i = months.length - 1; i >=0 ; i--) {
            System.out.println(months[i]);}





            }

        }


