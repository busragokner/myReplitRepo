package Utilities;

import java.util.Arrays;

public class ArraysUtility {
    // prints each integer of an integer array in separate lines

    public static void printEach(int[] array){
        for (int each : array) {
            System.out.println(each); } }

    public static void printEach(double[] array){
        for (double each : array) {
            System.out.println(each); } }

    public static void printEach(char[] array){
        for (char each : array) {
            System.out.println(each); } }

    public static void printEach(String[] array){
        for (String each : array) {
            System.out.println(each); } }

    public static int max(int[] numbers){
        Arrays.sort(numbers);
        return numbers[numbers.length - 1];
    }

    public static double max(double[] numbers){
        Arrays.sort(numbers);
        return numbers[numbers.length - 1];
    }

    public static int min(int[] numbers){
        Arrays.sort(numbers);
        return numbers[0];
    }

    public static double min(double[] numbers){
        Arrays.sort(numbers);
        return numbers[0];
    }

    // checks if the given integer is contained in the given boolean. contains(int[], int)

    public static boolean contains(int[] array, int element){
        boolean result = false;

        for (int each : array) {
            if (each == element){
                result = true; }
        }
        return result;
    }

    public static boolean contains(double[] array, double element) {
        boolean result = false;

        for (double each : array) {
            if (each == element) {
                result = true; }
        }
        return result;
    }

    public static boolean contains(char[] array, char element) {
        boolean result = false;

        for (char each : array) {
            if (each == element) {
                result = true; } }

        return result;
    }

    public static boolean contains(String[] array, String element){
        boolean result = false;

        for (String each : array) {
            if (each.equals(element)){
                result = true; }
        }
        return result;
}

    public static int frequencyOfElement(int[] array, int element){
        int count = 0;
        for (int each : array) {
            if (each == element){
                count++ ; } }
        return count;
    }

    public static int frequencyOfElement(double[] array, double element){
        int count = 0;
        for (double each : array) {
            if (each == element){
                count++ ; } }
        return count;
    }

    public static int frequencyOfElement(char[] array, char element){
        int count = 0;
        for (char each : array) {
            if (each == element){
                count++ ; } }
        return count;
    }

    public static int frequencyOfElement(String[] array, String element){
        int count = 0;
        for (String each : array) {
            if (each.equals(element)){
                count++ ; } }
        return count;
    }

    public static int[] addElement(int[] array, int element) {
        int[] result = new int[array.length + 1];

        int i = 0;
        for (int each : array) {
            result[i++] = each;
        }

        result[i] = element;
        return result;

    }

    public static double[] addElement(double[] array, double element) {
        double[] result = new double[array.length + 1];

        int i = 0;
        for (double each : array) {
            result[i++] = each;
        }
        result[result.length - 1] = element;

        return result;


    }

    public static String[] addElement(String[] array, String element) {
        String[] result =new String[array.length + 1];

        int i = 0;
        for (String each : array) {
            result[i++] = each;
        }
        result[result.length - 1] = element;

        return result;
    }

    public static char[] addElement(char[] array, char element){
        char[] result = new char[array.length + 1];

        int i = 0;
        for (char each : array) {
            result[i++] = each;}
        result[i] = element;
        return result;



    }

    public static int[] uniqueElements(int[] array) {
        int[] result = {};

        for (int each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) {
                result = ArraysUtility.addElement(result, each);}
        }
        return result;}

    public static double[] uniqueElements(double[] array) {
        double[] result = {};

        for (double each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) {
                result = ArraysUtility.addElement(result, each);}
        }
        return result;}

    public static char[] uniqueElements(char[] array) {
        char[] result = {};

        for (char each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) {
                result = ArraysUtility.addElement(result, each);}
        }
        return result;}

    public static int[] removeElement(int[] array, int index){

        if (index < 0 || index > array.length){
            System.err.println("Invalid Index Number: "+ index);
            System.exit(0);}

        int[] result = {} ;
        for (int i = 0; i < array.length; i++) {// i: array's index number
            if (i != index){
                result= ArraysUtility.addElement(result, array[i]);
            }

        }
        return result;


    }

    public static String[] removeElement(String[] array, int index){

        if (index < 0 || index > array.length){
            System.err.println("Invalid Index Number: "+ index);
            System.exit(0);}

        String [] result = {} ;
        for (int i = 0; i < array.length; i++) {// i: array's index number
            if (i != index){
                result= ArraysUtility.addElement(result, array[i]); }
        }
        return result; }

    // merge the given two arrays and returns the new array
    public static int[] merge(int[] arr1, int[] arr2){
       // int[] result = new int[arr1.length + arr2.length];

        int[] result = {};

        for (int each : arr1) {
            result = addElement(result, each); }

        for (int each : arr2) {
            result = addElement(result, each); }
        return result; }

    public static double[] merge(double[] arr1, double[] arr2){
        double[] result = {};
        for (double each : arr1) {
            ArraysUtility.addElement(result, each); }

        for (double each : arr2) {
            ArraysUtility.addElement(result, each); }
        return result;

    }

    public static char[] merge(char[] arr1, char[] arr2){
        char[] result = {};
        for (char each : arr1) {
            ArraysUtility.addElement(result, each); }

        for (char each : arr2) {
            ArraysUtility.addElement(result, each); }
        return result;

    }

    public static String[] merge(String [] arr1, String[] arr2){
        String [] result = {};
        for (String each : arr1) {
            ArraysUtility.addElement(result, each); }

        for (String each : arr2) {
            ArraysUtility.addElement(result, each); }
        return result; }

    public static int[] reverse(int[] array){

        int[] result = new int[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = array[i]; }
        return result;

    }

    public static double[] reverse(double[] array){

        double[] result = new double[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = array[i]; }
        return result;

    }

    public static char[] reverse(char[] array){

        char[] result = new char[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = array[i]; }
        return result;

    }

    public static String[] reverse(String [] array){

        String [] result = new String[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = array[i]; }
        return result;

    }

    public static int[] replace(int[] array, int index, int newElement){
        if (index < 0 || index> array.length - 1){
            System.err.println("Invalid index: " + index);
            System.exit(0);}

        array[index] = newElement;
        return array;


    }

    public static double[] replace(double[] array, int index, double newElement){
        if (index < 0 || index> array.length - 1){
            System.err.println("Invalid index: " + index);
            System.exit(0);}

        array[index] = newElement;
        return array; }

    public static char[] replace(char[] array, int index, char newElement){
        if (index < 0 || index> array.length - 1){
            System.err.println("Invalid index: " + index);
            System.exit(0);}

        array[index] = newElement;
        return array;


    }

    public static String[] replace(String [] array, int index, String  newElement){
        if (index < 0 || index> array.length - 1){
            System.err.println("Invalid index: " + index);
            System.exit(0);}

        array[index] = newElement;
        return array; }

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

    public static void isStrongPassword( String password){
        boolean r1 = password.length()>=8 && !password.contains(" ");
        boolean r2= false;  //has upper case
        boolean r3= false;  //has lower case
        boolean r4= false;  // has one special char
        boolean r5= false;  //has digit

        char[] chars = password.toCharArray();

        for (char each : chars) {
            if (Character.isUpperCase(each)){
                r2=true; }
            else if (Character.isLowerCase(each)){
                r3 = true;}
            else if (Character.isDigit(each)){
                r4 = true ;}
            else {   // special char
                r5 = true; }
        }
        boolean isStrongPassword = r1 && r1&& r3&& r4 && r5;
        System.out.println(isStrongPassword);

    }



}



