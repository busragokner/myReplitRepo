package day20_Array;

import java.util.Arrays;

public class ArrayPractice2 {
    public static void main(String[] args) {

        char[] letters= new char[26];
        for (char i = 'A', j=0; i <= 'Z' && j< letters.length ; i++, j++) {
            letters[j]= i; }
        System.out.println(Arrays.toString(letters));

        /*
        for (int i = 0, j = 'A'; i < letters.length ; i++, j++) {
            letters[i]=(char)j; }
        System.out.println(Arrays.toString(letters));

         */

        /*
        char ch= 'A';
        for (int i = 0; i < letters.length; i++) {
            letters[i] =ch++; }
        System.out.println(Arrays.toString(letters));

         */

        System.out.println("-------------------------------------------------------");

        /*
        Declaring array:
        DataType [] variableName;

        Initializing Array:
        If we do not know the exact data:
        DataType [] variableName = new DataType[length];

        If we know the exact data:
        DataType [] variableName = {Data1, Data2, Data3,.....}

         */







    }
}
