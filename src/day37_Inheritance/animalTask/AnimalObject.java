package day37_Inheritance.animalTask;

public class AnimalObject {

    public static void main(String[] args) {



        Dog dog1 = new Dog("Alex", "Husky", 'M',1,"Small","Black");
        System.out.println(dog1);
        dog1.bark();

        Cat cat1 = new Cat("Love","Siamese", 'F',2,"Large", "Brown");
        System.out.println(cat1);

        Parrot parrot1 = new Parrot("King", "Macaw", 'M',3,"Small","Blue","Colourfull");
        System.out.println(parrot1);
        parrot1.sing();
    }

}
