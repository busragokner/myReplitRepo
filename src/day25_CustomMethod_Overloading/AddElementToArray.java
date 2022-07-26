package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class AddElementToArray {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};
        arr = addInteger(arr, 5);
        System.out.println(Arrays.toString(arr));
        System.out.println("<=============================================================>");

        double[] arr1 = {1.5, 2.5, 3.5, 4.5};
        arr1 = addDouble(arr1, 5.5);
        System.out.println(Arrays.toString(arr1));
        System.out.println("<======================================================>");

        String[] names = {"Tatiana", "Oleksandir", "Cassandra", "Ali"}; // "Neira"
        names = addString(names, "Neira");
        System.out.println(Arrays.toString(names));

        System.out.println("<================================================>");
        char[] chars = {'A', 'B', 'C', 'D'};
        chars = addChar(chars, 'E');
        System.out.println(Arrays.toString(chars));




    }

    public static int[] addInteger(int[] array, int element) {
        int[] result = new int[array.length + 1];

        int i = 0;
        for (int each : array) {
            result[i++] = each;
        }

        result[i] = element;
        return result;

    }

    public static double[] addDouble(double[] array, double element) {
        double[] result = new double[array.length + 1];

        int i = 0;
        for (double each : array) {
            result[i++] = each;
        }
        result[result.length - 1] = element;

        return result;


    }

    public static String[] addString(String[] array, String element) {
        String[] result =new String[array.length + 1];

        int i = 0;
        for (String each : array) {
            result[i++] = each;
        }
        result[result.length - 1] = element;

        return result;
    }
    public static char[] addChar(char[] array, char element){
        char[] result = new char[array.length + 1];
        
        int i = 0;
        for (char each : array) {
            result[i++] = each;}
        result[i] = element;
        return result;

        
        
    }
}