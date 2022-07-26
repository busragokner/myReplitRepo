package day24_CustomMethods_Return;

public class BreakfastTasks {
    public static void main(String[] args) {
        initials("Wooden", "Spoon");
        domain("ozdilbusr54@gmail.com");
        System.out.println("<==================================================>");
        String[]emails= {"josh@gmsil.com", "Jim@yahoo.com", "Elminur@cydeo.com", "Gulsen@gmail.com"};
        for (String email : emails) {
            domain(email); }
        nameOfMonth(12);

    }

    public static void initials(String firstName, String lastName){
       String initial = firstName.charAt(0)+"."+lastName.charAt(0);
       initial= initial.toUpperCase();
        System.out.println("initial = " + initial);
       
    }
    public static void domain(String email){
        String domain = email.substring(email.indexOf("@")+1, email.lastIndexOf("."));
        System.out.println("domain = " + domain);}

    public static void nameOfMonth(int number) {
        String name = "";
        if (number >= 1 && number <= 12) {
            name = (number == 1)? "Jan" : (number == 2)? "Feb" : (number == 3)? "Mar" :
                    (number == 4)? "April" : (number == 5)? "May" : (number == 6)? "June" :
                            (number == 7)? "July" : (number == 8)? "Aug" : (number == 9)? "Sep" :
                                    (number == 10)? "Oct" : (number == 11)? "Nov" : "Dec";

        } else {
            name = "Invalid Number"; }
        System.out.println("Month name: " + name);
    }

    public static void nameOfDay(int number){


    }
    public static void daysInMonth(int number){

    }
}
