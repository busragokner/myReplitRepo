package day36_Inheritance;

// Encapsulation: hiding the fields by giving private access modifiers
// use getter and setter to read and write the private data

public class Student {
    private String name;
    private int age;
    private char gender;
    private char grade;
    private String schoolName;

    public static boolean isStudent = true;
    public static boolean isHuman = true;



    public Student(String name, int age, char gender, char grade, String schoolName) {
        setName(name); // if we do not use the this method, does not check the conditions
        setAge(age);
        setGender(gender);
        setGrade(grade);
        setSchoolName(schoolName);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<5 || age >90){
            return;
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (!(gender== 'M' || gender == 'F')){
            return;
        }
        this.gender = gender;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        if (!(grade == 'A' || grade=='B' || grade=='C' || grade == 'D' || grade =='F')){
            return;// exist the method
        }
        this.grade = grade;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void study(){
        System.out.println(name+ " is studying.");
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", grade=" + grade +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}
