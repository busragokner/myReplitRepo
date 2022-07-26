package day01_JavaIntro;

import java.util.Arrays;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {

        /*int[] array = {1,2,3,4,5};
        System.out.println(array[0]);
        System.out.println(array[1]);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]); }

         */
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[4];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt(); }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]); }

        mean(arr);








        }
        public static void mean(int[] arr){

        int total = 0;
            for (int i = 0; i < arr.length; i++) {
                total += arr[i]; }
            System.out.println((double) total/ arr.length); }






        }


        /*
        nt max=numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max){
                max = numbers[i];}}
        System.out.println(max);
         */
