package day13_StringClass;

public class StringMethods {
    public static void main(String[] args) {

        String word= "Cydeo";
        //    index=  01234
        char thirdChar=word.charAt(3);
        System.out.println("thirdChar = " + thirdChar);
        /*
        char tenthChar= word.charAt(9);
        System.out.println("tenthChar = " + tenthChar);

         */
        String s1="Batch 25 is the best batch." ;
        int totalChars = s1.length();
        System.out.println("totalChars = " + totalChars);
        char lastChar=s1.charAt(s1.length() -1);// last index number
        System.out.println("lastChar = " + lastChar);

        System.out.println("------------------------------------------");

        String str= "wooden spoon";
        str =  str.toUpperCase();
        System.out.println(str);

        String s= "JAVA";
        s=s.toLowerCase();
        System.out.println("s = " + s);

        String sentence="Today is a great day to learn java programming language.";
        sentence=sentence.toUpperCase();
        System.out.println("sentence = " + sentence);










    }
}
