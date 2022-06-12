package day06_PrimitiveTypeCasting;

public class PrimitiveCasting {
    public static void main(String[] args) {
        byte a= 100;
        short b=a;
        //short b =(short)a;
        int c=b;
        //int c =(int)b
        long d= c;
        //long d = (long) c
        float e = d;
        //float e = (float)d
        double f = e;
        // double f= (double)e

        int x= 55;
        short y=(short)x;// explicit casting
        System.out.println(x +" : " + y);

        long j = 1000000;
        short k = (short)j;
        System.out.println(j +" : " + k);

        double l = 2.5;
        float m = (float)l;
        System.out.println(l+" : " + m);

        double n = 10.8;
        int s = (int) n;
        System.out.println(n+" : "+ s);

             double d1= 20.5;
             short s1= (short)d1;
        System.out.println(d1 + " : "+s1);

        float f1 = 30.5F;
        long l1= (long) f1;


        System.out.println("------------------------------------------------");

        int z= 25;
        int h= 24;
        System.out.println(z++);
        System.out.println(z--);
        System.out.println(z);




    }
}
