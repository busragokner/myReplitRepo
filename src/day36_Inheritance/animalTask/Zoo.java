package day36_Inheritance.animalTask;

public class Zoo {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setInfo("Max", "Husky", 'M', 2,"Small", "Black" );
        dog.eat();
        dog.drinking();
        dog.sleep();
        dog.move();
        dog.bark();
        Cat cat = new Cat();
        cat.setInfo("Tarcin","British", 'M',3, "Small","brown");
        cat.eat();
        cat.sleep();
        cat.drinking();
        cat.move();
        cat.meow();
        cat.scratch();
        Tiger tiger = new Tiger();
        tiger.setInfo("Sher", "Bengal", 'M', 4,"Large","Green");
        tiger.eat();
        tiger.sleep();
        tiger.drinking();
        tiger.move();
        tiger.roar();
        tiger.hunt();

        System.out.println(cat);
        System.out.println(tiger);
        System.out.println(dog);




    }
}
