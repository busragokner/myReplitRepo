package day28_ArrayList;

public class strongPassword2 {
    public static void main(String[] args) {

        String password = "cLdeo1990@";

        int countUpperCase = 0;
        int countLowerCase = 0;
        int countDigits = 0;
        int countSpecialChar = 0;

        for (int i = 0; i < password.length(); i++) {
            char each = password.charAt(i);

            if (Character.isUpperCase(each)){
                countUpperCase++;
            }else if(Character.isLowerCase(each)){
                countLowerCase++ ;
            }else if (Character.isDigit(each)){
                countDigits++ ;
            }else {
                countSpecialChar++ ; }}

            System.out.println("countSpecialChar = " + countSpecialChar);
            System.out.println("countDigits = " + countDigits);
            System.out.println("countLowerCase = " + countLowerCase);
            System.out.println("countUpperCase = " + countUpperCase);

            boolean hasUpperCase = countUpperCase > 0 ;
            boolean hasLowerCase = countLowerCase > 0 ;
            boolean hasDigits = countDigits > 0 ;
            boolean hasSpecial = countSpecialChar > 0 ;

            boolean strongPassword =password.length()>=8 && hasDigits && hasLowerCase && hasUpperCase && hasSpecial;
            strongPassword = true;

        System.out.println(strongPassword);











    }
}