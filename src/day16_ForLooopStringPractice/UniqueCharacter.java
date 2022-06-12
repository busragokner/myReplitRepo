package day16_ForLooopStringPractice;

public class UniqueCharacter {
    public static void main(String[] args) {
        String str="aaabccc";
        String result="";

        for (int i = 0; i <str.length() ; i++) {
            char ch=str.charAt(i);

        if(str.indexOf(ch)==str.lastIndexOf(ch)){

            result +=ch;}

        }
        System.out.println(result);


        String name3="ccchhhkkkklllllooooo";
        String result3="";

        for (int i = 0; i <=name3.length()-1; i++) {
            String ch1=""+name3.charAt(i);

            if(!result3.contains(ch1)){
                result3+=ch1;
            }

        }
        System.out.println(result3);
    }
}
