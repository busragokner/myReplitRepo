package day35_Encapsulation.encapsulation;

public class EmployeeObject {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Aygun",'F',28,110000);
        System.out.println(employee1);

        employee1.setName("Busra");
        System.out.println(employee1);



    }
}
