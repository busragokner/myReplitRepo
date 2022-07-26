package day23_CustomMethods_Void;

public class CustomMethodsWithParameters {
    public static void main(String[] args) {
        //oddOrEven();
        // public static void displayValue(int num){} num is parameter.

        oddOrEven(2); // the method demands additional info to complete its task
        ageOfPerson(1988);
        printsNumbers(1000, 2000);

    }
    public static void oddOrEven(int number){
        if (number % 2 ==0){
            System.out.println(number+" is the even number.");
        }else {
            System.out.println(number+" is the odd number.");
        } }

        public static void ageOfPerson(int birthYear){

        int age = 2021 - birthYear;
            System.out.println("Your age is : "+age);
        }

        public static void printsNumbers(int x, int y){

            }





}
