package day27_WrapperClasses;

public class WrapperClassesIntro {
    public static void main(String[] args) {
        int num1 = 200;
        Integer n1 = num1 ; // autoboxing

        int num2 = n1; // unboxing

        System.out.println("------------------------------------------------------------");

        Integer integerValue = 100;

        long longValue = integerValue;

        System.out.println("---------------------------------------------------");

        int num3 = 200 ;
        //Long l2 = num3;

        Byte b1 = 25 ;

        byte a1 = b1 ;
        short a2 = b1;
        int a3 = b1;
        long a4 = b1;


        Integer z = 900;
        Integer y = z;

        System.out.println("--------------------------------------------------------");

        int[] numbers1 = {1,2,3,4,5};
        Integer[] numbers2 = {1,2,3,4,5};





        /*
        Wrapper classes
        1. parse methods: converts String to primitive
        2.valueOf methods: converts String to wrapper class
         */



    }
    /*
    Data Structure:
    1. Array : supports primitives & non-primitives
    2. Collection : ONLY support non-primitives
    3. Map : ONLY support non-primitives
     */


}
