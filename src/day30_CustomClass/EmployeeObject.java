package day30_CustomClass;

public class EmployeeObject {
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();
        Employee employee4 = new Employee();
        Employee employee5 = new Employee();


        employee1.setInfo("John",2237,'M',"Developer",100000,true);
        employee2.setInfo("Anna",2287,'F',"QA",100000,true);
        employee3.setInfo("David",2290,'M',"QA",45000,false);
        employee4.setInfo("Lina",2298,'F',"Manager",80000,true);
        employee5.setInfo("Kevin",2256,'M',"Senior QA",110000,true);

        Employee[] employees = {employee1,employee2,employee3,employee4,employee5};

        int countFullTime = 0;
        int countPartTime = 0;
        double max = employees[0].salary;
        double min = employees[0].salary;

        for (Employee employee : employees) {
            if (employee.isFullTime){
                countFullTime++;
            }else {
                countPartTime++; }

            if (employee.salary > max){
                max = employee.salary; }
            if (employee.salary < min){
                min = employee.salary; }
        }

        System.out.println("countPartTime = " + countPartTime);
        System.out.println("countFullTime = " + countFullTime);
        System.out.println("min = " + min);
        System.out.println("max = " + max);









    }
}
