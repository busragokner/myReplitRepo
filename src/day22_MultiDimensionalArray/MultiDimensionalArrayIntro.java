package MultiDimensionalArray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MultiDimensionalArrayIntro {
    public static void main(String[] args) {

        String[] group1 = {"John","Joes","James"};
        String[] group2 = {"John","Joes","James"};
        String[] group3 = {"John","Joes","James"};

        String[][] groups = new String[3][]; //index: 0,1,2
        groups[0] = group1;
        groups[1] = group2;
        groups[2] = group3;

        //System.out.println(Arrays.toString(groups)); // is for dimensional arrays only
        System.out.println(Arrays.deepToString(groups));

        System.out.println("<===============================================================>");

        int[][] array2D = {{1, 2}, {3, 4, 5}, {6, 7, 8}};
        for(int i =0;i< array2D.length;i++){
            for(int l=0;l<array2D[i].length;l++){
                System.out.println("here is the "+i+"th array of"+l+"th element: "+array2D[i][l]);
            }
            if(i+1!=array2D.length)
            System.out.println("------------");
        }
        System.out.println(array2D.length);
        for (int i=0;i<array2D[2].length;i++){
            System.out.println("Here is the "+i+"th index: "+array2D[2][i]);
        }

        System.out.println("<======================================================>");


        // index of the element    0 1 2 3    0 1  2  3  4
        int[][] arr2D = {{1,2,3}, {4,5,6,7}, {8,9,10,11,12}};
//index of the array:       0          1              2

        System.out.println(Arrays.deepToString(arr2D));

        System.out.println(Arrays.toString(arr2D[1]));

        System.out.println(arr2D[1][1]);







    }
}
/*
String[] group1 = {"John","Joes","James"}
String[] group2 = {"John","Joes","James"}
String[] group3 = {"John","Joes","James"}

 */
