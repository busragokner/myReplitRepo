package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObject {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setInfo("BMW", "X5","WHITE", 2020,25500);

        System.out.println(car1);

        Car car2 = new Car();
        car2.setInfo("MERCEDES","COMPRESOR", "BLACK",2020,45000);
        System.out.println(car2);

        //Car[] cars = {car1,car2};

        ArrayList<Car> carsList = new ArrayList<>();
        carsList.addAll(Arrays.asList(car1,car2));

        for (Car each : carsList) {
            System.out.println(each.brand+" : "+ each.price); }

        System.out.println("------------------------------------------------------");

        carsList.removeIf(p-> p.brand.equals("BMW") && p.year <= 2008);
        carsList.removeIf(p-> p.brand.equals("TOYOTA") && p.year >= 1995 && p.year <=1997);

        System.out.println(carsList);








        }
    }

