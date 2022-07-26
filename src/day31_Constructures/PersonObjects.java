package day31_Constructures;

public class PersonObjects {
    public static void main(String[] args) {

        Person person1 = new Person("Daniel", 'M', 32);
        System.out.println(person1);

        Person person2 = new Person("Adil", 'M', 8);
        System.out.println(person2);

        person2.age = 9;

        System.out.println(person2);
    }
}
