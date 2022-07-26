package day30_CustomClass;

import java.util.ArrayList;

public class StudentObject {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setInfo("Aygun" , 'F', 39,2210,'A');

        System.out.println(student1);

        Student student2 = new Student();
        student2.setInfo("Busra" , 'F', 39,2210,'A');

        Student student3 = new Student();
        student3.setInfo("Hulya" , 'F', 26,2123,'B');

        Student student4 = new Student();
        student4.setInfo("Elminur" , 'M', 25,5511,'C');

        Student student5 = new Student();
        student5.setInfo("Mert" , 'M', 28,2252,'C');

        Student[] students = {student1,student2,student3,student4,student5};

        for (Student student : students) {
            System.out.println(student); }


        System.out.println("-------------------------------------------------");


        ArrayList<Student> earlyBirds = new ArrayList<>(); //grade:A
        ArrayList<Student> angryBirds = new ArrayList<>();


        for (Student student : students) {
            if (student.grade == 'A'){
                earlyBirds.add(student);
            }else {
                angryBirds.add(student); }
        }

        System.out.println(earlyBirds);
        System.out.println(angryBirds);





    }




}
