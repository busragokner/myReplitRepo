package day07_Operators;

public class Casting {
    public static void main(String[] args) {
        float averageScore= 20.5F;
        byte num1= (byte)averageScore;// explicit casting
        short num2= (short)averageScore;// explicit casting
        int num3= (int)averageScore; // explicit casting
        long num4= (long)averageScore;// no casting
        double num5= averageScore;// implicit casting
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("num1"+ " = " +num1);
        System.out.println("num2"+ " = " +num2);


    }
}
