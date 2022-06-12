package day16_ForLooopStringPractice;

public class Reverse {
    public static void main(String[] args) {
        String str="Wooden Spoon";
        String result="";// contain the reversed version of str

        /*

        result += str.charAt(str.length()-1);//n
        result += str.charAt(10);
        result += str.charAt(9);
        result += str.charAt(8);
        result += str.charAt(7);
        result += str.charAt(6);
        result += str.charAt(5);
        result += str.charAt(4);
        result += str.charAt(3);
        result += str.charAt(2);
        result += str.charAt(1);
        result += str.charAt(0);

         */




        for (int i = 11; i >=0 ; i--) {
            result+=str.charAt(i);

        } System.out.println(result);


        System.out.println("======================================================");
        String str2="I love Java, Java is fun programming language";

        String result2="";

        for (int i =str2.length()-1; i >=0 ; i--) {
            result2+=str2.charAt(i);//adding each character of result

        }
        System.out.println(result2);



        String str3="Kubra Zumra Ozdil";
        String result3="";

        for (int i =str3.length()-1; i >=0 ; i--) {
            result3+=str3.charAt(i);

        }
        System.out.println(result3);


    }

}
