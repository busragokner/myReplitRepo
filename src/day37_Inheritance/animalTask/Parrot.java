package day37_Inheritance.animalTask;

public class Parrot extends Animal{

    public String parrotWingsColor;

    public Parrot(String name, String breed, char gender, int age, String size, String color, String parrotWingsColor) {
        super(name, breed, gender, age, size, color);
        //this.parrotWingsColor = parrotWingsColor;
    }
    public void sing(){
        System.out.println(name+" is singing");
    }

}
