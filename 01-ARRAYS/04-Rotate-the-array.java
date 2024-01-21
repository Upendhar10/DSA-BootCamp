/*
    Q : Rotate array by k places
    Array : [1,2,3,4,5]  , k = 3
        1. Left rotate
            k = 1 => [2,3,4,5,1]
            k = 2 => [3,4,5,1,2]
            k = 3 => [4,5,1,2,3]
        2. right rotate
            k = 1 => [5,1,2,3,4]
            k = 2 => [4,5,1,2,3]
            k = 3 => [3,4,5,1,2]

    - We can observe that the result of rotate an array towards left and towards right were different
    - hence, rightRotate != leftRotate

    for left rotate :
    if k < arr.length ,             if k > arr.length
       k = 0 => [1,2,3,4,5]         k = 5  => [1,2,3,4,5]
       k = 1 => [2,3,4,5,1]         k = 6  => [2,3,4,5,1]
       k = 2 => [3,4,5,1,2]         k = 7  => [3,4,5,1,2]
       k = 3 => [4,5,1,2,3]         k = 8  => [4,5,1,2,3]
       k = 4 => [5,1,2,3,4]         k = 9 =>  [5,1,2,3,4]

    for right rotate :
    if k < arr.length ,             if k > arr.length
       k = 0 => [1,2,3,4,5]         k = 5  => [1,2,3,4,5]
       k = 1 => [5,1,2,3,4]         k = 6  => [5,1,2,3,4]
       k = 2 => [4,5,1,2,3]         k = 7  => [4,5,1,2,3]
       k = 3 => [3,4,5,1,2]         k = 8  => [3,4,5,1,2]
       k = 4 => [2,3,4,5,1]         k = 9 =>  [2,3,4,5,1]

       if we observe, the pattern is repeating, even k > arr.length
            hence, we do, k % n , to get exact value w.r.t arr.length

    * Bruteforce Approach :
    Intuition :
        - We can divide the array into two parts using 'k' as a base creteria.
        
    Approach :  // right roatte
        - Traverse the array from n-k to n-1 , print the elements
        - Traverse the array from 0 to k , print the elements

    Complexity :
        - Time : O(n)
        - Space : O(n) , in-case if we store the result in an array

    Optimal Approach :
    Intuition :
        - Initially, we can divide the array into two sub parts (p1) and (p2) based on 'K'
        - We will try to reverse the two parts separately => rev(p1) and rev(p2)
        - Now, if we reverse the two parts rev(p2) and rev(p1) jointly , we will be resulted with our desired array

     Approach :
        - Divide the given array into two parts
            p1 => n-k to n-1
            p2 => 0 to n-k-1
        - reverse elements of p1 and elements p2 separately
            rev(p1)
            rev(p2)
         - Now, Jointly reverse the elements of both rev(p1)  and rev(p2)
            rev(rev(p1) + rev(p2)) or
            rev(rev(p2) + rev(p1))
         - Hence, the given array will be reversed

     Complexities:
        - Time : O(n)
        - Space : O(1)

*/

public class RotateArray {
    public static int[] Bruteforce(int[] arr, int k) {
      int n = arr.length;
      int[] result = new int[n];
        // if K > n
        k = k % n;
        int j = 0;
        for(int i=n-k; i<n; i++){
            result[j++] = arr[i];
        }

        for(int i=0; i<k-1; i++){
           result[j++] = arr[i];
        }
        return result;
    }

    public static void Optimal(int[] arr, int k){

        int n = arr.length;
        k = k % n;

        reverse (arr,n-k,n-1); // 
        reverse(arr,0,n-k-1); // 
        reverse(arr,0, n-1);  // 
    }

  // Helper reverse function
    public static void reverse(int[] arr,int start,int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

  // Main function
    public static void main(String[] args) {
        int[] arr = {-1,-100,3,99};
      
        int[] result = Bruteforce(arr,3);

        for (int num:result){
            System.out.print(num+" ");
        }
       
        Optimal(arr,2);

        for (int num:arr){
            System.out.print(num+" ");
        }

    }
}
