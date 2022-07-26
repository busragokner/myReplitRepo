package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WarmUpTask {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8));

        Collections.swap(numbers, 0,numbers.size()-1); // index number not the element

        System.out.println(numbers);

        System.out.println("--------------------------------------------------");

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,0,2,0,3,0,4,0));

        int size = list.size();

        //list.removeIf(p-> p == 0);

        list.removeAll(Arrays.asList(0));
        System.out.println(list);

        int newSize =list.size();
        int totalNumberOfZero = size - newSize;
        System.out.println("totalNumberOfZero = " + totalNumberOfZero);

        for (int i = 0; i < totalNumberOfZero; i++) {
            list.add(0); }
        System.out.println(list);

        System.out.println("-------------------------------------------------------");

        String str = "ABCD123$%#@&456EFG!";

        ArrayList<Character> chars = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            chars.add(str.charAt(i)); }

        ArrayList<Character> letters = new ArrayList<>(chars);
        letters.removeIf(p-> !Character.isLetter(p) ); // remove the characters that are not letters
        System.out.println("letters = " + letters);

        ArrayList<Character> digits = new ArrayList<>(chars);
        digits.removeIf(p-> !Character.isDigit(p));

        System.out.println("digits = " + digits);

        ArrayList<Character> specialCharacter = new ArrayList<>(chars);
        //specialCharacter.removeAll(letters);
        //specialCharacter.removeAll(digits);
        specialCharacter.removeIf(p-> Character.isLetterOrDigit(p));

        System.out.println("specialCharacter = " + specialCharacter);












    }
}
