// Q: Given a matrix, print the squares of each number in the matrix.
// Perform this Operation without using extra space.

import java.util.Arrays;

public class PrintSquares {

    public static void Solution(int[][] matrix) {
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = matrix[i][j] * matrix[i][j];
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {2, 4, 6},
                {2, 4, 6},
                {2, 4, 6}
        };

        Solution(matrix);

        for(int i = 0; i < matrix.length; i++){
            System.out.print(Arrays.toString(matrix[i])+" ");
            System.out.println();
        }
    }
}


