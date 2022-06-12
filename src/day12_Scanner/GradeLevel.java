package day12_Scanner;

public class GradeLevel {
    public static void main(String[] args) {
        byte level=10;
        String result = "";
        if(level <=18 && level>=1){

            switch (level){
                case 6: case 7: case 8:
                    result="Middle School";
                    break;
                case 9: case 10: case 11: case 12:
                    result="High School";
                    break;
                case 13: case 14: case 15: case 16:
                    result="College";
                    break;
                case 17: case 18:
                    result="Grade School";
                    break;
                default://1~5
                    result = "Elementary School"; }
        }else {
            result="Invalid Number";
        }
        System.out.println(result);


    }
}
