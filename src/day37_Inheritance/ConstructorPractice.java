package day37_Inheritance;

class A{
    public A(int a){
        System.out.println("A");
    }
}

class B extends A{

    public B(){
        super(9);
        //super()  child class MUST called the parent class constructor
        System.out.println("B");
    }
}

public class ConstructorPractice {
    public static void main(String[] args) {
        B obj = new B();

    }
}
