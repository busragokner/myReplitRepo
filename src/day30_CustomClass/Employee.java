package day30_CustomClass;

public class Employee {

    public String name ;
    public int ID ;
    public char gender ;
    public String jobTitle;
    public double salary ;
    public boolean isFullTime;


    public void setInfo(String employeeName, int employeeID, char employeeGender, String employeeJobTitle, double employeeSalary, boolean employeeIsFullTime ){

    name = employeeName;
    ID = employeeID;
    gender = employeeGender;
    jobTitle = employeeJobTitle;
    salary = employeeSalary;
    isFullTime = employeeIsFullTime;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", isFullTime=" + isFullTime +
                '}';
    }


    public void work(){
        System.out.println(jobTitle +" "+ name+" is working"); }













}









