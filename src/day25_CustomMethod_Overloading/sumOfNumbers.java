package day25_CustomMethod_Overloading;

public class sumOfNumbers {
    public static void main(String[] args) {
        int sum = sumOf2Numbers(5, 7);
        System.out.println(sum);
        System.out.println(sumOf2Numbers(10, 50));
        sumOf3Numbers(10, 20, 30);
        int sum1 = sumOf3Numbers(10, 20, 30);
        System.out.println(sum1);


    }

    public static int sumOf2Numbers(int num1, int num2){
        return num1 + num2;

    }
    public static int sumOf3Numbers(int num1, int num2, int num3){
        return num1 + num2 + num3 ;
    }
}
