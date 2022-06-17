package day17_While_DoWhile;

public class FrequencyOfWord {
    public static void main(String[] args) {
        String str="Cat Cat Dog Dog";
        int frequency=0;

        for (int i = 0; i <= str.length()-3; i++) {
            String eachSub= str.substring(i, i+3);
           

            if (eachSub.equals("Cat")){
                frequency++;
            }
        }
        System.out.println(frequency);
        /*
        sentence="JavaJavaJava"
        output=3

        Str = "JavaJava";

        substring:
        1. Java // substring(0, 4)
        2. avaJ // substring(1, 5)
        3. vaJa // substring(2, 2+4)
        4.aJav // substring(3, 3+4)
        5.Java // substring(4, 4+4)
         */







    }
}
