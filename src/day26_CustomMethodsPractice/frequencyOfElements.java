package day26_CustomMethodsPractice;

public class frequencyOfElements {
    public static void main(String[] args) {
        int[] arr = {1,1,1,11,1,2,2,3,3,4,4,1,1,1,1};
        int n = frequencyOfElement(arr,1);
        System.out.println(n);
    }

    public static int frequencyOfElement(int[] array, int element){
        int count = 0;
        for (int each : array) {
            if (each == element){
                count++ ; } }
        return count;
    }

    public static int frequencyOfElement(double[] array, double element){
        int count = 0;
        for (double each : array) {
            if (each == element){
                count++ ; } }
        return count;
    }

    public static int frequencyOfElement(char[] array, char element){
        int count = 0;
        for (char each : array) {
            if (each == element){
                count++ ; } }
        return count;
    }

    public static int frequencyOfElement(String[] array, String element){
        int count = 0;
        for (String each : array) {
            if (each.equals(element)){
                count++ ; } }
        return count;
    }
}
