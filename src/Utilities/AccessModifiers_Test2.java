package Utilities;

import day34_GarbageCollection_AccessModifiers.AccessModifiers;

public class AccessModifiers_Test2 {
    public static void main(String[] args) {

        System.out.println(AccessModifiers.publicData);
      //  System.out.println(AccessModifiers.defaultData); can not use the outside the package
      //  System.out.println(AccessModifiers.privateData);

        AccessModifiers.method1();
    }
}
