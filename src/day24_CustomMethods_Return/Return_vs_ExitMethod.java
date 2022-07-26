package day24_CustomMethods_Return;

public class Return_vs_ExitMethod {
    public static void main(String[] args) {
        /*
        branching statements:
        continue : skiping the current iteration
        break: exits the loop or switch
        return : exiting the method one(one method , current method)
        System.exit(0) : exits the system(everything will be terminated)
         */
        nameOfMonth(3);
    }

    public static void nameOfMonth(int number) {
        String name = "";
        if (number < 1 || number > 12) {
            System.out.println("Invalid Number");
        System.exit(0);}
            name = (number == 1) ? "Jan" : (number == 2) ? "Feb" : (number == 3) ? "Mar" :
                    (number == 4) ? "April" : (number == 5) ? "May" : (number == 6) ? "June" :
                            (number == 7) ? "July" : (number == 8) ? "Aug" : (number == 9) ? "Sep" :
                                    (number == 10) ? "Oct" : (number == 11) ? "Nov" : "Dec";



        System.out.println("Month name: " + name);
    }
}