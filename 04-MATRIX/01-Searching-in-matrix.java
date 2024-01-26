// Q: Search for the given element in the matrix and if the element exits prints its index as a result.

public class SearchElementInMatrix {

    public static void Solution(int[][] matrix, int key){

        int [] ans = new int[]{-1,-1};

        for(int i=0; i<matrix.length; i++){
            for (int j = 0; j< matrix[i].length; j++) {
                if (matrix[i][j] == key) {
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }

        if(ans[0] != -1){    // ans[0] != -1 && ans[1] != -1
            System.out.println("Key Element found at : " + "(" + ans[0] +","+ans[1]+")");
        }else {
            System.out.println("Key Element not found");
        }

    }

  // Main function
    public static void main(String[] args) {
        int [][] matrix1 = {
                {12,13,14},
                {89,67,37},
                {87,56,99}
        };
      
        int key = 67;
        Solution(matrix1,key);
    }
}
