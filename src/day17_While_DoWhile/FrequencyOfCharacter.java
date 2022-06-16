package day17_While_DoWhile;

public class FrequencyOfCharacter {
    public static void main(String[] args) {
        String str="AAABBBC";
        char ch='C';

        int frequency= 0;

        for (int i = 0; i < str.length(); i++) {// i: indexes of str
            char eachChar=str.charAt(i); // eachChar:each character of str
             // 'A'=='A'
            if (ch==eachChar){ // if given char is matching with the eachChar, then ch is appeared in the string
                frequency++;
            }
        }

        System.out.println(frequency);

    }
}
