package day30_CustomClass;

public class Dog {

    public String name;
    public String breed;
    public String color;
    public int age;
    public char gender;
    public String size;

    public void setInfo(String dogName, String dogBreed, int dogAge, char dogGender, String dogSize, String dogColor){
        name = dogName;
        breed = dogBreed;
        age = dogAge;
        gender = dogGender;
        size = dogSize;
        color = dogColor;
    }

    public void eat(){
        System.out.println(name+ " is eating");
    }
    public void bark(){ System.out.println(name+" is barking"); }
    public void drink(){ System.out.println(name+" is drinking"); }


    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                '}';
    }
}
/*
Attributes:
names, age, gender, breed, size, color

Actions:
eat(), play(), bark() ....
 */
