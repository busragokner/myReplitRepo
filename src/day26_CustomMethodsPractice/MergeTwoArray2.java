package day26_CustomMethodsPractice;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class MergeTwoArray2 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6, 7, 8};
        int[] arr3 = ArraysUtility.merge(arr1, arr2);
        System.out.println(Arrays.toString(arr3));

        System.out.println("<-------------------------------------------------------->");

        String[] a1 = {"A", "B", "C"};
        String[] a2 = {"D", "E", "F"};
        String[] result = merge(a1,a2);
        System.out.println(Arrays.toString(result));
       }

    public static int[] merge(int[] arr1, int[] arr2){
        int[] result = {};
        for (int each : arr1) {
            ArraysUtility.addElement(result, each); }

        for (int each : arr2) {
            ArraysUtility.addElement(result, each); }
        return result; }

    public static String[] merge(String [] arr1, String [] arr2){
        String [] result = {};
        for (String each : arr1) {
            ArraysUtility.addElement(result, each); }

        for (String each : arr2) {
            ArraysUtility.addElement(result, each); }
        return result; }



}
