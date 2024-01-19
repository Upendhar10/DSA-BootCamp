/*
# Optimal Approach.
 Approach :
 1. Traverse the array, using loops from 1 to n
 2. Check whether
          if (arr[i-1] > arr[i])  return 0
          else return 1;
 3. Print the result.

    - Time => O(n)
    - Space => O(1)
*/

public class CheckSortedorNot {

  //  O - False
  //  1 - True
  // -1 - Initial value of ans. 
  
    public static int isSorted(int n, int []a) {
        int ans = -1;
      
        // Corner case
        if(n<2){
            return ans;
        }
      
        for(int i=1; i<n; i++){
            if(a[i-1] > a[i]){
                ans =  0;
                break;
            }else{
                ans = 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int n = 10;
        int[] arr = {
                26,8,3,4, 6, 6, 4, 7, 10, 9
        };

        System.out.println(isSorted(n,arr));    // 0

    }
}
