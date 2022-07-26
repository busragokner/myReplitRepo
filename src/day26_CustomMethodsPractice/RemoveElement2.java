package day26_CustomMethodsPractice;

import Utilities.ArraysUtility;

public class RemoveElement2 {
    public static void main(String[] args) {






    }

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
}
