
// Q : Given two matrix , perform addition of two matrices and store the result in another matrix.

// NOTE : In-order to perform addition of two matrices , two given matrix should be of same size

import java.util.Arrays;

public class MatrixAddition {

    public static int[][] Solution(int[][] matrix1, int[][] matrix2) {
        int n = matrix1.length;
        int m = matrix2.length;

        int[][] result = new int[n][m];

        if(n != m) {
            System.out.println("Addition can be possible.");
        } else {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    result[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] matrix1 = {
                {12, 13, 14},
                {89, 67, 37},
                {87, 56, 99}
        };
        int[][] matrix2 = {
                {12, 13, 14},
                {89, 67, 37},
                {87, 56, 99}
        };

        int[][] result = Solution(matrix1, matrix2);

        for(int i=0; i<matrix1.length; i++){
            System.out.print(Arrays.toString(result[i])+" ");
            System.out.println();
        }
    }
}


