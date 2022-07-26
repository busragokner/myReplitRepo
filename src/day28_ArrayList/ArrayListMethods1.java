package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods1 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(3);
        numbers.add(4);
        numbers.add(9);
        System.out.println(numbers);

        numbers.add(2, 50);

        System.out.println(numbers);

        System.out.println("--------------------------------------");

        System.out.println(numbers.size());

       int lastIndex = numbers.size() -1 ;
        System.out.println(lastIndex);

        System.out.println("---------------------------------------");

        Integer num = numbers.get(3);

        System.out.println(num);

        System.out.println("----------------------------------------");

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i)); }

        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("Java");
        list.add("C#");
        list.add("Ruby");

        list.set(2, "JavaScript");
        list.set(3, "C++");
        System.out.println(list);

        System.out.println("----------------------------------");


        ArrayList<String> employees = new ArrayList<>();

        employees.add("Suat");
        employees.add("Aygun");
        employees.add("Olga");
        employees.add("Neira");
        employees.add("Ali");
        employees.add("Hulya");
        employees.add("Kaloyan");

        System.out.println(employees);

       /* for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i)); }
        */

        employees.remove(0);

        System.out.println(employees);

        employees.remove(0);

        System.out.println(employees);

        employees.remove(employees.size()-1);

        System.out.println(employees);

        employees.remove("Hulya");

        System.out.println(employees);









        }






    }
