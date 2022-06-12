package day16_ForLooopStringPractice;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String str="aabbcc";
        String result="";

        for (int i = 0; i <= str.length()-1; i++) { // represent the all the index numbers of the str (start from 0)
            String ch = "" + str.charAt(i);

            if (!result.contains(ch)) {

                result += ch;

            }}
            System.out.println(result);



    }
}
