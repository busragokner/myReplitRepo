package day27_WrapperClasses;

import java.util.Arrays;

public class ReplaceAll {
    public static void main(String[] args) {
        int [] array = {10,10,20,30,40,30,30,30};
        array = replaceAll(array, 30,300);
        System.out.println(Arrays.toString(array));


    }

    public static int[] replaceAll(int[] array, int oldValue, int newValue){
        for (int i = 0; i < array.length; i++) {
            if ( array[i] == oldValue){
                array[i] = newValue; }
        }
        return array; }

    public static double[] replaceAll(double[] array, double oldValue, double newValue){
        for (int i = 0; i < array.length; i++) {
            if ( array[i] == oldValue){
                array[i] = newValue; }
        }
        return array; }

    public static char[] replaceAll(char[] array, char oldValue, char newValue){
        for (int i = 0; i < array.length; i++) {
            if ( array[i] == oldValue){
                array[i] = newValue; }
        }
        return array; }

    public static String[] replaceAll(String [] array, String  oldValue, String  newValue){
        for (int i = 0; i < array.length; i++) {
            if ( array[i].equals(oldValue)){
                array[i] = newValue; }
        }
        return array; }
}
