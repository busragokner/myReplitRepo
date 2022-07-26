package day24_CustomMethods_Return;

public class ReturnStatement {
    public static void main(String[] args) {
        nameOfDay(8);
    }
    public static void nameOfDay(int number){
        if (number < 1 || number > 7){
            System.out.println("Invalid Number");
            return;}  // exits nameOfDay method
        String name = "";
        name = (number == 1)? "Monday" : (number == 2)? "Tuesday" : (number == 3)? "Wednesday" :
                (number == 4)? "Thursday" : (number == 5)? "Friday" :(number == 6)? "Saturday" : "Sunday" ;
        System.out.println(name);
    }
}
