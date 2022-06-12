package day09_IfElseStatement;

public class medianNumber {
    public static void main(String[] args) {
        int a= 10;
        int b= 20;
        int c= 30;
        boolean medianb= a<b && c>b ;
        if (medianb) {
            System.out.println(b+" is the median number. "); }
        boolean mediana= (a>b && c>a) || (a>c && a<b);
        if (mediana) {
            System.out.println(a+ " is the median number. ");
        }
        boolean medianc= a>c && b>c ;// boolean cIsMedian = !mediana  &&  !medianb
        if (medianc) {
            System.out.println(c+ " is the median number. "); }


    }
}
