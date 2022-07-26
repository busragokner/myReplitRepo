package day27_WrapperClasses;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] array = {1,1,2,3,4,5,5,5,6,7,6,};
        int[] result = removeDuplicates(array);
        System.out.println(Arrays.toString(result));

        System.out.println("--------------------------------------------------");

        String [] words = {"Java", "Java", "Python", "Java", "Java", "C#"};
        words = removeDuplicates(words);
        System.out.println(Arrays.toString(words));

        int[] number = {1,1,1,1,2,3,4,4,4,4,56,7,7};
        //number = Arrays.stream(number).distinct().toArray();
        //System.out.println(Arrays.toString(number));
        number = removeDuplicates(number);
        System.out.println(Arrays.toString(number));


    }

    public static int[] removeDuplicates(int[] array){
        int[] result = {};
        for (int each : array) {  //each : element in the array
            if (!ArraysUtility.contains(result, each)){
                result = ArraysUtility.addElement(result, each); }
        }
        return result;
    }

    public static double[] removeDuplicates(double[] array){
        double[] result = {};
        for (double each : array) {  //each : element in the array
            if (!ArraysUtility.contains(result, each)){
                result = ArraysUtility.addElement(result, each); }
        }
        return result;
    }

    public static char[] removeDuplicates(char[] array){
        char[] result = {};
        for (char each : array) {  //each : element in the array
            if (!ArraysUtility.contains(result, each)){
                result = ArraysUtility.addElement(result, each); }
        }
        return result;
    }

    public static String[] removeDuplicates(String [] array){
        String [] result = {};
        for (String each : array) {  //each : element in the array
            if (!ArraysUtility.contains(result, each)){
                result = ArraysUtility.addElement(result, each); }
        }
        return result;
    }
}
