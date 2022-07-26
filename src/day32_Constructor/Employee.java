package day32_Constructor;

public class Employee {

    public String name;
    public char gender;
    public String jobTitle;
    public double salary;

    //you will have more options when you create the object.
    public Employee(String name) {
        this.name = name;
    }
    public Employee(String name, char gender){
        //Employee(name)
        this(name);// call the Constructor
        this.gender = gender;
    }

    public Employee(String name, char gender, String jobTitle){
        this(name, gender);
        this.jobTitle = jobTitle;
    }

    public Employee(String name, char gender, String jobTitle, double salary){
        this(name, gender, jobTitle);
        this.salary = salary;
    }







    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }


   /*
    public void method1(){

        System.out.println("Method 1");
    }

    public void method2(){
        method1();
    }

    */

}
