package DataStructures.Matrix.Practise.Easy;

import java.util.Arrays;

public class TransposeMatrix {

    // Inplace - Only applicable for Square matrix 
    public static void Solution1(int[][] matrix, int rows, int cols) {

        for (int i = 0; i < rows; i++) {
            for (int j = i+1; j < cols; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public static int[][] Solution2(int[][] matrix, int rows, int cols) {
        int[][] result = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }

    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        Solution1(matrix, 3, 3);

        for (int i = 0; i < matrix.length; i++) {
            System.out.print(Arrays.toString(matrix[i]) + " ");
            System.out.println();
        }

        System.out.println();

       int[][] result = Solution2(matrix, 3, 3);

       for (int i = 0; i < result.length; i++) {
           System.out.print(Arrays.toString(result[i]) + " ");
           System.out.println();
       }
    }
}
