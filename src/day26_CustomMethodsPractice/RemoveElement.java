package day26_CustomMethodsPractice;

import java.util.Arrays;

public class RemoveElement {

    public static void main(String[] args) {

        int[] numbers = {100, 200, 300, 400, 500, 600};
        numbers = removeElement(numbers, 1);
        System.out.println(Arrays.toString(numbers));





    }
                                     //{1,2,3,4}  ,     2
    public static int[] removeElement(int[] array, int index){

        if (index <0 || index> array.length-1){
            System.err.println("Invalid Index: " +index);
            System.exit(0);
        }
        int[] result = new int[array.length -1];

        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == index){
                continue;
            }
            result[j++] = array[i];

        }

       /* for (int each : array) {
            if (each == array[index]){
                continue; // skip
                 }
            result[j++] = each;
        }

        */
        return result;
    }
}
