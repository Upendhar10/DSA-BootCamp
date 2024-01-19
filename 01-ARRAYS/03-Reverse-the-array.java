/*
 Q : Reverse the given array.
        array = [1,2,3,4,5]
       result = [5,4,3,2,1]

       * Bruteforce Approach :
       Algo :
        - create a new ans array
        - Add every element of given array, in the reverse order into the new array
        - print the new ans array.

       Complexity :
            - Time : O(n)
            - Space : O(n)

       * Optimal Approach :
       intuition :
            - We can use the concept of two pointer (i) from start-index and (j) from end-index
            - Then, swap respective elements till start < end
       Approach :
            - Traverse the given array with two pointer
                -  (i) , from 0th index
                -  (j) , from (arr.length-1) index
             - Swap the elements of the respective indexes untill i < j
             - Finally print the array

       Complexity :
            - Time : O(n)
            - Space : O(1)
*/

public class ReverseTheArray {
  // Bruteforce approach
    public static int[] Bruteforce(int[] arr){

        int n = arr.length;

        // create a new array to store the result
        int[] ans  = new int[arr.length];
        int k = 0;    // traversing new array

        for(int i=n-1; i >= 0 ; i--){
            ans[k++] = arr[i];
        }

        return ans;
    }

    public static void Optimal(int[] arr){
        int n = arr.length;

        int i = 0;
        int j = n-1;

        while(i < j){
            // swap
            int temp = arr[i];
            arr[i]   = arr[j];
            arr[j]   = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {

      int[] arr = {12,14,26,89,-1};

       int[] result1 = Bruteforce(arr);

       for (int num: result1){
           System.out.print(num+" ");
       }

        int result2 = Optimal(arr);

        for (int num: result2){
            System.out.print(num+" ");
        }
    }
}
