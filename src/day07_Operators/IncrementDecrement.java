package day07_Operators;

public class IncrementDecrement {
    public static void main(String[] args) {
        int a=25;
        ++a;
        System.out.println(a);
        --a;

        System.out.println("-------------------------------------");
        int c=100;
        System.out.println(c++);// post increment: first passes the current value, then increases the value by 1
        System.out.println(c);//101
        System.out.println("----------------------------------------------------------------");
        int x= 200;
        System.out.println(--x);// pre decrement
        System.out.println(x--);
        System.out.println(x);

        System.out.println("----------------------------------------------------------------------");
        int y=200;
        System.out.println(y--);
        System.out.println(y);
        System.out.println("-----------------------------------------------------------------------");
        int b=25;
        System.out.println(b++);
        System.out.println(b--);
        System.out.println("------------------------------------------------------------------------");
        int z = 45;
        System.out.println(++z);// 46
        System.out.println(z++);//46
        System.out.println(z);//47

        int q= 30;
        System.out.println(--q);// pre decrement 29
        System.out.println(q--);// post decrement 29
        System.out.println(q);// 28



    }
}
