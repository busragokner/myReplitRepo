package day25_CustomMethod_Overloading;

import Utilities.ArraysUtility;

public class Test2 {
    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5};
        ArraysUtility.printEach(arr1 );

        System.out.println("===============================================");

        int[] n1 = {10,2,3,4,5,6};
        int max1 = ArraysUtility.max(n1);
        System.out.println("max1: "+(max1+5));

        double[] n2 = {2.3, 4.5, 6.6, 7.8, 20.5};
        double  max2= ArraysUtility.max(n2);
        System.out.println("max2 = " + max2);

        System.out.println("<===================================================>");

        int[] a1 = {1,2,3,4,5,6,7};

        boolean r1 = ArraysUtility.contains(a1, 5);




    }
}
