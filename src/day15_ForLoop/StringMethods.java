package day15_ForLoop;

public class StringMethods {
    public static void main(String[] args) {
        String str="   ";
        boolean r=str.isEmpty();
        System.out.println(r);

        System.out.println("===================================================================");

        boolean r1=str.isBlank();
        System.out.println(r1);

        String str2="Cydeo";
        System.out.println(str2.isBlank());
        System.out.println(str2.isEmpty());

        System.out.println("=============================================");

        String s1="CYDEO";
        String s2="cydeo";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));// buyuk kucuk harfi onemseme

        System.out.println("=============================================================");

        String sentence="My favorite programming language is Java";
        boolean hasCSharp=sentence.contains("C#");
        boolean hasJava=sentence.contains("Java");
        boolean hasJava2=sentence.contains("java");
        boolean hasJava3=sentence.toLowerCase().contains("java");
        boolean r2=sentence.contains("java") || sentence.contains("Java");
        System.out.println(hasCSharp);
        System.out.println(hasJava);
        System.out.println(hasJava3);
        System.out.println("r2 = " + r2);

        System.out.println("===========================================================");

        String input1="I love Java";
        String input2="Java";
        System.out.println( input1.equals(input2));
        System.out.println(input1.equalsIgnoreCase(input2));
        System.out.println(input1.contains("Java"));

        System.out.println("===============================================================");

        String a="Wooden Spoon";
        boolean x=a.startsWith("Woo");
        boolean y=a.endsWith("Spoon");
        boolean z=a.toLowerCase().startsWith("wooden");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
















    }
}
