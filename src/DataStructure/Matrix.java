package DataStructure;

import java.util.Arrays;

public class Matrix {

    public static void main(String[] args) {

        //2D Array
        int[][] matrix = new int[3][3];

        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;

        matrix[1][0] = 4;
        matrix[1][1] = 5;
        matrix[1][2] = 6;

        matrix[2][0] = 7;
        matrix[2][1] = 8;
        matrix[2][2] = 9;

        for(int[] mat : matrix){
            System.out.println(Arrays.toString(mat));
        }


    }
}
