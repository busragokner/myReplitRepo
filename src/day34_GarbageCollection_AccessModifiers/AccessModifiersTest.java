package day34_GarbageCollection_AccessModifiers;

public class AccessModifiersTest {
    public static void main(String[] args) {

        System.out.println(AccessModifiers.publicData);
        System.out.println(AccessModifiers.defaultData);

        // private is not visible outside tah class

        AccessModifiers.method1();
        AccessModifiers.method2();

    }
}
