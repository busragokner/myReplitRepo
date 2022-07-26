package day21_ForEachLoop;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

       String str="Java";
       char[] chars = str.toCharArray();

        System.out.println(Arrays.toString(chars));

       for (char each : str.toCharArray()){
           System.out.println(each);
       }


       /*
       split(value): returns String array

       "I love learning java programming language".split(" ) ===> {"I", "love", "learning", "java", "programming", "language"}
       "ABC".split("") ===> {"A", "B", "C"}
        */

        String sentence = "Wooden Spoon";
        String[] words = sentence.split(" ");

        System.out.println(Arrays.toString(words));

        System.out.println("=====================================================");

        String email="WoodenSpoon@cydeo.com";

        String[] arr = email.split("@");
        System.out.println(Arrays.toString(arr));

        System.out.println("================================================");

        String s = "Today is nice day. Today is Monday. Today we learn Java";
        String[] s1 = s.split("\\. ");

        System.out.println(Arrays.toString(s1));

        /*
        for(DataType each : Array){      }

         */





    }
}
