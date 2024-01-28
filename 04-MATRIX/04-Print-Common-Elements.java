// Q : Given two matrics, print common elements from both matrices without any duplication.

public class PrintCommonElements {
    public static void Solution(int[][] matrix1, int[][] matrix2) {

        boolean isFound = false;
        for (int i=0; i< matrix1.length; i++){
            for (int j=0; j< matrix1[i].length; j++){
                int value = matrix1[i][j];
////                if(matrix1[i][j] == value){
////                    break;
////                }
                for (int k=0; k<matrix2.length; k++){
                    isFound = false;
                    for (int l=0; l<matrix2[k].length; l++){
                        if(value == matrix2[k][l]){
                            System.out.print(value + " ");
                            isFound = true;
                            break;
                        }
                    }
                    if(isFound) break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix1 = {
                {1,2,1},
                {9,7,2},
                {7,6,4}
        };
        int[][] matrix2 = {
                {2,6,8,6},
                {0,1,3,9,7},
                {7,2,0},
                {8,3}
        };
        Solution(matrix1, matrix2);
    }
}





