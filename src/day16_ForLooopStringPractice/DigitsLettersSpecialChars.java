package day16_ForLooopStringPractice;

public class DigitsLettersSpecialChars {
    public static void main(String[] args) {
        String str="Cydeo12345School!@#$%WoodenSpoon";
        String digits="";//12345
        String letters="";//CydeoWoodenSpoon
        String specialCharacters="";//!@#$%

        for (int i = 0; i < str.length(); i++) {//i: index number of str (0 ~ last index)

            char ch=str.charAt(i);//ch:each character that we have in str

            if(ch>= '0' && ch <='9'){
                digits+=ch;
            }else if(ch>='A' && ch<='Z'){
                letters+=ch;
            }else if(ch>='a' && ch<='z'){
                letters+=ch;
            }else {
                specialCharacters+=ch;
            }



        }
        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);
        System.out.println("specialCharacters = " + specialCharacters);



    }
}
