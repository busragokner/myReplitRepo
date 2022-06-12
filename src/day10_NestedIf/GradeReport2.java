package day10_NestedIf;

public class GradeReport2 {
    public static void main(String[] args) {
        int score = 85;
        if(score >=0 && score <=100){

        String result = (score >=90) && (score<=100)? "Excellent" : (score>=80) && (score <90)? "Great" :
                (score >= 70) && (score <80)? "Good" : (score >= 60) && (score< 70)? "Passed" :"Failed" ;
        System.out.println(result);}
        else {
            System.out.println("Invalid Score");}
    }
}
